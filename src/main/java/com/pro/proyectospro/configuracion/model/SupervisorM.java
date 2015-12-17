package com.pro.proyectospro.configuracion.model;

import com.pro.proyectospro.configuracion.domain.Supervisor;
import com.pro.proyectospro.configuracion.domain.SupervisorExample;
import com.pro.proyectospro.configuracion.herencia.IDatosPersona;
import com.pro.proyectospro.configuracion.herencia.Model;
import com.pro.proyectospro.configuracion.mapper.SupervisorMapper;
import com.pro.proyectospro.configuracion.util.DefaultRecordFactory;

public class SupervisorM extends Model<Supervisor, SupervisorExample, SupervisorMapper> implements IDatosPersona{

	@Override
	protected Supervisor getDefaultRecord() {
		return DefaultRecordFactory.getSupervisorDefault();
	}

	@Override
	protected SupervisorExample newExample() {
		return new SupervisorExample();
	}

	@Override
	protected Class<SupervisorMapper> getMapperClass() {
		return SupervisorMapper.class;
	}

	@Override
	protected void setActivo(Boolean activo) {
		getRecord().setActivo(activo);
	}

	@Override
	public Integer getCodigo() {
		return getRecord().getCodigo();
	}
	
	public SupervisorM() {
		super();
	}
	
	public SupervisorM(int codigo) {
		super(codigo);
	}
	
	public SupervisorM(Supervisor record) {
		super(record);
	}
	//ADICIONALES

	@Override
	public Integer getFKDatosPersona() {
		
		return getRecord().getCoddatospersona();
	}
	
	
}