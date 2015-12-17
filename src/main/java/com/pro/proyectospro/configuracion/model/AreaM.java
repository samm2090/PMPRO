package com.pro.proyectospro.configuracion.model;

import com.pro.proyectospro.configuracion.domain.Area;
import com.pro.proyectospro.configuracion.domain.AreaExample;
import com.pro.proyectospro.configuracion.herencia.Model;
import com.pro.proyectospro.configuracion.mapper.AreaMapper;
import com.pro.proyectospro.configuracion.util.DefaultRecordFactory;

public class AreaM extends Model<Area, AreaExample, AreaMapper> {
	//OVERRIDE
	@Override
	protected Area getDefaultRecord() {
		return DefaultRecordFactory.getAreaDefault();
	}

	@Override
	protected AreaExample newExample() {
		return new AreaExample();
	}
	
	@Override
	protected Class<AreaMapper> getMapperClass() {
		return AreaMapper.class;
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
	public AreaM() {
		super();
	}
	
	public AreaM(int codigo) {
		super(codigo);
	}
	
	public AreaM(Area record) {
		super(record);
	}
	//ADICIONALES
	
}