package com.pro.proyectospro.configuracion.model;

import com.pro.proyectospro.configuracion.domain.Proyecto;
import com.pro.proyectospro.configuracion.domain.ProyectoExample;
import com.pro.proyectospro.configuracion.herencia.Model;
import com.pro.proyectospro.configuracion.mapper.ProyectoMapper;
import com.pro.proyectospro.configuracion.util.DefaultRecordFactory;

public class ProyectoM extends Model<Proyecto, ProyectoExample, ProyectoMapper> {

	@Override
	protected Proyecto getDefaultRecord() {
		return DefaultRecordFactory.getProyectoDefault();
	}

	@Override
	protected ProyectoExample newExample() {
		return new ProyectoExample();
	}

	@Override
	protected Class<ProyectoMapper> getMapperClass() {
		return ProyectoMapper.class;
	}

	@Override
	protected void setActivo(Boolean activo) {
		getRecord().setActivo(activo);
	}

	@Override
	public Integer getCodigo() {
		return getRecord().getCodigo();
	}
	
	public ProyectoM() {
		super();
	}
	
	public ProyectoM(int codigo) {
		super(codigo);
	}
	
	public ProyectoM(Proyecto record) {
		super(record);
	}
	//ADICIONALES
	
	
}