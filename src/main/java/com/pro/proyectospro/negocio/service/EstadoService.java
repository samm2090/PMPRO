package com.pro.proyectospro.negocio.service;

import java.util.ArrayList;

import com.pro.proyectospro.configuracion.domain.Estado;
import com.pro.proyectospro.configuracion.model.EstadoM;
import com.pro.proyectospro.negocio.iservice.IEstadoService;

public class EstadoService implements IEstadoService {

	@Override
	public ArrayList<Estado> listarEstados() throws Exception {
		ArrayList<Estado> lista = new ArrayList<Estado>();
		
		EstadoM estadoM = new EstadoM();
		lista = (ArrayList<Estado>) estadoM.getCrud().selectAll();		
		
		return lista;
	}

}
