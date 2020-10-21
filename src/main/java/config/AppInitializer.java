package config;


import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.FrameworkServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

//(1) for what?
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    //(1) for what?
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{config.AppConfiguration.class};
    }

    //(2) for what?
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    //(3) for what?
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    //(4) for what?
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        filter.setForceEncoding(true);
        return new Filter[]{filter};
    }

    //(5) for what?
    @Override
    protected FrameworkServlet createDispatcherServlet(WebApplicationContext servletAppContext) {
        DispatcherServlet dispatcher = (DispatcherServlet) super.createDispatcherServlet(servletAppContext);
        dispatcher.setThrowExceptionIfNoHandlerFound(true);
        return dispatcher;
    }
}
