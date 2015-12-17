package com.pro.proyectospro.configuracion.model;

import com.pro.proyectospro.configuracion.domain.Tarea;
import com.pro.proyectospro.configuracion.domain.TareaExample;
import com.pro.proyectospro.configuracion.herencia.Model;
import com.pro.proyectospro.configuracion.mapper.TareaMapper;
import com.pro.proyectospro.configuracion.util.DefaultRecordFactory;

public class TareaM extends Model<Tarea, TareaExample, TareaMapper> {
	//OVERRIDE
	@Override
	protected Tarea getDefaultRecord() {
		return DefaultRecordFactory.getTareaDefault();
	}

	@Override
	protected TareaExample newExample() {
		return new TareaExample();
	}
	
	@Override
	protected Class<TareaMapper> getMapperClass() {
		return TareaMapper.class;
	}
		
	@Override
	public Integer getCodigo() {
		return getRecord().getCodigo();
	}
	//CONSTRUCTORES
	public TareaM() {
		super();
	}
	
	public TareaM(int codigo) {
		super(codigo);
	}
	
	public TareaM(Tarea record) {
		super(record);
	}

	@Override
	protected void setActivo(Boolean activo) {
		
		getRecord().setActivo(activo);
	}
	
	//ADICIONALES
	
}