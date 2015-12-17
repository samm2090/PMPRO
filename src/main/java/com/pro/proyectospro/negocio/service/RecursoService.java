package com.pro.proyectospro.negocio.service;

import java.util.ArrayList;

import com.pro.proyectospro.configuracion.domain.Datospersona;
import com.pro.proyectospro.configuracion.domain.Recurso;
import com.pro.proyectospro.configuracion.model.DatospersonaM;
import com.pro.proyectospro.configuracion.model.PrecursoxgrupotM;
import com.pro.proyectospro.configuracion.model.RecursoM;
import com.pro.proyectospro.negocio.iservice.IRecursoService;

public class RecursoService implements IRecursoService{

	@Override
	public ArrayList<Recurso> listarRecursos() throws Exception {
		ArrayList<Recurso> lista = new  ArrayList<Recurso>();
		
		RecursoM recurso = new RecursoM();

		lista=(ArrayList<Recurso>) recurso.getCrud().selectAll();
		
		return lista;

	}

	@Override
	public String obtenerNombreRecurso(int codigo) throws Exception {
		DatospersonaM datos = new DatospersonaM();
		
		ArrayList<Datospersona> lista = (ArrayList<Datospersona>) datos.getCrud().selectAll();
		String nombre="";
		for(int i=0;i<lista.size();i++)
		{
			if(lista.get(i).getCodigo() == codigo)
				nombre = lista.get(i).getNombre()+" " + lista.get(i).getApellido();
			
		}
		
		return nombre;
		
	}

	@Override
	public String crearGrupoTrabajo(int codAtarea,int codRecurso) throws Exception {
		try
		{
			PrecursoxgrupotM grupo = new PrecursoxgrupotM();
			grupo.getRecord().setCodigo(1);
			grupo.getRecord().setCodrecurso(codRecurso);
			grupo.getRecord().setCodatarea(codAtarea);
			grupo.getRecord().setActivo(true);
			grupo.getCrud().insertSelectiveThis();
		
			return "se registro Grupo Trabajo";
		}
		catch(Exception e)
		{
			return e.getMessage().toString();
		}
	}

}
