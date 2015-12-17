package com.pro.proyectospro.configuracion.model;

import com.pro.proyectospro.configuracion.domain.Atarea;
import com.pro.proyectospro.configuracion.domain.AtareaExample;
import com.pro.proyectospro.configuracion.herencia.Model;
import com.pro.proyectospro.configuracion.mapper.AtareaMapper;
import com.pro.proyectospro.configuracion.util.DefaultRecordFactory;


public class AtareaM extends Model<Atarea, AtareaExample, AtareaMapper> {
	//OVERRIDE
	@Override
	protected Atarea getDefaultRecord() {
		return DefaultRecordFactory.getAtareaDefault();
	}
	
	@Override
	protected AtareaExample newExample() {
		return new AtareaExample();
	}
	
	@Override
	protected Class<AtareaMapper> getMapperClass() {
		return AtareaMapper.class;
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
	public AtareaM() {
		super();
	}
	
	public AtareaM(int codigo) {
		super(codigo);
	}
	
	public AtareaM(Atarea record) {
		super(record);
	}
	//ADICIONALES
}