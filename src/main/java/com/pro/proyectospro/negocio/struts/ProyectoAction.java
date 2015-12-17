package com.pro.proyectospro.negocio.struts;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.pro.proyectospro.configuracion.domain.Atarea;
import com.pro.proyectospro.configuracion.domain.Fase;
import com.pro.proyectospro.configuracion.domain.Pfase;
import com.pro.proyectospro.configuracion.domain.Proyecto;
import com.pro.proyectospro.negocio.iservice.IAtareaService;
import com.pro.proyectospro.negocio.iservice.IProyectoService;
import com.pro.proyectospro.negocio.service.AtareaService;
import com.pro.proyectospro.negocio.service.ProyectoService;
import com.pro.proyectospro.util.Util;

public class ProyectoAction extends ActionSupport implements SessionAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Proyecto proyecto;
	private List<Proyecto> proyectos;
	private int id1; // proyecto
	private int id2; // portafolio
	private SessionMap<String, Object> session;
	private List<Fase> fases=null;
	private List<Pfase> pfase;
	private List<Atarea> atareas =new ArrayList<Atarea>();
	private Atarea atarea;

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>) session;
	}
	

	public int getId1() {
		return id1;
	}


	public void setId1(int id1) {
		this.id1 = id1;
	}


	public int getId2() {
		return id2;
	}


	public void setId2(int id2) {
		this.id2 = id2;
	}
	
	public List<Atarea> getAtareas() {
		return atareas;
	}


	public void setAtareas(List<Atarea> atareas) {
		this.atareas = atareas;
	}
	


	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	public List<Proyecto> getProyectos() {
		return proyectos;
	}

	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}


	
	public List<Fase> getFases() {
		return fases;
	}


	public void setFases(List<Fase> fases) {
		this.fases = fases;
	}
	
	public Atarea getAtarea() {
		return atarea;
	}


	public void setAtarea(Atarea atarea) {
		this.atarea = atarea;
	}


	public List<Pfase> getPfase() {
		return pfase;
	}


	public void setPfase(List<Pfase> pfase) {
		this.pfase = pfase;
	}
	
	public String registrar() throws Exception {

		IProyectoService proyectoservice = new ProyectoService();
		proyecto.setFechacreado(Util.getFechaActual());
		proyecto.setCodestado(1);
		String n = proyectoservice.registrarProyecto(proyecto);
		
		String m =proyectoservice.agregarPFases(proyecto);
		
		session.put("pro", proyecto);
		setPfase(proyectoservice.listarPfases(proyecto));
		
		addActionMessage(n);

		return "ok";
	}
	
	public String buscarProyecto()
	{
		IProyectoService servicio = new ProyectoService();
		
		try {
			ArrayList<Proyecto> lista = (ArrayList<Proyecto>) servicio.listarProyectos();
			Proyecto p = null;
			for(int i=0; i<lista.size();i++)
			{
				if(lista.get(i).getCodigo() == id1 && lista.get(i).getCodpportafolio()== id2)
				{
					p=lista.get(i);
				}
			}
			fases = servicio.listarFasesxProyecto(id1);
			session.put("proyecto", p);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  SUCCESS;
	}
	

	public String fasesxProyecto()
	{
		IProyectoService servicio = new ProyectoService();
		
		try {
			fases = servicio.listarFasesxProyecto(id1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return SUCCESS;
		
	}
	
	
	public String registrarATarea() throws Exception{

		IAtareaService atareaService = new AtareaService();
		
		String fecha = atarea.getFechafinpr();
		atarea.setFechafinpr(Util.formatearFecha(fecha));
		
		fecha = atarea.getFechafinpu();
		atarea.setFechafinpu(Util.formatearFecha(fecha));
		
		fecha = atarea.getFechainiciopr();
		atarea.setFechainiciopr(Util.formatearFecha(fecha));
		
		fecha = atarea.getFechainiciopu();
		atarea.setFechainiciopu(Util.formatearFecha(fecha));
		
		IProyectoService servicio = new ProyectoService();
		
		Proyecto p = (Proyecto) session.get("pro");
		pfase = servicio.listarPfases(p);
		
		atarea.setPfase( servicio.buscarPfase(atarea.getCodpfase()) );
		
		String mensaje = atareaService.registrarTarea(atarea);
		

		addActionMessage(mensaje);
		
		if(session.get("tareas")!=null)
		{
			atareas = (List<Atarea>) session.get("tareas");
			atareas.add(atarea);
			session.put("tareas",atareas);
		}
		else
		{
			atareas.add(atarea);
			session.put("tareas",atareas);
		}
		
		return SUCCESS;
	}
	
	public String registrarCronograma() throws Exception
	{
		Proyecto p=(Proyecto) session.get("pro");
		IProyectoService servicio = new ProyectoService();
		String completo="";
		//try {
			int resultado = servicio.tareasCompletas(p);
			
			if(resultado == 0)
			{
				completo = "incompleto";
				addActionMessage("Debe completar el cronograma");
			}
			else
			{	
				completo = "completo";
				/*session.put("pro",null);
				session.put("tareas",null);*/
			}
		/*} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//completo = "no se pudo registrar el cronograma";
		}*/
		
		pfase = servicio.listarPfases(p);
			
		if(session.get("tareas")!=null)
		{
			atareas = (List<Atarea>) session.get("tareas");
			session.put("tareas",atareas);
		}
		
		return completo;
	}
	
	public String listarTareas(){
		IProyectoService servicio = new ProyectoService();
		
		try {
			atareas =servicio.listarTareas(id1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return SUCCESS;
	}
	
	public String listarTareasXFaseSup(){
		IProyectoService servicio = new ProyectoService();
		
		try {
			atareas =servicio.listarTareasXFaseSup(id1,session.get("recurso"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return SUCCESS;
	}

}
