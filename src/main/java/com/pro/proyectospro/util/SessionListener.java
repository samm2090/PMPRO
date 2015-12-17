package com.pro.proyectospro.util;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {
	
	@Override
	public void sessionCreated(HttpSessionEvent event) {
		System.err.println("SE CREO UNA NUEVA SESION");
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
//		HttpSession session = event.getSession();
//		SeguridadManagedBean userMB = (SeguridadManagedBean) session.getAttribute("segMB");
//		SeguridadManagedBean segMB = SanipesUtil.getBean("segMB");
//		ServletContext appContext = session.getServletContext();
//		Usuario usuario = segMB.getUsuario();
//		ApplicationRepository appRP = (ApplicationRepository) appContext.getAttribute("appRP");
//		ApplicationRepository appRP = SanipesUtil.getBean("appRP");
//		appRP.eliminarUsuarioSesion(usuario);
		
		System.err.println("SE DESTRUYO UNA SESION");
	}
	
}
