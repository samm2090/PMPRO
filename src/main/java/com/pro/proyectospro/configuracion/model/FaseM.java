package com.pro.proyectospro.configuracion.model;
import com.pro.proyectospro.configuracion.domain.Fase;
import com.pro.proyectospro.configuracion.domain.FaseExample;
import com.pro.proyectospro.configuracion.herencia.Model;
import com.pro.proyectospro.configuracion.mapper.FaseMapper;
import com.pro.proyectospro.configuracion.util.DefaultRecordFactory;

public class FaseM extends Model<Fase, FaseExample,FaseMapper>{
	//OVERRIDE
	@Override
	protected Fase getDefaultRecord() {
		return DefaultRecordFactory.getFaseDefault();
	}

	@Override
	protected FaseExample newExample() {
		return new FaseExample();
	}

	@Override
	protected Class<FaseMapper> getMapperClass() {
		return FaseMapper.class;
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
		public FaseM() {
			super();
		}
		
		public FaseM(int codigo) {
			super(codigo);
		}
		
		public FaseM(Fase record) {
			super(record);
		}
	//ADICIONALES
}