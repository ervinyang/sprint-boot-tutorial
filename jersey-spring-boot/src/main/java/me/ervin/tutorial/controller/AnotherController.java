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
public class AnotherController {

    @GET
    @Path("/hi2")
    public Object another() {
        return "another success";
    }
}
