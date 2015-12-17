package com.pro.proyectospro.configuracion.model;

import com.pro.proyectospro.configuracion.domain.Rol;
import com.pro.proyectospro.configuracion.domain.RolExample;
import com.pro.proyectospro.configuracion.herencia.Model;
import com.pro.proyectospro.configuracion.mapper.RolMapper;
import com.pro.proyectospro.configuracion.util.DefaultRecordFactory;

public class RolM extends Model<Rol, RolExample, RolMapper> {
	//OVERRIDE
	@Override
	protected Rol getDefaultRecord() {
		return DefaultRecordFactory.getRolDefault();
	}

	@Override
	protected RolExample newExample() {
		return new RolExample();
	}
	
	@Override
	protected Class<RolMapper> getMapperClass() {
		return RolMapper.class;
	}
		
	@Override
	public Integer getCodigo() {
		return getRecord().getCodigo();
	}
	//CONSTRUCTORES
	public RolM() {
		super();
	}
	
	public RolM(int codigo) {
		super(codigo);
	}
	
	public RolM(Rol record) {
		super(record);
	}

	@Override
	protected void setActivo(Boolean activo) {
		getRecord().setActivo(activo);
	}
	
	//ADICIONALES
	

}