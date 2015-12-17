package com.pro.proyectospro.configuracion.util;

import com.pro.proyectospro.configuracion.domain.Area;
import com.pro.proyectospro.configuracion.domain.Atarea;
import com.pro.proyectospro.configuracion.domain.Datospersona;
import com.pro.proyectospro.configuracion.domain.Estado;
import com.pro.proyectospro.configuracion.domain.Fase;
import com.pro.proyectospro.configuracion.domain.Gerente;
import com.pro.proyectospro.configuracion.domain.Incidencia;
import com.pro.proyectospro.configuracion.domain.Interesado;
import com.pro.proyectospro.configuracion.domain.Pdocumento;
import com.pro.proyectospro.configuracion.domain.Pfase;
import com.pro.proyectospro.configuracion.domain.Pincidencia;
import com.pro.proyectospro.configuracion.domain.Pmanager;
import com.pro.proyectospro.configuracion.domain.Pmanagerproyecto;
import com.pro.proyectospro.configuracion.domain.Portafolio;
import com.pro.proyectospro.configuracion.domain.Precursoxgrupot;
import com.pro.proyectospro.configuracion.domain.Proyecto;
import com.pro.proyectospro.configuracion.domain.Recurso;
import com.pro.proyectospro.configuracion.domain.Rol;
import com.pro.proyectospro.configuracion.domain.Supervisor;
import com.pro.proyectospro.configuracion.domain.Tarea;
import com.pro.proyectospro.configuracion.domain.Urgencia;
import com.pro.proyectospro.configuracion.domain.Usuario;
import com.pro.proyectospro.configuracion.domain.Usuariorol;

public class DefaultRecordFactory {
	
	public static void main(String[] args) {
		
	}

	public static Area getAreaDefault() {
		return new Area();
	}

	public static Atarea getAtareaDefault() {
		return new Atarea();
	}

	public static Interesado getInteresadoDefault() {
		return new Interesado();
	}

	public static Pdocumento getPdocumentoDefault() {
		return new Pdocumento();
	}

	public static Pfase getPfaseDefault() {
		return new Pfase();
	}


	public static Pincidencia getPincidenciaDefault() {
		return new Pincidencia();
	}

	public static Pmanager getPmanagerDefault() {
		return new Pmanager();
	}

	public static Pmanagerproyecto getPmanagerproyectoDefault() {
		return new Pmanagerproyecto();
	}

	public static Portafolio getPortafolioDefault() {
		return new Portafolio();
	}

	public static Datospersona getDatospersonaDefault() {
		Datospersona dp = new Datospersona();
		return dp;
	}
	
	public static Estado getEstadoDefault() {
		Estado e =new Estado();
		e.setActivo(true);
		return e;
	}

	public static Fase getFaseDefault() {
		Fase f =new Fase();
		f.setActivo(true);
		return null;
	}

	public static Gerente getGerenteDefault() {
		Gerente g=new Gerente();
		g.setActivo(true);
		return g;
	}

	public static Incidencia getIncidenciaDefault() {
		Incidencia i= new Incidencia();
		i.setActivo(true);
		return null;
	}


	public static Proyecto getProyectoDefault() {
		Proyecto p=new Proyecto();
		p.setActivo(true);
		p.setDesdecero(true);
		return p;
	}

	public static Precursoxgrupot getPrecursoxgrupotDefault() {
		return new Precursoxgrupot();
	}

	public static Recurso getRecursoDefault() {
		return new Recurso();
	}

	public static Rol getRolDefault() {
		return new Rol();
	}

	public static Supervisor getSupervisorDefault() {
		return new Supervisor();
	}

	public static Tarea getTareaDefault() {
		return new Tarea();
	}

	public static Urgencia getUrgenciaDefault() {
		return new Urgencia();
	}

	public static Usuario getUsuarioDefault() {
		return new Usuario();
	}

	public static Usuariorol getUsuariorolDefault() {
		return new Usuariorol();
	}

}
