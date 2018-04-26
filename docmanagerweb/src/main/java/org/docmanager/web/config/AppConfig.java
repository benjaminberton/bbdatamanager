package org.docmanager.web.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@ComponentScan("org.docmanager.web.controller")
@EnableWebMvc
@PropertySource("classpath:configuration.properties")
public class AppConfig {


	
	@Bean boolean developmentMode()
	{
		return true;
	}
	
	@Bean
	ViewResolver viewResolver() 
	{
		UrlBasedViewResolver viewResolver = new UrlBasedViewResolver();
		
		viewResolver.setPrefix("/WEB-INF/jsp/");
		viewResolver.setSuffix(".jsp");
		viewResolver.setViewClass(JstlView.class);
		return viewResolver;
	}
	
	/*
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.freeMarker();
	
	}
	
	@Bean
	FreeMarkerConfigurer freeMarkerConfigurer() throws IOException {
		FreeMarkerConfigurer configurer = new  FreeMarkerConfigurer();
		
		configurer.setConfiguration(freemarkerConfiguration());
		return configurer;
	}
	
	@Bean
	freemarker.template.Configuration freemarkerConfiguration() throws IOException
	{
		freemarker.template.Configuration configuration = new freemarker.template.Configuration(freemarker.template.Configuration.VERSION_2_3_28);
		configuration.setDirectoryForTemplateLoading(new File("/WEB-INF/freemarker"));
		configuration.setDefaultEncoding("UTF-8");
		if (developmentMode())
		{
			configuration.setTemplateExceptionHandler(TemplateExceptionHandler.HTML_DEBUG_HANDLER);
		}
		else
		{
			configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
		}
		configuration.setLogTemplateExceptions(false);
		configuration.setWrapUncheckedExceptions(true);
		
		return configuration;
		
	}
	*/
}
