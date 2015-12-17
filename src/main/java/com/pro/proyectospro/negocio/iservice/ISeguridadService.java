package com.pro.proyectospro.negocio.iservice;

import com.pro.proyectospro.configuracion.domain.Datospersona;
import com.pro.proyectospro.configuracion.domain.Gerente;
import com.pro.proyectospro.configuracion.domain.Pmanager;
import com.pro.proyectospro.configuracion.domain.Recurso;
import com.pro.proyectospro.configuracion.domain.Rol;
import com.pro.proyectospro.configuracion.domain.Supervisor;
import com.pro.proyectospro.configuracion.domain.Usuario;

public interface ISeguridadService {

	public Usuario validarUsuario(Usuario usuario) throws Exception;
	
	public Rol obtenerRolActual(Usuario usuario) throws Exception;
	
	public Pmanager obtenerPM(int usuario) throws Exception;
	
	public Gerente obtenerGerente(int usuario) throws Exception;
	
	public Supervisor obtenerSupervisor(int usuario) throws Exception;
	
	public Recurso obtenerRecurso(int usuario) throws Exception;

	public Datospersona obtenerDatos(int cod) throws Exception;
}
