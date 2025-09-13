package cm.krishsolutions.configuratin;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration.Dynamic;

public class InitializeDispatcherServlet implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		System.out.println("started.....");
		AnnotationConfigWebApplicationContext context= new AnnotationConfigWebApplicationContext();
		
		context.register(MyConfiguration.class);
		
		DispatcherServlet dispatcherServlet= new DispatcherServlet(context);
		
		Dynamic servlet = servletContext.addServlet("myDispatcher", dispatcherServlet);
		
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
		
	}

}
