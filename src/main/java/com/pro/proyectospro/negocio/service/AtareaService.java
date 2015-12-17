package com.pro.proyectospro.negocio.service;

import java.util.ArrayList;

import com.pro.proyectospro.configuracion.domain.Atarea;
import com.pro.proyectospro.configuracion.domain.AtareaExample;
import com.pro.proyectospro.configuracion.domain.Pfase;
import com.pro.proyectospro.configuracion.domain.PfaseExample;
import com.pro.proyectospro.configuracion.domain.Precursoxgrupot;
import com.pro.proyectospro.configuracion.domain.PrecursoxgrupotExample;
import com.pro.proyectospro.configuracion.model.AtareaM;
import com.pro.proyectospro.configuracion.model.PfaseM;
import com.pro.proyectospro.configuracion.model.PrecursoxgrupotM;
import com.pro.proyectospro.negocio.iservice.IAtareaService;
import com.pro.proyectospro.util.Util;

public class AtareaService implements IAtareaService {

	@Override
	public String registrarTarea(Atarea atarea) throws Exception {
		
		try{

		AtareaM atareaM = new AtareaM(atarea);
		atareaM.getRecord().setCodatareapadre(null);
		atarea.setFechainiciopr(atarea.getFechainiciopu());
		atarea.setFechafinpr(atarea.getFechafinpu());
	
		atareaM.getCrud().insertThis();

		return "Se registro tarea";
		}
		catch (Exception e){
			String a = e.toString();
			
			return a;
		}
	}
	

	@Override
	public ArrayList<Atarea> listarTareasxFase(int codRecurso, int codFase,int codProyecto) throws Exception 
	{
		ArrayList<Atarea> lista = new ArrayList<Atarea>();
		
		PrecursoxgrupotM recurso = new PrecursoxgrupotM();
		PrecursoxgrupotExample example = new PrecursoxgrupotExample();
		example.createCriteria().andCodrecursoEqualTo(codRecurso);
		
		ArrayList<Precursoxgrupot> aux = new ArrayList<Precursoxgrupot>();
		aux = (ArrayList<Precursoxgrupot>) recurso.getManagedMapper().selectByExample(example);
		
		PfaseM pfasem = new PfaseM();
		PfaseExample exfase = new PfaseExample();
		exfase.createCriteria().andCodpproyectoEqualTo(codProyecto);
		
		ArrayList<Pfase> listaPfase = (ArrayList<Pfase>) pfasem.getManagedMapper().selectByExample(exfase);
		
		for(int i=0; i<aux.size();i++)
		{
			AtareaM ataream = new AtareaM();
			AtareaExample exAtarea = new AtareaExample();
			int codAtarea = aux.get(i).getCodatarea();
			exAtarea.createCriteria().andCodigoEqualTo(codAtarea);
			
			Atarea tarea = ataream.getManagedMapper().selectByExample(exAtarea).get(0);
			
			for(int j=0;j<listaPfase.size();j++)
			{
				if(tarea.getCodpfase() == listaPfase.get(j).getCodigo() && listaPfase.get(j).getCodigofase()== codFase)
					lista.add(tarea);
			}
			
		}
		return lista;	
	}

	@Override
	public int comenzarTarea(int codTarea) throws Exception {
		int i=-1;
		
		AtareaM ataream =new AtareaM();
		Atarea tarea = new Atarea();
		
		ataream.getRecord().setCodigo(codTarea);
		ataream.getRecord().setFechainiciore(Util.getFechaActual());
		i = ataream.getCrud().updateSelectiveThis();
		
		return i;
	}

	@Override
	public int terminarTarea(int codTarea) throws Exception {
		int i=-1;
		
		AtareaM ataream =new AtareaM();
		Atarea tarea = new Atarea();
		
		ataream.getRecord().setCodigo(codTarea);
		ataream.getRecord().setFechafinre(Util.getFechaActual());
		i = ataream.getCrud().updateSelectiveThis();
		
		return i;
	}


}
