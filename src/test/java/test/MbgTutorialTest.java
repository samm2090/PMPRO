package test;

import org.junit.BeforeClass;
import org.junit.Test;

import com.pro.proyectospro.configuracion.domain.Datospersona;
import com.pro.proyectospro.configuracion.domain.Usuario;
import com.pro.proyectospro.configuracion.domain.UsuarioExample;
import com.pro.proyectospro.configuracion.model.DatospersonaM;
import com.pro.proyectospro.configuracion.model.GerenteM;
import com.pro.proyectospro.configuracion.model.UsuarioM;

public class MbgTutorialTest {
	
	@BeforeClass
	public static void setUp() throws Exception {
		
	}
	
	@Test
	public void insertAByPrimaryKey() {
		DatospersonaM dpm = new DatospersonaM();
		dpm.getRecord().setNombre("Juan");
		dpm.getRecord().setApellido("Perez");
		dpm.getRecord().setCorreo("jperez@cibertec.com.pe");
		dpm.getRecord().setDireccion("calle ramadal 141");
		dpm.getRecord().setDni("45989652");
		dpm.getRecord().setTelefono("2289563");
	
		System.out.println("codigosspppppp");
		System.out.println(dpm.getCodigo());
		dpm.getCrud().insertSelectiveThis();
		System.out.println(dpm.getCodigo());
		
		//TODO hacer insert usuario
		Integer codInsertado = dpm.getCodigo();
		GerenteM gm = new GerenteM();
		gm.getRecord().setCoddatospersona(codInsertado);
		gm.getRecord().setCodusuario(1);//TODO
		gm.getCrud().insertSelectiveThis();
		
		Datospersona dp = dpm.getCrud().get(codInsertado);
		
		System.out.println("se inserto: "+ dp.getCodigo()+" "+ dp.getNombre());
//		assertEquals(dpm.getCrud().get(dpm.getCodigo()).getNombres(),"Juan" );
	}
	
	@Test
	public void updateByPrimaryKey() {
		Datospersona dp = new DatospersonaM().getCrud().selectAll().get(0);
		DatospersonaM dpm = new DatospersonaM(dp);
		dpm.getRecord().setDireccion("nueva direccion amaru 111");
		dpm.getCrud().updateSelectiveThis();
		
		dp = dpm.getCrud().get( dpm.getCodigo() );
		
		System.out.println("se actualiz� direcci�n: "+ dp.getCodigo()+" "+ dp.getDireccion());
		
	}
	
	@Test
	public void select() {
		DatospersonaM dpm = new DatospersonaM();
		dpm.getRecord().setNombre("Maron");
		dpm.getRecord().setApellido("Five");
		dpm.getRecord().setCorreo("m5@cibertec.com.pe");
		dpm.getRecord().setDireccion("calle monge 141");
		dpm.getRecord().setDni("7583654");
		dpm.getRecord().setTelefono("4123456");
		
		dpm.getCrud().insertSelectiveThis();
		
		for (Datospersona dp : new DatospersonaM().getCrud().selectAll()) {
			System.out.println(dp.getCodigo() + " " + dp.getNombre());
		}
		
	}
	
	@Test
	public void prueba(String[] args){
		
		UsuarioM usuarioM = new UsuarioM();
		usuarioM.getRecord().setUser("macevedo");
		usuarioM.getRecord().setPassword("1234");
		UsuarioExample example = new UsuarioExample();
		
		example.createCriteria().andUserEqualTo(usuarioM.getRecord().getUser()).andPasswordEqualTo(usuarioM.getRecord().getPassword());
		
		
		Usuario usuario=null;
		try{
		usuario=  (Usuario)usuarioM.getManagedMapper().selectByExample(example).get(0);
		}
		catch(Exception e){
			
		}
		
		if(usuario == null) {
			System.out.println("nada");
		}
		else{
			System.out.println(usuario.getUser());
		}
	}
	
}