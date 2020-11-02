package com.spring;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringWebAppIntializer implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("onStartup started");
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(AppConfig.class);
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("SpringDispatcher", new DispatcherServlet(context));
		servletContext.addListener(new ContextLoaderListener(context));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
//		context.refresh();
	}

}
