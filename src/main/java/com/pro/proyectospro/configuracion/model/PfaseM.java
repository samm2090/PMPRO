package com.pro.proyectospro.configuracion.model;

import com.pro.proyectospro.configuracion.domain.Pfase;
import com.pro.proyectospro.configuracion.domain.PfaseExample;
import com.pro.proyectospro.configuracion.herencia.Model;
import com.pro.proyectospro.configuracion.mapper.PfaseMapper;
import com.pro.proyectospro.configuracion.util.DefaultRecordFactory;

public class PfaseM extends Model<Pfase, PfaseExample, PfaseMapper> {
	//OVERRIDE
	@Override
	protected Pfase getDefaultRecord() {
		return DefaultRecordFactory.getPfaseDefault();
	}

	@Override
	protected PfaseExample newExample() {
		return new PfaseExample();
	}

	@Override
	protected Class<PfaseMapper> getMapperClass() {
		return PfaseMapper.class;
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
	public PfaseM() {
		super();
	}
	
	public PfaseM(int codigo) {
		super(codigo);
	}
	
	public PfaseM(Pfase record) {
		super(record);
	}
	//ADICIONALES
}