package com.pro.proyectospro.configuracion.herencia;

import java.util.List;
import java.util.function.Function;

import org.apache.ibatis.session.SqlSession;

import com.pro.proyectospro.configuracion.util.MySqlSessionFactory;
/** Permite hacer operaciones con la base de datos. Encapsula POJO Record, POJO Mappper. Usa POJO Example <br>
 * Un objeto que herede de esta clase tiene un API de 4 m�todos.<br>
 *		Integer getCodigo();//Devuelve el primary key.<br>
 *		Crud <T> getCrud();//Acceso a m�todos con autocommit y cierre de Session.<br>
 *		<M> getMapper();//Acceso a m�todos sin comint ni cierre de Sesion.<br>
 *		void commit();//Sirve para confirmar lo que se trabaje con getMapper.
 *		void rollback();//Sirve para revertir lo que se trabaje con getMapper.
 *		void closeSession();//Sirve para cerrar session con getMapper.
 *		<R> getRecord();//Acceso a campos de la BD.<br>
 * Crud debe implementarse con m�todos del getMapper, consumiendo al Record y al c�digo en las operaciones b�sicas.<br>
 * 6 m�todos a hacer override. 3 constructores. Implementarlo ocupa 60 lineas de c�digo en promedio.
 * Luego esta clase que implemente modelo puede definir m�todos de navegaci�n usando otras clases modelo o su propio <br>
 * Mapper.
 * 
 * @author J. Armando Cordova P.
 * */
public abstract class Model<T,E,M extends MyMapper<T, E>> implements ManagedMapperListener{
	//CAMPOS PRIVADOS (en orden de independencia)
	/**Sessi�n de la cual instanciaremos mappers*/
	private SqlSession session;
	/**Acceso a m�todos de la BD. Necesita commit y cierre de conecci�n*/
	private M simpleMapper;
	/**Acceso a m�todos de la BD con commit y cierre de connecci�n*/
	private final ManagedMapper managedMapper;
	/**M�todos de ejecuci�n inmediata: Autocommit y Cierre de conecci�n*/
	private final Crud crud;
	/**Refleja un registro de la BD */
	private final T record;
	
	//CONSTRUCTORES (IMPLEMENTAR LOS 3 CONSTRUCTORES)
	public Model(){
		this.record = getDefaultRecord();
		this.simpleMapper = newMapper();
		this.managedMapper = new ManagedMapper();
		this.crud = new Crud();
	}
	
	public Model(T record){
		this.record = record;
		this.simpleMapper = newMapper();
		this.managedMapper = new ManagedMapper();
		this.crud = new Crud(); 
	}
	
	public Model(int codigo){
		this.simpleMapper = newMapper();
		this.managedMapper = new ManagedMapper();
		this.crud = new Crud();
		this.record = crud.get(codigo);
	}
	//METODOS PRIVADOS (4)
	private M newMapper() {
		openSession();
		try {
			return getSession().getMapper(getMapperClass());
		} catch(Exception e) {
			System.out.println("Error en getMapper clase Model tratando de instanciar la clase "
					+ getMapperClass().getSimpleName());
			e.printStackTrace();
			return null;
		}
	}
	
	private void inactivar(){// para el delete del crud
		setActivo(false);
	}
	
	private SqlSession openSession(){
		if(session != null){
			session.close();
		}
		session = MySqlSessionFactory.openSession();
		return session;
	}
	
	private SqlSession getSession(){
		if(session == null){
			openSession();
		}
		return session;
	}
	//METODOS INTERNOS (4) (HACER OVERRIDE A 4)
	protected abstract T getDefaultRecord();//para instanciar Record vacio
	
	protected abstract E newExample();//para selectAll del crud
	
	protected abstract Class<M> getMapperClass();//para instanciar Mapper
	
	protected abstract void setActivo(Boolean codigo);//para delete del crud
	// METODOS PUBLICOS(8) (HACER OVERRIDE 1)
	public abstract Integer getCodigo();//OVERRIDE
	
	public T getRecord(){
		return record;
	}
	
	public Crud getCrud() {
		return this.crud;
	}

	public MyMapper<T, E> getMapper() {
		if(this.simpleMapper == null){
			this.simpleMapper = newMapper();
		}
		return this.simpleMapper;
	}

	public MyMapper<T, E> getManagedMapper() {
		return this.managedMapper;
	}
	
	public void commit(){
		getSession().commit(true);
	}
	
	public void rollback(){
		getSession().rollback(true);
	}
	
	public void closeSession() {
		simpleMapper = null;
		session.close();
		session = null;
	}
	//INNER CLASS
	public class Crud {
		//Derivados
		public T get(int codigo) {
			return getManagedMapper().selectByPrimaryKey(codigo);
		}
		public List<T> selectAll() {
			return getManagedMapper().selectByExample(newExample());
		}
		public int insertSelectiveThis() {
			int i = -1;
			i = getManagedMapper().insertSelective(getRecord());
			return i;
		}
		public int insertThis() {
			int i =-1;
			i=getManagedMapper().insert(getRecord());
			return i;
		}
		public int updateSelectiveThis() {
			int i=-1;
			i=getManagedMapper().updateByPrimaryKeySelective(getRecord());
			return i;
		}
		public int deleteLogicoThis() {
			int i=-1;
			inactivar();
			i=updateSelectiveThis();
			return i;
		}
		
	}
	
	public class ManagedMapper implements MyMapper<T, E>{
		//B�sicos.
		@Override
		public List<T> selectByExample(E example) {
			List<T> list = null;
			try {
				list = getMapper().selectByExample(example);
//				getSession().commit();
			} finally {
				closeSession();
			}
			return list;
		}
		@Override
		public int countByExample(E example) {
			int i = -1;
			try {
				i = getMapper().countByExample(example);
//				getSession().commit();
			} finally {
				closeSession();
			}
			return i;
		}
		@Override
		public int insert(T record) {
			int i= -1;
			try {
				insertListener();
				setActivo(true);
				getMapper().insert(record);
				getSession().commit();
				i=1;
			} 
			catch(Exception e)
			{
				System.out.println("Fallando en model insert"+e.getMessage());
				i = -1;
			}
			
			finally {
				closeSession();
			}
			return i;
		}
		@Override
		public int insertSelective(T record) {
			int i= -1;
			try {
				insertListener();
				setActivo(true);
				getMapper().insertSelective(record);
				getSession().commit();
				i=1;
			} 
			catch(Exception e)
			{
				System.out.println("Fallando en model insert selective"+e.getMessage());
				i=-1;
			}
			finally {
				closeSession();
			}
			return i;
		}
		@Override
		public T selectByPrimaryKey(Integer id) {
			T t = null;
			try {
				t = getMapper().selectByPrimaryKey(id);
				getSession().commit();
			} finally {
				closeSession();
			}
			return t;
		}
		@Override
		public int updateByExampleSelective(T record, E example) {
			int i = -1;
			try {
				i=getMapper().updateByExampleSelective(record, example);
				getSession().commit();
				
			} finally {
				closeSession();
			}
			return i;
		}
		@Override
		public int updateByExample(T record, E example) {
			int i = -1;
			try {
				i=getMapper().updateByExample(record, example);
				getSession().commit();
			} finally {
				closeSession();
			}
			return i;
		}
		@Override
		public int updateByPrimaryKeySelective(T record) {
			int i = -1;
			try {
				i=getMapper().updateByPrimaryKeySelective(record);
				getSession().commit();
			} finally {
				closeSession();
			}
			return i;
		}
		@Override
		public int updateByPrimaryKey(T record) {
			int i = -1;
			try {
				i=getMapper().updateByPrimaryKeySelective(record);
				getSession().commit();
			} finally {
				closeSession();
			}
			return i;
		}
	}
	//Metodos adicionales.
	public void printAllIds(Function<T,Model<T, E, M>> recordToModel) {
		String claseRecord = getClass().getSimpleName().substring(0, getClass().getSimpleName().length()-1);
		getCrud().selectAll().forEach(record -> System.out.println( claseRecord + " " + recordToModel.apply(record).getCodigo() ));
	}
	
}
interface ManagedMapperListener {
	default void insertListener(){}
	default void updateListener(){}
	default void deleteListener(){}
}