package com.pro.proyectospro.configuracion.model;

import com.pro.proyectospro.configuracion.domain.Portafolio;
import com.pro.proyectospro.configuracion.domain.PortafolioExample;
import com.pro.proyectospro.configuracion.herencia.Model;
import com.pro.proyectospro.configuracion.mapper.PortafolioMapper;
import com.pro.proyectospro.configuracion.util.DefaultRecordFactory;

public class PortafolioM extends Model<Portafolio, PortafolioExample, PortafolioMapper> {
	//OVERRIDE
	@Override
	protected Portafolio getDefaultRecord() {
		return DefaultRecordFactory.getPortafolioDefault();
	}

	@Override
	protected PortafolioExample newExample() {
		return new PortafolioExample();
	}

	@Override
	protected Class<PortafolioMapper> getMapperClass() {
		return PortafolioMapper.class;
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
	public PortafolioM() {
		super();
	}
	
	public PortafolioM(int codigo) {
		super(codigo);
	}
	
	public PortafolioM(Portafolio record) {
		super(record);
	}
	//ADICIONALES
}