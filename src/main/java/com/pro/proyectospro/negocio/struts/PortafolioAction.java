package com.pro.proyectospro.negocio.struts;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.pro.proyectospro.configuracion.domain.Portafolio;
import com.pro.proyectospro.configuracion.domain.Proyecto;
import com.pro.proyectospro.negocio.iservice.IPortafolioService;
import com.pro.proyectospro.negocio.iservice.IProyectoService;
import com.pro.proyectospro.negocio.service.PortafolioService;
import com.pro.proyectospro.negocio.service.ProyectoService;

public class PortafolioAction extends ActionSupport implements SessionAware{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Portafolio portafolio;
	private List<Portafolio> portafolios;
	private List<Proyecto> proyectos;
	private int id;
	private SessionMap<String, Object> session;

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>) session;
	}

	public List<Proyecto> getProyectos() {
		return proyectos;
	}

	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Portafolio getPortafolio() {
		return portafolio;
	}

	public void setPortafolio(Portafolio portafolio) {
		this.portafolio = portafolio;
	}

	public List<Portafolio> getPortafolios() {
		return portafolios;
	}

	public void setPortafolios(List<Portafolio> portafolios) {
		this.portafolios = portafolios;
	}

	public String registrar() throws Exception {

		IPortafolioService portafolioservice = new PortafolioService();
		String n = portafolioservice.registrarPortafolio(portafolio);

		addActionMessage(n);

		return SUCCESS;
	}
	
	public String buscarPortafolio()
	{
		IPortafolioService servicio = new PortafolioService();
		try {
			ArrayList<Portafolio> lista = (ArrayList<Portafolio>) servicio.listarPortafolios();
			Portafolio porta=null;
			for(int i=0;i<lista.size();i++)
			{
				if(lista.get(i).getCodigo() == portafolio.getCodigo())
				{
					porta = lista.get(i);		
				}				
			}
			session.put("portafolio", porta);
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		return SUCCESS;
	}
	
	public String proyectosXPortafolio(){
		
		IProyectoService servicio = new ProyectoService();
		buscarPortafolio();
		try {
			proyectos = servicio.proyectosXPortafolio(portafolio);
			session.put("proyectos", proyectos);
			for (int i = 0; i < proyectos.size(); i++) {
				proyectos.get(i).setAvance(servicio.porcetanjeAvance(proyectos.get(i).getCodigo()));
			}
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return SUCCESS;
	}
	
	@SuppressWarnings("unchecked")
	public String editarPortafolioDes(){
		
		IPortafolioService servicio = new PortafolioService();
		proyectos=(List<Proyecto>) session.get("proyectos");		
		try {
			portafolio=(Portafolio) session.get("portafolio");
			
			servicio.editarPortafolioDes(portafolio);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return SUCCESS;
	}
	
	
}
