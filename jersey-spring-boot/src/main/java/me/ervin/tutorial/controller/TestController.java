package me.ervin.tutorial.controller;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author zhiyingyang
 * @version 2017-03-14 19:37
 */
@Path("/")
@Component
public class TestController {
    @GET
    @Path("/hi1")
    public Object test1() {
        return "test1 success";
    }

    @GET
    @Path("/hi2")
    public Object test2() {
        return "test2 success";
    }
}
