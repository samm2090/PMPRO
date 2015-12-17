package com.pro.proyectospro.configuracion.util;

import java.util.Date;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

public class MyJavaTypeResolver extends JavaTypeResolverDefaultImpl {
	
	public MyJavaTypeResolver() {
		super();
	}
	
	@Override
	public FullyQualifiedJavaType calculateJavaType(IntrospectedColumn arg0) {
		
		FullyQualifiedJavaType tipoCalculado = super.calculateJavaType(arg0);
		
		boolean esDate = tipoCalculado.equals(new FullyQualifiedJavaType(Date.class.getName()));	
		
		return esDate ? new FullyQualifiedJavaType(String.class.getName()) : tipoCalculado;
	}
	
}
