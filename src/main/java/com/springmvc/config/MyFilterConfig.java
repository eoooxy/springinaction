package com.springmvc.config;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.FilterRegistration.Dynamic;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/03/16
 * Time  16:42
 */

/*
public class MyFilterConfig implements WebApplicationInitializer {
    public void onStartup(ServletContext servletContext) throws ServletException {

        Dynamic myFilter = servletContext.addFilter("myFilter", com.springmvc.filter.TestFilter.class);
        myFilter.addMappingForUrlPatterns(null, false, "/back/");
    }
}
*/
