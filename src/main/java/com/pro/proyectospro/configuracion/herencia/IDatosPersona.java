package com.pro.proyectospro.configuracion.herencia;

import com.pro.proyectospro.configuracion.model.DatospersonaM;

public interface IDatosPersona {
	
	Integer getFKDatosPersona();
	
	default DatospersonaM getDatosPersonaM() {
		return new DatospersonaM(getFKDatosPersona());
	}
	
}
