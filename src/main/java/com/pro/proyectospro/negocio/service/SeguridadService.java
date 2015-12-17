package com.pro.proyectospro.negocio.service;

import com.pro.proyectospro.configuracion.domain.Datospersona;
import com.pro.proyectospro.configuracion.domain.DatospersonaExample;
import com.pro.proyectospro.configuracion.domain.Gerente;
import com.pro.proyectospro.configuracion.domain.GerenteExample;
import com.pro.proyectospro.configuracion.domain.Pmanager;
import com.pro.proyectospro.configuracion.domain.PmanagerExample;
import com.pro.proyectospro.configuracion.domain.Recurso;
import com.pro.proyectospro.configuracion.domain.RecursoExample;
import com.pro.proyectospro.configuracion.domain.Rol;
import com.pro.proyectospro.configuracion.domain.Supervisor;
import com.pro.proyectospro.configuracion.domain.SupervisorExample;
import com.pro.proyectospro.configuracion.domain.Usuario;
import com.pro.proyectospro.configuracion.model.DatospersonaM;
import com.pro.proyectospro.configuracion.model.GerenteM;
import com.pro.proyectospro.configuracion.model.PmanagerM;
import com.pro.proyectospro.configuracion.model.RecursoM;
import com.pro.proyectospro.configuracion.model.SupervisorM;
import com.pro.proyectospro.configuracion.model.UsuarioM;
import com.pro.proyectospro.configuracion.model.UsuariorolM;
import com.pro.proyectospro.negocio.iservice.ISeguridadService;

public class SeguridadService implements ISeguridadService {

	public Usuario validarUsuario(Usuario usuario) throws Exception {
		UsuarioM usuarioM= new UsuarioM(usuario);
		
		return usuarioM.validarUsuario();
	}

	@Override
	public Rol obtenerRolActual(Usuario usuario) throws Exception {
		
		UsuariorolM usuarioRolM = new UsuariorolM();
		Rol rol = usuarioRolM.obtenerRolActual(usuario);
			
		return  rol;
	}
	
	@Override
	public Pmanager obtenerPM(int usuario) throws Exception {
		PmanagerM manager = new PmanagerM(usuario);
		PmanagerExample example = new PmanagerExample();
		
		example.createCriteria().andCodusuarioEqualTo(usuario);
		
		return manager.getManagedMapper().selectByExample(example).get(0);

	}

	@Override
	public Gerente obtenerGerente(int usuario) throws Exception {
		GerenteM gerente = new GerenteM();
		GerenteExample example = new GerenteExample();
		
		example.createCriteria().andCodusuarioEqualTo(usuario);
		
		return gerente.getManagedMapper().selectByExample(example).get(0);
	}

	@Override
	public Supervisor obtenerSupervisor(int usuario) throws Exception {
		SupervisorM supervisor = new SupervisorM();
		SupervisorExample example = new SupervisorExample();
		
		example.createCriteria().andCodusuarioEqualTo(usuario);
		
		return supervisor.getManagedMapper().selectByExample(example).get(0);
		
	}

	@Override
	public Recurso obtenerRecurso(int usuario) throws Exception {
		RecursoM recurso = new RecursoM();
		RecursoExample example = new RecursoExample();
		
		example.createCriteria().andCodusuarioEqualTo(usuario);
		
		return recurso.getManagedMapper().selectByExample(example).get(0);
		
	}

	@Override
	public Datospersona obtenerDatos(int cod) throws Exception {
		DatospersonaM datos = new DatospersonaM();
		DatospersonaExample example = new DatospersonaExample();
		
		return datos.getManagedMapper().selectByPrimaryKey(cod);
 	}


}
