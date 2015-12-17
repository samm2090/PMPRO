package com.pro.proyectospro.configuracion.model;

import com.pro.proyectospro.configuracion.domain.Precursoxgrupot;
import com.pro.proyectospro.configuracion.domain.PrecursoxgrupotExample;
import com.pro.proyectospro.configuracion.herencia.Model;
import com.pro.proyectospro.configuracion.mapper.PrecursoxgrupotMapper;
import com.pro.proyectospro.configuracion.util.DefaultRecordFactory;

public class PrecursoxgrupotM extends Model<Precursoxgrupot, PrecursoxgrupotExample, PrecursoxgrupotMapper> {
	//OVERRIDE
	@Override
	protected Precursoxgrupot getDefaultRecord() {
		return DefaultRecordFactory.getPrecursoxgrupotDefault();
	}

	@Override
	protected PrecursoxgrupotExample newExample() {
		return new PrecursoxgrupotExample();
	}
	
	@Override
	protected Class<PrecursoxgrupotMapper> getMapperClass() {
		return PrecursoxgrupotMapper.class;
	}
		
	@Override
	public Integer getCodigo() {
		return null;
	}
	//CONSTRUCTORES
	public PrecursoxgrupotM() {
		super();
	}
	
	public PrecursoxgrupotM(int codigo) {
		super(codigo);
	}
	
	public PrecursoxgrupotM(Precursoxgrupot record) {
		super(record);
	}

	@Override
	protected void setActivo(Boolean activo) {
		
		getRecord().setActivo(activo); 
	}
	
	//ADICIONALES
	
}