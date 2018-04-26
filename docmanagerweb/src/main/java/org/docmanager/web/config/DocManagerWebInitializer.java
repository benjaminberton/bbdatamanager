package org.docmanager.web.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DocManagerWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	/*
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		
		System.out.println("Initialization start");
		
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(AppConfig.class);
		context.refresh();
		
		System.out.println("context loaded");

		//servletContext.addListener(new ContextLoaderListener(context));
		
		System.out.println("listener added");
		
		
		DispatcherServlet servlet = new DispatcherServlet(context);
		
		System.out.println("");
		
		ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
		registration.setLoadOnStartup(1);
		registration.addMapping("/docmanager/*");
		
		System.out.println("Initialization done");
	}
*/

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// 
		return null;
	}

	@Override	
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {AppConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
