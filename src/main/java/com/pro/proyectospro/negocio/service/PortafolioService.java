package com.pro.proyectospro.negocio.service;


import java.util.ArrayList;
import java.util.List;

import com.pro.proyectospro.configuracion.domain.AtareaExample;
import com.pro.proyectospro.configuracion.domain.PfaseExample;
import com.pro.proyectospro.configuracion.domain.Portafolio;
import com.pro.proyectospro.configuracion.domain.PortafolioExample;
import com.pro.proyectospro.configuracion.domain.Precursoxgrupot;
import com.pro.proyectospro.configuracion.domain.PrecursoxgrupotExample;
import com.pro.proyectospro.configuracion.domain.ProyectoExample;
import com.pro.proyectospro.configuracion.model.AtareaM;
import com.pro.proyectospro.configuracion.model.PfaseM;
import com.pro.proyectospro.configuracion.model.PortafolioM;
import com.pro.proyectospro.configuracion.model.PrecursoxgrupotM;
import com.pro.proyectospro.configuracion.model.ProyectoM;
import com.pro.proyectospro.negocio.iservice.IPortafolioService;
import com.pro.proyectospro.util.Util;

public class PortafolioService implements IPortafolioService{
	
	@Override
	public String registrarPortafolio(Portafolio portafolio) throws Exception {
		try{
			PortafolioM portafoliom= new PortafolioM(portafolio);
			portafoliom.getRecord().setCodgerente(1);
			portafoliom.getRecord().setCodpmanager(1);
			portafoliom.getRecord().setFechacreado(Util.getFechaActual());
			
			portafoliom.getCrud().insertThis();
			return "Se registro portafolio";
		}
		catch(Exception e){
			return e.toString();
		}
	}

	@Override
	public List<Portafolio> listarPortafolios() throws Exception {
		PortafolioM portafoliom= new PortafolioM();
		return portafoliom.getCrud().selectAll();
	}

	@Override
	public String editarPortafolioDes(Portafolio portafolio) throws Exception {
		PortafolioM portafoliom= new PortafolioM();
		
		portafoliom.getManagedMapper().updateByPrimaryKey(portafolio);
		return null;
	}
	
	int existePortafolio(List<Portafolio> aux,  Portafolio p)
	{
		
		for(int i=0;i<aux.size();i++)
			if(p.getCodigo() == aux.get(i).getCodigo())
				return 1;
		return 0;
		
	}
	
	@Override
	public List<Portafolio> listarPortafoliosRecurso(int codRecurso) throws Exception {
		List<Portafolio> portafolios= new ArrayList<Portafolio>();
		PrecursoxgrupotM grupo = new PrecursoxgrupotM();
		
		PrecursoxgrupotExample example = new PrecursoxgrupotExample();
		
		example.createCriteria().andCodrecursoEqualTo(codRecurso);
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
			
			int codPorta = proyectom.getManagedMapper().selectByExample(examProyecto).get(0).getCodpportafolio();
			
			PortafolioM porta = new PortafolioM();
			PortafolioExample examPorta = new PortafolioExample();
			examPorta.createCriteria().andCodigoEqualTo(codPorta);
			
			Portafolio p = porta.getManagedMapper().selectByExample(examPorta).get(0);
			if( existePortafolio(portafolios,p) == 0 )
				portafolios.add(p);
			
		}
		
		return portafolios;
	}
	
}
