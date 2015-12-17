package com.pro.proyectospro.configuracion.tag;

import java.util.ArrayList;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import com.pro.proyectospro.configuracion.domain.Portafolio;
import com.pro.proyectospro.configuracion.domain.Proyecto;
import com.pro.proyectospro.negocio.service.PortafolioService;
import com.pro.proyectospro.negocio.service.ProyectoService;

public class MenuPortafolioRecurso extends TagSupport  {
	
	private static final long serialVersionUID = -1139838128363899564L;
	private String codigo;
	private String area;

	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int doStartTag() throws JspException{
		try{
			PortafolioService portafolioService = new PortafolioService();
			ProyectoService proyectoService = new ProyectoService();
			JspWriter out =pageContext.getOut();
			int cod = Integer.parseInt(codigo);
			int a = Integer.parseInt(area);
			int codFase;
			try{
				ArrayList<Portafolio> portafolios =(ArrayList<Portafolio>) portafolioService.listarPortafoliosRecurso(cod);
				
				for(int i=0;i<portafolios.size();i++){
					Portafolio portafolio= portafolios.get(i);
					out.println("<li>"
							+ "<a class=\"dropmenu\" href='#'>"
							+ "<i class=\"icon-folder-close-alt\"></i>"
							+ "<span class=\"hidden-tablet\">"
							+ portafolio.getNombre()+"</span></a>");
					ArrayList<Proyecto> proyectos = (ArrayList<Proyecto>)proyectoService.listarProyectosxRecurso(cod, portafolio.getCodigo());
					if(proyectos.size()>0){
					out.println("<ul>");
					
					for(int e=0; e<proyectos.size();e++){
						Proyecto proyecto = proyectos.get(e);
						out.println("<li><a class='dropmenu' href='#'>"+
									"<i class=\"icon-file-alt\"></i>"+
									"<span class=\"hidden-tablet\">"+proyecto.getNombre()+"</span></a>");
						out.println("<ul>");
						
						if(a == 1)
						{
							codFase = 1;
							out.println("<li><a class='submenu' href='/PMPRO/atareas/formAgregarTarea.action?codRecurso="+cod+"&codFase="+codFase+"&codProyecto="+proyectos.get(e).getCodigo()+"'>"+
									"<i class=\"icon-file-alt\"></i>"+
									"<span class=\"hidden-tablet\"> Analisis </span></a></li>");
							out.println("<li><a class='submenu' href='#'>"+
									"<i class=\"icon-file-alt\"></i>"+
									"<span class=\"hidden-tablet\"> Diseño </span></a></li>");
							out.println("</ul>");
						}
						if(a == 2)
						{
							out.println("<li><a class='submenu' href='#'>"+
									"<i class=\"icon-file-alt\"></i>"+
									"<span class=\"hidden-tablet\"> Desarrollo </span></a></li>");
							out.println("</ul>");
						}
						
						if(a==3)
						{
							out.println("<li><a class='submenu' href='#'>"+
									"<i class=\"icon-file-alt\"></i>"+
									"<span class=\"hidden-tablet\"> Pruebas </span></a></li>");
							out.println("</ul>");
						}
						out.println("</li>");
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
		return EVAL_PAGE;
	}
}
