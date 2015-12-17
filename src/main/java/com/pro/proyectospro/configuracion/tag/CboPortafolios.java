package com.pro.proyectospro.configuracion.tag;

import java.util.ArrayList;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import com.pro.proyectospro.configuracion.domain.Portafolio;
import com.pro.proyectospro.negocio.service.PortafolioService;

public class CboPortafolios extends TagSupport  {
	
	private static final long serialVersionUID = -1139838128363899564L;

	public int doStartTag() throws JspException{
		try{
			PortafolioService service = new PortafolioService();
			JspWriter out =pageContext.getOut();
			
			try{
				ArrayList<Portafolio> portafolios =(ArrayList<Portafolio>) service.listarPortafolios();
				out.println("<select name=\"proyecto.codpportafolio\">");
				for(int i=0;i<portafolios.size();i++){
					Portafolio portafolio= portafolios.get(i);
					out.println("<option value="+portafolio.getCodigo()+">"+portafolio.getNombre()+"</option>");	
				}
				out.println("</select>");
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
	

}
