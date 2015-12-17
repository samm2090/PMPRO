package com.pro.proyectospro.negocio.iservice;

import java.util.ArrayList;

import com.pro.proyectospro.configuracion.domain.Atarea;

public interface IAtareaService {
	
	public String registrarTarea(Atarea tarea) throws Exception;

	public ArrayList<Atarea> listarTareasxFase(int codRecurso, int codArea,int codProyecto) throws Exception;
	
	public int comenzarTarea(int codTarea) throws Exception;
	
	public int terminarTarea(int codTarea) throws Exception;
}
