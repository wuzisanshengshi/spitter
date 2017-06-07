package com.stone.spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by stone on 17-6-7.
 */
public class SpittrWebappInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * ContextLoaderListener加载应用上下文
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {RootConfig.class};
    }

    /**
     * DispatcherServlet加载应用上下文
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {WebConfig.class};
    }

    /**
     * 将DispatcherServlet映射到“/”
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
