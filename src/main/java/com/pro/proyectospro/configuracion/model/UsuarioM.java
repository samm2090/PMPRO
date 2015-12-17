package com.pro.proyectospro.configuracion.model;

import com.pro.proyectospro.configuracion.domain.Usuario;
import com.pro.proyectospro.configuracion.domain.UsuarioExample;
import com.pro.proyectospro.configuracion.herencia.Model;
import com.pro.proyectospro.configuracion.mapper.UsuarioMapper;
import com.pro.proyectospro.configuracion.util.DefaultRecordFactory;

public class UsuarioM extends Model<Usuario, UsuarioExample, UsuarioMapper> {
	//OVERRIDE
	@Override
	protected Usuario getDefaultRecord() {
		return DefaultRecordFactory.getUsuarioDefault();
	}

	@Override
	protected UsuarioExample newExample() {
		return new UsuarioExample();
	}
	
	@Override
	protected Class<UsuarioMapper> getMapperClass() {
		return UsuarioMapper.class;
	}
	
	@Override
	protected void setActivo(Boolean activo) {
		getRecord().setActivo(activo);
	}
	
	@Override
	public Integer getCodigo() {
		return getRecord().getCodigo();
	}
	//CONSTRUCTORES
	public UsuarioM() {
		super();
	}
	
	public UsuarioM(int codigo) {
		super(codigo);
	}
	
	public UsuarioM(Usuario record) {
		super(record);
	}
	
//ADICIONALES

	public Usuario validarUsuario() {
		UsuarioM usuarioM = new UsuarioM();
		UsuarioExample example = new UsuarioExample();
		
		example.createCriteria().andUserEqualTo(getRecord().getUser()).andPasswordEqualTo(getRecord().getPassword());
		Usuario usuario=null;
		try{
		usuario=  usuarioM.getManagedMapper().selectByExample(example).get(0);
		}catch(Exception e){
			
		}
	
		return usuario;
	}
	

	
	@Override
	public void insertListener() {
		// setPassword(  password encriptada  ) TODO
		
	}
	
}