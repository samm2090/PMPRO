package com.pro.proyectospro.configuracion.model;

import com.pro.proyectospro.configuracion.domain.Urgencia;
import com.pro.proyectospro.configuracion.domain.UrgenciaExample;
import com.pro.proyectospro.configuracion.herencia.Model;
import com.pro.proyectospro.configuracion.mapper.UrgenciaMapper;
import com.pro.proyectospro.configuracion.util.DefaultRecordFactory;

public class UrgenciaM extends Model<Urgencia, UrgenciaExample, UrgenciaMapper> {
	//OVERRIDE
	@Override
	protected Urgencia getDefaultRecord() {
		return DefaultRecordFactory.getUrgenciaDefault();
	}

	@Override
	protected UrgenciaExample newExample() {
		return new UrgenciaExample();
	}
	
	@Override
	protected Class<UrgenciaMapper> getMapperClass() {
		return UrgenciaMapper.class;
	}
		
	@Override
	public Integer getCodigo() {
		return getRecord().getCodigo();
	}
	//CONSTRUCTORES
	public UrgenciaM() {
		super();
	}
	
	public UrgenciaM(int codigo) {
		super(codigo);
	}
	
	public UrgenciaM(Urgencia record) {
		super(record);
	}

	@Override
	protected void setActivo(Boolean activo) {
		
	}
	
	//ADICIONALES
	
}