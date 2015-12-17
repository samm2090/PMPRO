package com.pro.proyectospro.negocio.service;

import java.util.ArrayList;
import java.util.List;

import com.pro.proyectospro.configuracion.domain.Atarea;
import com.pro.proyectospro.configuracion.domain.AtareaExample;
import com.pro.proyectospro.configuracion.domain.Fase;
import com.pro.proyectospro.configuracion.domain.Pfase;
import com.pro.proyectospro.configuracion.domain.PfaseExample;
import com.pro.proyectospro.configuracion.domain.Portafolio;
import com.pro.proyectospro.configuracion.domain.Precursoxgrupot;
import com.pro.proyectospro.configuracion.domain.PrecursoxgrupotExample;
import com.pro.proyectospro.configuracion.domain.Proyecto;
import com.pro.proyectospro.configuracion.domain.ProyectoExample;
import com.pro.proyectospro.configuracion.domain.Supervisor;
import com.pro.proyectospro.configuracion.model.AtareaM;
import com.pro.proyectospro.configuracion.model.EstadoM;
import com.pro.proyectospro.configuracion.model.FaseM;
import com.pro.proyectospro.configuracion.model.PfaseM;
import com.pro.proyectospro.configuracion.model.PrecursoxgrupotM;
import com.pro.proyectospro.configuracion.model.ProyectoM;
import com.pro.proyectospro.negocio.iservice.IProyectoService;

public class ProyectoService implements IProyectoService {

	@Override
	public String registrarProyecto(Proyecto proyecto) throws Exception {
		ProyectoM proyectom = new ProyectoM(proyecto);
		proyectom.getRecord().setVisible(true);

		proyectom.getCrud().insertThis();
		return "Se registro proyecto";
	}

	@Override
	public List<Proyecto> listarProyectos() throws Exception {
		ProyectoM proyectoM = new ProyectoM();

		return proyectoM.getCrud().selectAll();
	}

	@Override
	public List<Proyecto> proyectosXPortafolio(Portafolio portafolio) {

		ProyectoM proyectoM = new ProyectoM();
		EstadoM estadoM = new EstadoM();
		List<Proyecto> proyectos = proyectoM.getCrud().selectAll();
		List<Proyecto> selectos = new ArrayList<Proyecto>();

		for (int i = 0; i < proyectos.size(); i++) {
			Proyecto proyecto = proyectos.get(i);
			if (proyecto.getCodpportafolio() == portafolio.getCodigo()) {
				proyecto.setEstado(estadoM.getManagedMapper()
						.selectByPrimaryKey(proyecto.getCodestado()));

				selectos.add(proyecto);
			}
		}
		return selectos;
	}

	@Override
	public List<Fase> listarFasesxProyecto(int codigo) throws Exception {

		PfaseM faseM = new PfaseM();
		PfaseExample example = new PfaseExample();
		example.createCriteria().andCodpproyectoEqualTo(codigo);

		List<Pfase> lista = faseM.getManagedMapper().selectByExample(example);
		FaseM faseM2 = new FaseM();

		List<Fase> fases = new ArrayList<Fase>();

		for (int i = 0; i < lista.size(); i++) {
			Fase fase = faseM2.getManagedMapper().selectByPrimaryKey(
					lista.get(i).getCodigofase());
			fases.add(fase);
		}

		return fases;

	}

	@Override
	public String agregarPFases(Proyecto proyecto) throws Exception {
		PfaseM pfasem;
		Pfase fase = new Pfase();;
		for(int i=1;i<=4;i++)
		{
			fase.setCodigofase(i);
			fase.setCodestado(1);
			fase.setCodpproyecto(proyecto.getCodigo());
			pfasem = new PfaseM(fase);
			pfasem.getCrud().insertThis();
		}	
		
		return "se registro pfase";
	}

	@Override
	public List<Pfase> listarPfases(Proyecto proyecto) throws Exception {
		List<Pfase> lista = new ArrayList<Pfase>();
		PfaseM fase = new PfaseM();
		
		PfaseExample example = new PfaseExample();
		example.createCriteria().andCodpproyectoEqualTo(proyecto.getCodigo());
		
		lista= fase.getManagedMapper().selectByExample(example);
		
		return lista;
	}

	@Override
	public Pfase buscarPfase(int codigo) throws Exception {
		PfaseM fasem = new PfaseM();
		PfaseExample example = new PfaseExample();
		
		example.createCriteria().andCodigoEqualTo(codigo);
		
		return fasem.getManagedMapper().selectByExample(example).get(0);	
	}

	@Override
	public int tareasCompletas(Proyecto proyecto) throws Exception {
		List<Pfase> lista = listarPfases(proyecto);
		int[] cont = new int[4];
		AtareaM tarea = new AtareaM();
		
		
		//List<Atarea> tareas = tarea.getCrud().selectAll();
		for(int i=0;i<lista.size();i++)
		{
			int codPFase = lista.get(i).getCodigo();
			AtareaExample example = new AtareaExample();
			example.createCriteria().andCodpfaseEqualTo(codPFase);
			List<Atarea> t = tarea.getManagedMapper().selectByExample(example);
			cont[i] = t.size();
		}

		for(int j=0;j<cont.length;j++)
		{
			if(cont[j] == 0)
				return 0;
		}
		return 1;
	}

	@Override
	public List<Proyecto> listarProyectosxRecurso(int codUsuario, int codPortafolio) throws Exception {
		List<Proyecto> proyectos= new ArrayList<Proyecto>();
		PrecursoxgrupotM grupo = new PrecursoxgrupotM();
		
		PrecursoxgrupotExample example = new PrecursoxgrupotExample();
		
		example.createCriteria().andCodrecursoEqualTo(codUsuario);
		List<Precursoxgrupot> grupos = grupo.getManagedMapper().selectByExample(example);
		
		for(int i = 0;i<grupos.size();i++)
		{
			int codAtarea = grupos.get(i).getCodatarea();
			AtareaM ataream = new AtareaM();
			AtareaExample exam = new AtareaExample();
			exam.createCriteria().andCodigoEqualTo(codAtarea);
			
			int codpFase = ataream.getManagedMapper().selectByExample(exam).get(0).getCodpfase();
			PfaseM codPfasem = new PfaseM();
			PfaseExample examPfase = new PfaseExample();
			examPfase.createCriteria().andCodigoEqualTo(codpFase);
			
			int codProyecto = codPfasem.getManagedMapper().selectByExample(examPfase).get(0).getCodpproyecto();
			
			ProyectoM proyectom = new ProyectoM();
			ProyectoExample examProyecto = new ProyectoExample();
			examProyecto.createCriteria().andCodigoEqualTo(codProyecto);
			
			Proyecto pro = proyectom.getManagedMapper().selectByExample(examProyecto).get(0);
			if(pro.getCodpportafolio() == codPortafolio)
				proyectos.add(pro);
		}
		
		return proyectos;
	}
	
	@Override
	public double porcetanjeAvance(int cod_proy) throws Exception {

		// busca pfase por proyecto
		PfaseM pfaseM = new PfaseM();
		PfaseExample pFaseExample = new PfaseExample();

		pFaseExample.createCriteria().andCodpproyectoEqualTo(cod_proy);
		List<Pfase> pfases = pfaseM.getManagedMapper().selectByExample(
				pFaseExample);

		// cantidad de atarea por pfase
		AtareaM atareaM = new AtareaM();
		AtareaExample atareaExample = new AtareaExample();

		int tareasXFase = 0;
		int tareasTerminadas = 0;

		for (int i = 0; i < pfases.size(); i++) {
			Pfase pfase = pfases.get(i);

			atareaExample.createCriteria()
					.andCodpfaseEqualTo(pfase.getCodigo());
			tareasXFase += atareaM.getManagedMapper().countByExample(
					atareaExample);

			atareaExample.clear();
			atareaExample.createCriteria()
					.andCodpfaseEqualTo(pfase.getCodigo())
					.andFechafinreIsNotNull();
			tareasTerminadas += atareaM.getManagedMapper().countByExample(
					atareaExample);

		}
		if (tareasXFase == 0) {
			return 0.0;
		}
		return (double) ((tareasTerminadas * 100) / tareasXFase);
	}

	@Override
	public List<Atarea> listarTareas(int cod_proy) throws Exception {

		PfaseM pfaseM = new PfaseM();
		PfaseExample pFaseExample = new PfaseExample();

		pFaseExample.createCriteria().andCodpproyectoEqualTo(cod_proy);
		List<Pfase> pfases = pfaseM.getManagedMapper().selectByExample(
				pFaseExample);

		AtareaM atareaM = new AtareaM();
		AtareaExample atareaExample = new AtareaExample();
		List<Atarea> atareas = new ArrayList<Atarea>();

		for (int i = 0; i < pfases.size(); i++) {
			Pfase pfase = pfases.get(i);
			atareaExample.createCriteria()
					.andCodpfaseEqualTo(pfase.getCodigo());
			List<Atarea> lista = atareaM.getManagedMapper().selectByExample(
					atareaExample);

			for (int e = 0; e < lista.size(); e++) {
				atareas.add(lista.get(e));
			}
		}

		return atareas;
	}

	@Override
	public List<Atarea> listarTareasXFaseSup(int id1, Object object) {

		Supervisor supervisor = (Supervisor) object;

		PfaseM pfaseM = new PfaseM();
		PfaseExample ex = new PfaseExample();
		List<Pfase> pfases = new ArrayList<Pfase>();

		ex.createCriteria().andCodpproyectoEqualTo(id1);
		pfases = pfaseM.getManagedMapper().selectByExample(ex);

		AtareaM atareaM = new AtareaM();
		AtareaExample example = new AtareaExample();

		List<Atarea> atareas = new ArrayList<Atarea>();

		for (Pfase pf : pfases) {
			example.createCriteria().andCodpfaseEqualTo(pf.getCodigo())
					.andCodareaEqualTo(supervisor.getCodarea());
			
			List<Atarea> lista = atareaM.getManagedMapper().selectByExample(
					example);

			for (Atarea atarea : lista) {
				atarea.setCodpfase(pf.getCodigofase());
				atareas.add(atarea);
			}

		}

		return atareas;
	}

}
