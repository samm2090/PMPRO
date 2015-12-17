package com.pro.proyectospro.configuracion.model;

import com.pro.proyectospro.configuracion.domain.Interesado;
import com.pro.proyectospro.configuracion.domain.InteresadoExample;
import com.pro.proyectospro.configuracion.herencia.IDatosPersona;
import com.pro.proyectospro.configuracion.herencia.Model;
import com.pro.proyectospro.configuracion.mapper.InteresadoMapper;
import com.pro.proyectospro.configuracion.util.DefaultRecordFactory;

public class InteresadoM extends Model<Interesado, InteresadoExample, InteresadoMapper> implements IDatosPersona {
	//OVERRIDE
	@Override
	protected Interesado getDefaultRecord() {
		return DefaultRecordFactory.getInteresadoDefault();
	}

	@Override
	protected InteresadoExample newExample() {
		return new InteresadoExample();
	}

	@Override
	protected Class<InteresadoMapper> getMapperClass() {
		return InteresadoMapper.class;
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
	public InteresadoM() {
		super();
	}
	
	public InteresadoM(int codigo) {
		super(codigo);
	}
	
	public InteresadoM(Interesado record) {
		super(record);
	}
	//ADICIONALES
	@Override
	public Integer getFKDatosPersona() {
		return getRecord().getCoddatospersona();
	}
}