package com.pro.proyectospro.negocio.struts;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.pro.proyectospro.configuracion.domain.Gerente;
import com.pro.proyectospro.configuracion.domain.Pmanager;
import com.pro.proyectospro.configuracion.domain.Portafolio;
import com.pro.proyectospro.configuracion.domain.Recurso;
import com.pro.proyectospro.configuracion.domain.Rol;
import com.pro.proyectospro.configuracion.domain.Supervisor;
import com.pro.proyectospro.configuracion.domain.Usuario;
import com.pro.proyectospro.negocio.iservice.IPortafolioService;
import com.pro.proyectospro.negocio.service.PortafolioService;
import com.pro.proyectospro.negocio.service.SeguridadService;

public class SeguridadAction extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = 76399960808117L;
	
	private Usuario usuario;
	private SessionMap<String, Object> session;
	ArrayList<Portafolio> portafolios =null;

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>)session;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public String iniciarSesion() throws Exception{
		SeguridadService seguridadService = new SeguridadService();
				
		usuario = seguridadService.validarUsuario(usuario);
		session.put("usuario", usuario);
		
		Rol rol =seguridadService.obtenerRolActual(usuario);
		
		String direccionar="error";
		int cod=-1;
		
		if(rol!=null){
		
		switch(rol.getNocodigo()){
		
			case "ger":
				direccionar = "gerente";
				Gerente g = seguridadService.obtenerGerente(usuario.getCodigo());
				cod = g.getCoddatospersona();
				session.put("gerente", g);
				break;
			
			case "pm":
				direccionar = "pm";
				Pmanager pm = seguridadService.obtenerPM(usuario.getCodigo());
				cod = pm.getCoddatospersona();
				session.put("pm",pm);
				break;
			
			case "adm":
				direccionar = "administrador";
				session.put("recurso", seguridadService.obtenerRecurso(usuario.getCodigo()));
				break;
			
			case "sup" :
				Supervisor s = seguridadService.obtenerSupervisor(usuario.getCodigo());
				cod = s.getCoddatospersona();
				direccionar = "supervisor";
				session.put("recurso", s);
				break;
			
			case "rec":
				direccionar = "recurso";
				Recurso r = seguridadService.obtenerRecurso(usuario.getCodigo());
				cod = r.getCoddatospersona();
				session.put("recurso",r );
				break;

			default:
				direccionar = "error";
				break;
		}
		
		session.put("datosPersona" ,seguridadService.obtenerDatos(cod));
		
		}
		
		return direccionar;
	}
	
	public String cerrarSesion() throws Exception{
		
		session.invalidate();
		return SUCCESS;		
	}

	public ArrayList<Portafolio> getPortafolios() {
		return portafolios;
	}

	public void setPortafolios(ArrayList<Portafolio> portafolios) {
		this.portafolios = portafolios;
	}


	
}
