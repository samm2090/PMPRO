package com.pro.proyectospro.negocio.iservice;

import java.util.ArrayList;


import com.pro.proyectospro.configuracion.domain.Recurso;

public interface IRecursoService {

	ArrayList<Recurso> listarRecursos() throws Exception;
	
	String obtenerNombreRecurso(int codigo) throws Exception;
	
	String crearGrupoTrabajo(int codAtarea,int codRecurso) throws Exception;
}
