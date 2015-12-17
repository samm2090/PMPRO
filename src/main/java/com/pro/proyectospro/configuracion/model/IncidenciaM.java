package com.pro.proyectospro.configuracion.model;
import com.pro.proyectospro.configuracion.domain.Incidencia;
import com.pro.proyectospro.configuracion.domain.IncidenciaExample;
import com.pro.proyectospro.configuracion.herencia.Model;
import com.pro.proyectospro.configuracion.mapper.IncidenciaMapper;
import com.pro.proyectospro.configuracion.util.DefaultRecordFactory;

public class IncidenciaM extends Model<Incidencia,IncidenciaExample, IncidenciaMapper> {
	//OVERRIDE
	@Override
	protected Incidencia getDefaultRecord() {
		return DefaultRecordFactory.getIncidenciaDefault();
	}
	
	@Override
	protected IncidenciaExample newExample() {
		return new IncidenciaExample();
	}
	
	@Override
	protected Class<IncidenciaMapper> getMapperClass() {
		return IncidenciaMapper.class;
	}
	
	@Override
	protected void setActivo(Boolean activo) {
		getRecord().setActivo(activo);
	}
	
	@Override
	public Integer getCodigo() {
		return getRecord().getCodigo();
	}
	//CONSTRUCTOR
	public IncidenciaM() {
		super();
	}
	
	public IncidenciaM(int codigo) {
		super(codigo);
	}
	
	public IncidenciaM(Incidencia record) {
		super(record);
	}
	//ADICIONALES
}