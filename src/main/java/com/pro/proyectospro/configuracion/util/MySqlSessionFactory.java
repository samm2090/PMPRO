package com.pro.proyectospro.configuracion.util;

import java.io.Reader;
import java.sql.Connection;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySqlSessionFactory {
	private static SqlSessionFactory FACTORY;
	private static Enviroment ENVIROMENT = Enviroment.persisted;
	private static boolean TEST = false;
	enum Enviroment {
		development(true, false), persisted(false, true);
		boolean ejecutarScript;
		boolean autocommited;
		Enviroment(boolean ejecutarScript, boolean autocommited) {
			this.ejecutarScript = ejecutarScript;
			this.autocommited = autocommited;
		}
	}
	
	public static void setTestEnviroment() {
		TEST = true;
		ENVIROMENT = Enviroment.development;
	}
	
	public static boolean isTest() {
		return TEST;
	}
	
	private static void init() {
		Reader reader = null;
		SqlSession session = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			reader = Resources.getResourceAsReader("com/pro/proyectospro/configuracion/util/MyBatisConfig.xml");
			FACTORY = new SqlSessionFactoryBuilder().build(reader,ENVIROMENT.toString());
			System.out.println("FACTORY CREADA");
			reader.close();
			if(ENVIROMENT.ejecutarScript) {
				session = FACTORY.openSession();
				System.out.println("SESSION ABIERTA");
				Connection conn = session.getConnection();
				reader = Resources.getResourceAsReader("CreateDB.sql");
				ScriptRunner runner = new ScriptRunner(conn);
				runner.setLogWriter(null);
				runner.runScript(reader);
				System.out.println("SCRIPT CORRIDO");
			}
		} catch(Exception e){ e.printStackTrace();}
		finally {
			try {
				if(session!=null ){
					session.close();
				}
				if(reader!=null ){
					reader.close();
				}
			} catch (Exception e2) {e2.printStackTrace();}
		} 
	}
	
	public static SqlSession openSession() {
		if(FACTORY == null) {
			init();
		}
		return FACTORY.openSession(ENVIROMENT.autocommited);
	}
	
	public static void main(String[] args) {
		openSession();
	}
	
}