package com.pro.proyectospro.configuracion.model;
import com.pro.proyectospro.configuracion.domain.Gerente;
import com.pro.proyectospro.configuracion.domain.GerenteExample;
import com.pro.proyectospro.configuracion.herencia.Model;
import com.pro.proyectospro.configuracion.mapper.GerenteMapper;
import com.pro.proyectospro.configuracion.util.DefaultRecordFactory;

public class GerenteM extends Model<Gerente, GerenteExample, GerenteMapper> {
	//OVERRIDE
	
	@Override
	protected Gerente getDefaultRecord() {
		return DefaultRecordFactory.getGerenteDefault();
	}

	@Override
	protected GerenteExample newExample() {
		return new GerenteExample();
	}

	@Override
	protected Class<GerenteMapper> getMapperClass() {
		return GerenteMapper.class;
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
	public GerenteM() {
		super();
	}
		
	public GerenteM(int codigo) {
		super(codigo);
	}
		
	public GerenteM(Gerente record) {
		super(record);
	}
	//ADICIONALES
    
}