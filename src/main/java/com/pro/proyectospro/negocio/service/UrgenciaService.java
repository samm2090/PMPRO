package com.pro.proyectospro.negocio.service;

import java.util.ArrayList;

import com.pro.proyectospro.configuracion.domain.Urgencia;
import com.pro.proyectospro.configuracion.model.UrgenciaM;
import com.pro.proyectospro.negocio.iservice.IUrgenciaService;

public class UrgenciaService implements IUrgenciaService{

	@Override
	public ArrayList<Urgencia> listaUrgencias() throws Exception {
		UrgenciaM urgenciam = new UrgenciaM();
		return (ArrayList<Urgencia>) urgenciam.getCrud().selectAll();
	}
	

}
