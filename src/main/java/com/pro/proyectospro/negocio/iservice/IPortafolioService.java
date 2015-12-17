package com.pro.proyectospro.negocio.iservice;

import java.util.List;

import com.pro.proyectospro.configuracion.domain.Portafolio;

public interface IPortafolioService {
	public String registrarPortafolio(Portafolio portafolio) throws Exception;
	
	public List<Portafolio> listarPortafolios() throws Exception;
	
	public String editarPortafolioDes(Portafolio portafolio) throws Exception;
	
	public List<Portafolio> listarPortafoliosRecurso(int codRecurso) throws Exception;
}
