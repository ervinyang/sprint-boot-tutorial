package me.ervin.tutorial.config;

import org.glassfish.jersey.servlet.ServletContainer;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhiyingyang
 * @version 2017-03-13 19:46
 */
@EnableWebMvc
@ComponentScan
@Configuration
public class WebXML extends WebMvcConfigurerAdapter {


    @Bean("testServlet")
    public ServletRegistrationBean testServlet() {
        ServletContainer servletContainer = new ServletContainer(new TestServletConfig());
        ServletRegistrationBean registrationBean = new ServletRegistrationBean();
        registrationBean.setServlet(servletContainer);

        // 必须设置名字，否则ServletContainer在spring中的名字将是servletContainer，但是同名的bean只能存在一个
        registrationBean.setName("testServlet");

        // 可以在这里设置filter
        registrationBean.addInitParameter("javax.ws.rs.container.ContainerRequestFilters", "me.ervin.tutorial.filter.TestFilter");

        List<String> urlMappings = new ArrayList<>();
        urlMappings.add("/test/*");

        registrationBean.setUrlMappings(urlMappings);
        return registrationBean;
    }

    @Bean("anotherServlet")
    public ServletRegistrationBean anotherServlet() {
        ServletContainer servletContainer = new ServletContainer(new AnotherServletConfig());
        ServletRegistrationBean registrationBean = new ServletRegistrationBean();
        registrationBean.setServlet(servletContainer);
        registrationBean.setName("anotherServlet");

        List<String> urlMappings = new ArrayList<>();
        urlMappings.add("/another/*");

        registrationBean.setUrlMappings(urlMappings);
        return registrationBean;
    }
}
