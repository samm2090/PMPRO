package com.pro.proyectospro.configuracion.model;

import com.pro.proyectospro.configuracion.domain.Pmanagerproyecto;
import com.pro.proyectospro.configuracion.domain.PmanagerproyectoExample;
import com.pro.proyectospro.configuracion.herencia.Model;
import com.pro.proyectospro.configuracion.mapper.PmanagerproyectoMapper;
import com.pro.proyectospro.configuracion.util.DefaultRecordFactory;

public class PmanagerproyectoM extends Model<Pmanagerproyecto, PmanagerproyectoExample, PmanagerproyectoMapper> {
	//OVERRIDE
	@Override
	protected Pmanagerproyecto getDefaultRecord() {
		return DefaultRecordFactory.getPmanagerproyectoDefault();
	}

	@Override
	protected PmanagerproyectoExample newExample() {
		return new PmanagerproyectoExample();
	}

	@Override
	protected Class<PmanagerproyectoMapper> getMapperClass() {
		return PmanagerproyectoMapper.class;
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
	public PmanagerproyectoM() {
		super();
	}
	
	public PmanagerproyectoM(int codigo) {
		super(codigo);
	}
	
	public PmanagerproyectoM(Pmanagerproyecto record) {
		super(record);
	}
	//ADICIONALES
}