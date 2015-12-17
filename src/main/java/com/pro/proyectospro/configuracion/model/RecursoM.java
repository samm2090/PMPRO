package com.pro.proyectospro.configuracion.model;

import com.pro.proyectospro.configuracion.domain.Recurso;
import com.pro.proyectospro.configuracion.domain.RecursoExample;
import com.pro.proyectospro.configuracion.herencia.IDatosPersona;
import com.pro.proyectospro.configuracion.herencia.Model;
import com.pro.proyectospro.configuracion.mapper.RecursoMapper;
import com.pro.proyectospro.configuracion.util.DefaultRecordFactory;

public class RecursoM extends Model<Recurso, RecursoExample, RecursoMapper> implements IDatosPersona {
	//OVERRIDE
	@Override
	protected Recurso getDefaultRecord() {
		return DefaultRecordFactory.getRecursoDefault();
	}

	@Override
	protected RecursoExample newExample() {
		return new RecursoExample();
	}
	
	@Override
	protected Class<RecursoMapper> getMapperClass() {
		return RecursoMapper.class;
	}
		
	@Override
	public Integer getCodigo() {
		return getRecord().getCodigo();
	}
	//CONSTRUCTORES
	public RecursoM() {
		super();
	}
	
	public RecursoM(int codigo) {
		super(codigo);
	}
	
	public RecursoM(Recurso record) {
		super(record);
	}

	@Override
	protected void setActivo(Boolean activo) {
		
		getRecord().setActivo(activo);
	}
	
	//ADICIONALES
	@Override
	public Integer getFKDatosPersona() {
		return getRecord().getCoddatospersona();
	}
	
}