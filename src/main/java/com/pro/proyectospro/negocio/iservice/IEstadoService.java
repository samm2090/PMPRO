package com.pro.proyectospro.negocio.iservice;

import java.util.ArrayList;

import com.pro.proyectospro.configuracion.domain.Estado;

public interface IEstadoService {
	ArrayList<Estado> listarEstados() throws Exception;
}
