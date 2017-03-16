package me.ervin.tutorial.config;

import me.ervin.tutorial.controller.TestController;
import me.ervin.tutorial.filter.TestFilter;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * @author zhiyingyang
 * @version 2017-03-14 18:30
 */
public class TestServletConfig extends ResourceConfig {
    public TestServletConfig() {
        register(TestController.class);
        register(TestFilter.class);
    }
}
