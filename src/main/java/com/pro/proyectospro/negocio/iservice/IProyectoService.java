package com.pro.proyectospro.negocio.iservice;

import java.util.List;

import com.pro.proyectospro.configuracion.domain.Atarea;
import com.pro.proyectospro.configuracion.domain.Fase;
import com.pro.proyectospro.configuracion.domain.Pfase;
import com.pro.proyectospro.configuracion.domain.Portafolio;
import com.pro.proyectospro.configuracion.domain.Proyecto;

public interface IProyectoService {
	public String registrarProyecto(Proyecto proyecto) throws Exception;

	public List<Proyecto> listarProyectos() throws Exception;

	public List<Fase> listarFasesxProyecto(int codigo) throws Exception;

	public String agregarPFases(Proyecto proyecto) throws Exception;
	
	public List<Pfase> listarPfases(Proyecto proyecto) throws Exception;

	public Pfase buscarPfase(int codigo) throws Exception;
	
	public int tareasCompletas(Proyecto proyecto) throws Exception;
	
	public List<Proyecto> listarProyectosxRecurso(int codUsuario,int codPortafolio) throws Exception;

	public List<Atarea> listarTareasXFaseSup(int id1, Object object);
	
	public List<Proyecto> proyectosXPortafolio(Portafolio portafolio)
			throws Exception;

	public double porcetanjeAvance(int cod_proy) throws Exception;

	public List<Atarea> listarTareas(int cod_proy) throws Exception;
	


}
