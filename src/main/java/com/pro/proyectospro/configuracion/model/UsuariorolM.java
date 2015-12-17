package com.pro.proyectospro.configuracion.model;

import com.pro.proyectospro.configuracion.domain.Rol;
import com.pro.proyectospro.configuracion.domain.Usuario;
import com.pro.proyectospro.configuracion.domain.Usuariorol;
import com.pro.proyectospro.configuracion.domain.UsuariorolExample;
import com.pro.proyectospro.configuracion.herencia.Model;
import com.pro.proyectospro.configuracion.mapper.UsuariorolMapper;
import com.pro.proyectospro.configuracion.util.DefaultRecordFactory;

public class UsuariorolM extends Model<Usuariorol, UsuariorolExample, UsuariorolMapper> {
	//OVERRIDE
	@Override
	protected Usuariorol getDefaultRecord() {
		return DefaultRecordFactory.getUsuariorolDefault();
	}

	@Override
	protected UsuariorolExample newExample() {
		return new UsuariorolExample();
	}
	
	@Override
	protected Class<UsuariorolMapper> getMapperClass() {
		return UsuariorolMapper.class;
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
	public UsuariorolM() {
		super();
	}
	
	public UsuariorolM(int codigo) {
		super(codigo);
	}
	
	public UsuariorolM(Usuariorol record) {
		super(record);
	}
	//ADICIONALES
	
	public Rol obtenerRolActual(Usuario usuario){
		Rol rol=null;
		try{
		UsuariorolExample example = new UsuariorolExample();
		example.createCriteria().andCodusuarioEqualTo(usuario.getCodigo()).andActivoEqualTo(true);
		
		Usuariorol usuarioRol = getManagedMapper().selectByExample(example).get(0);
		
		RolM rolm = new RolM();
		
		
		rol=rolm.getManagedMapper().selectByPrimaryKey(usuarioRol.getCodrol());
		}
		catch(Exception e){
			
		}
		return rol;
	}
}