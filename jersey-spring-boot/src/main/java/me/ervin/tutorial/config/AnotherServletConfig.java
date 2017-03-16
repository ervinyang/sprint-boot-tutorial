package me.ervin.tutorial.config;

import me.ervin.tutorial.controller.AnotherController;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * @author zhiyingyang
 * @version 2017-03-14 18:30
 */
public class AnotherServletConfig extends ResourceConfig{
    public AnotherServletConfig() {
        register(AnotherController.class);
    }
}
