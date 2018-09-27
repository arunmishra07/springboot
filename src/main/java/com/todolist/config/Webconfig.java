package com.todolist.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com")
public class Webconfig {
	
	public final String RESOLVER_PREFIX = "/WEB-INF/views/";
	public final String RESOLVER_SUFFIX = ".jsp";
	
	
	@Bean
	public ViewResolver viewResolver() {
		UrlBasedViewResolver viewResolvers = new InternalResourceViewResolver();
		viewResolvers.setPrefix(RESOLVER_PREFIX);
		viewResolvers.setSuffix(RESOLVER_SUFFIX);
		
		return viewResolvers;
		
	}

}
