package com.pro.proyectospro.configuracion.tag;

import java.util.ArrayList;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import com.pro.proyectospro.configuracion.domain.Portafolio;
import com.pro.proyectospro.configuracion.domain.Proyecto;
import com.pro.proyectospro.negocio.service.PortafolioService;
import com.pro.proyectospro.negocio.service.ProyectoService;

public class MenuPortafolioSupervisor extends TagSupport  {
	
	private static final long serialVersionUID = -1139838128363899564L;

	public int doStartTag() throws JspException{
		try{
			PortafolioService portafolioService = new PortafolioService();
			ProyectoService proyectoService = new ProyectoService();
			JspWriter out =pageContext.getOut();
			
			try{
				ArrayList<Portafolio> portafolios =(ArrayList<Portafolio>) portafolioService.listarPortafolios();
				for(int i=0;i<portafolios.size();i++){
					Portafolio portafolio= portafolios.get(i);
					
					out.println("<li onclick=\"location.href='/PMPRO/portafolio/infoPortafolioSup.action?portafolio.codigo="+portafolio.getCodigo()+"';\">"
							+ "<a class=\"dropmenu\" href='#'}>"
							+ "<i class=\"icon-folder-close-alt\"></i>"
							+ "<span class=\"hidden-tablet\">"
							+ portafolio.getNombre()+"</span></a>");
					
					ArrayList<Proyecto> proyectos = (ArrayList<Proyecto>)proyectoService.proyectosXPortafolio(portafolio);
					if(proyectos.size()>0){
					out.println("<ul>");
					
					for(int e=0; e<proyectos.size();e++){
						Proyecto proyecto = proyectos.get(e);
						out.println("<li><a class='submenu' href='/PMPRO/proyecto/listarTareasXFaseSup.action?id1="+proyectos.get(e).getCodigo()+"&id2="+proyectos.get(e).getCodpportafolio()+"'>"+
									"<i class=\"icon-file-alt\"></i>"+
									"<span class=\"hidden-tablet\">"+proyecto.getNombre()+"</span></a></li>");
					}
					out.println("</ul>");
					}
					out.println("</li>");
				} 
			}
			catch(Exception e){
				e.getStackTrace();
			}
			
		}
		catch(Exception e){
			throw new JspException("Error: "+e.getMessage());
		}
		return SKIP_BODY;
	}
	
	public int doEndTag() throws JspException 
	{
		// acciones al finalizar la etiqueta
		return EVAL_PAGE;
	}
}
