package com.todolist.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebInitializerA implements WebApplicationInitializer{

	
	@Override
	public void onStartup(ServletContext arg0) throws ServletException {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(Webconfig.class);
		
		DispatcherServlet servlet = new DispatcherServlet();
		ServletRegistration.Dynamic dispatcher =  arg0.addServlet("dispatcher", servlet);
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
	    
	    
	}
}
