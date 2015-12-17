package com.pro.proyectospro.configuracion.model;
import com.pro.proyectospro.configuracion.domain.Estado;
import com.pro.proyectospro.configuracion.domain.EstadoExample;
import com.pro.proyectospro.configuracion.herencia.Model;
import com.pro.proyectospro.configuracion.mapper.EstadoMapper;
import com.pro.proyectospro.configuracion.util.DefaultRecordFactory;

public class EstadoM extends Model<Estado,EstadoExample, EstadoMapper> {
	//OVERRIDE
	@Override
	protected Estado getDefaultRecord() {
		return DefaultRecordFactory.getEstadoDefault();
	}

	@Override
	protected EstadoExample newExample() {
		return new EstadoExample();
	}

	@Override
	protected Class<EstadoMapper> getMapperClass() {
		return EstadoMapper.class;
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
	public EstadoM(){
		
		super();
	}
	public EstadoM(int codigo) {
		super(codigo);
	}
	
	public EstadoM(Estado record) {
		super(record);
	}
	//ADICIONALES
}