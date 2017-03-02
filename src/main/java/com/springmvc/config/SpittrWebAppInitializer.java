package com.springmvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/03/01
 * Time  14:19
 */


public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    //tips:AbstractAnnotationConfigDispatcherServletInitializer 配置的只能是TomCat7（包括）以上

    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("getRootConfigClasses");
        return new Class<?>[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("getServletConfigClasses");
        return new Class<?>[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("getServletMappings");
        return new String[]{"/"};
    }
}
