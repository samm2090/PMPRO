package com.pro.proyectospro.negocio.struts;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.pro.proyectospro.configuracion.domain.Atarea;
import com.pro.proyectospro.negocio.iservice.IAtareaService;
import com.pro.proyectospro.negocio.service.AtareaService;
import com.pro.proyectospro.util.Util;

public class AtareaAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = -7639996080811749778L;
	
	private Atarea atarea;
	private List<Atarea> atareas=new ArrayList<Atarea>();
	private SessionMap<String, Object> session;
	
	//
	private int codRecurso;
	private int codFase;
	private int codProyecto;
	
	public int getCodRecurso() {
		return codRecurso;
	}

	public void setCodRecurso(int codRecurso) {
		this.codRecurso = codRecurso;
	}

	public int getCodFase() {
		return codFase;
	}

	public void setCodFase(int codFase) {
		this.codFase = codFase;
	}

	public int getCodProyecto() {
		return codProyecto;
	}

	public void setCodProyecto(int codProyecto) {
		this.codProyecto = codProyecto;
	}

	public Atarea getAtarea() {
		return atarea;
	}
	
	public void setAtarea(Atarea atarea) {
		this.atarea = atarea;
	}
	
	public List<Atarea> getAtareas() {
		return atareas;
	}
	
	public void setAtareas(List<Atarea> atareas) {
		this.atareas = atareas;
	}
	
	public String registrar() throws Exception{

		IAtareaService atareaService = new AtareaService();
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM/dd");
		
		String fecha = atarea.getFechafinpr();
		atarea.setFechafinpr("2015/10/02");
		
		fecha = atarea.getFechafinpu();
		atarea.setFechafinpu("2015/10/02");
		
		fecha = atarea.getFechainiciopr();
		atarea.setFechainiciopr("2015/10/02");
		
		fecha = atarea.getFechainiciopu();
		atarea.setFechainiciopu("2015/10/02");
		
		
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

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>) session;
		
	}
	
	public String obtenerTareasxAreaxRecurso() throws Exception
	{
		IAtareaService servicio = new AtareaService();
		
		atareas = servicio.listarTareasxFase(codRecurso, codFase, codProyecto);
		session.put("tareasRecurso",atareas);

		return SUCCESS;
	}
	
	public String comenzarTarea() throws Exception
	{
		IAtareaService servicio = new AtareaService();
		int i=servicio.comenzarTarea(atarea.getCodigo());
		if(i==-1)
		{
			addActionMessage("No se puedo realizar la actualizacion");
		}
		else
		{
			if(session.get("tareasRecurso")!=null)
			{
				atareas = (List<Atarea>) session.get("tareasRecurso");				
				for(int j=0;j<atareas.size();j++)
				{
					if(atareas.get(j).getCodigo()==atarea.getCodigo())
					{
						atareas.get(j).setFechainiciore(Util.getFechaActual());
					}
				}
				session.put("tareasRecurso", atareas);
			}
			
		}
			
		return SUCCESS;
	}
	
	public String terminarTarea() throws Exception
	{
		IAtareaService servicio = new AtareaService();
		int i=servicio.terminarTarea(atarea.getCodigo());
		if(i==-1)
		{
			addActionMessage("No se puedo realizar la actualizacion");
		}
		else
		{
			if(session.get("tareasRecurso")!=null)
			{
				atareas = (List<Atarea>) session.get("tareasRecurso");				
				for(int j=0;j<atareas.size();j++)
				{
					if(atareas.get(j).getCodigo()==atarea.getCodigo())
					{
						atareas.get(j).setFechafinre(Util.getFechaActual());
					}
				}
				session.put("tareasRecurso", atareas);
			}
			
		}
			
		return SUCCESS;
	}

}
