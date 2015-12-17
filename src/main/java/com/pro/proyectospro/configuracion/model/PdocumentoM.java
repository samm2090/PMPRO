package com.pro.proyectospro.configuracion.model;

import java.util.List;

import com.pro.proyectospro.configuracion.domain.Pdocumento;
import com.pro.proyectospro.configuracion.domain.PdocumentoExample;
import com.pro.proyectospro.configuracion.herencia.Model;
import com.pro.proyectospro.configuracion.mapper.PdocumentoMapper;
import com.pro.proyectospro.configuracion.util.DefaultRecordFactory;

public class PdocumentoM extends Model<Pdocumento, PdocumentoExample, PdocumentoMapper> {
	//OVERRIDE
	@Override
	protected Pdocumento getDefaultRecord() {
		return DefaultRecordFactory.getPdocumentoDefault();
	}

	@Override
	protected PdocumentoExample newExample() {
		return new PdocumentoExample();
	}

	@Override
	protected Class<PdocumentoMapper> getMapperClass() {
		return PdocumentoMapper.class;
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
	public PdocumentoM() {
		super();
	}
	
	public PdocumentoM(int codigo) {
		super(codigo);
	}
	
	public PdocumentoM(Pdocumento record) {
		super(record);
	}
	//ADICIONALES
	public PdocumentoM getDocumentoV1() {
		return new PdocumentoM(getRecord().getCoddocumento1());
	}
	
	public List<Pdocumento> getListaHistorial() {
		PdocumentoExample example = new PdocumentoExample();
		example.createCriteria().andCoddocumento1EqualTo(getRecord().getCoddocumento1());
		return getManagedMapper().selectByExample(example);
	}
	
}