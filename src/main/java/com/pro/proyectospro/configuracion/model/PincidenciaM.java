package com.pro.proyectospro.configuracion.model;

import com.pro.proyectospro.configuracion.domain.Pincidencia;
import com.pro.proyectospro.configuracion.domain.PincidenciaExample;
import com.pro.proyectospro.configuracion.herencia.Model;
import com.pro.proyectospro.configuracion.mapper.PincidenciaMapper;
import com.pro.proyectospro.configuracion.util.DefaultRecordFactory;

public class PincidenciaM extends Model<Pincidencia, PincidenciaExample, PincidenciaMapper> {
	//OVERRIDE
	@Override
	protected Pincidencia getDefaultRecord() {
		return DefaultRecordFactory.getPincidenciaDefault();
	}

	@Override
	protected PincidenciaExample newExample() {
		return new PincidenciaExample();
	}

	@Override
	protected Class<PincidenciaMapper> getMapperClass() {
		return PincidenciaMapper.class;
	}

	@Override
	protected void setActivo(Boolean activo) {
		getRecord().setActivo(activo);
	}

	@Override
	public Integer getCodigo() {
		return getRecord().getCodigo();
	}
	//CONTRUCTORES
	public PincidenciaM() {
		super();
	}
	
	public PincidenciaM(int codigo) {
		super(codigo);
	}
	
	public PincidenciaM(Pincidencia record) {
		super(record);
	}
	//ADICIONALES
}