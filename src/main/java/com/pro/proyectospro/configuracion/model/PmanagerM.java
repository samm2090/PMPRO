package com.pro.proyectospro.configuracion.model;

import com.pro.proyectospro.configuracion.domain.Pmanager;
import com.pro.proyectospro.configuracion.domain.PmanagerExample;
import com.pro.proyectospro.configuracion.herencia.IDatosPersona;
import com.pro.proyectospro.configuracion.herencia.Model;
import com.pro.proyectospro.configuracion.mapper.PmanagerMapper;
import com.pro.proyectospro.configuracion.util.DefaultRecordFactory;

public class PmanagerM extends Model<Pmanager, PmanagerExample, PmanagerMapper> implements IDatosPersona{
	//OVERRIDE
	@Override
	protected Pmanager getDefaultRecord() {
		return DefaultRecordFactory.getPmanagerDefault();
	}

	@Override
	protected PmanagerExample newExample() {
		return new PmanagerExample();
	}

	@Override
	protected Class<PmanagerMapper> getMapperClass() {
		return PmanagerMapper.class;
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
	public PmanagerM() {
		super();
	}
	
	public PmanagerM(int codigo) {
		super(codigo);
	}
	
	public PmanagerM(Pmanager record) {
		super(record);
	}
	//ADICIONALES
	@Override
	public Integer getFKDatosPersona() {
		return getRecord().getCoddatospersona();
	}
	
	
}