package com.pro.proyectospro.configuracion.model;

import com.pro.proyectospro.configuracion.domain.Datospersona;
import com.pro.proyectospro.configuracion.domain.DatospersonaExample;
import com.pro.proyectospro.configuracion.herencia.Model;
import com.pro.proyectospro.configuracion.mapper.DatospersonaMapper;
import com.pro.proyectospro.configuracion.util.DefaultRecordFactory;

public class DatospersonaM extends Model<Datospersona, DatospersonaExample, DatospersonaMapper> {
	//OVERRIDE
	@Override
	protected Datospersona getDefaultRecord() {
		return DefaultRecordFactory.getDatospersonaDefault();
	}
	
	@Override
	protected DatospersonaExample newExample() {
		return new DatospersonaExample();
	}
	
	@Override
	protected Class<DatospersonaMapper> getMapperClass() {
		return DatospersonaMapper.class;
	}
	
	@Override
	protected void setActivo(Boolean activo) {
		return;
	}
	
	@Override
	public Integer getCodigo() {
		return getRecord().getCodigo();
	}
	//CONSTRUCTORES
	public DatospersonaM() {
		super();
	}
	
	public DatospersonaM(int codigo) {
		super(codigo);
	}
	
	public DatospersonaM(Datospersona record) {
		super(record);
	}
	//ADICIONALES
	
}