package me.ervin.tutorial.filter;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

/**
 * @author zhiyingyang
 * @version 2017-03-14 19:42
 */
@Provider
public class TestFilter implements ContainerRequestFilter {

    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        System.out.println("i'm in filter");
        UriInfo uriInfo = containerRequestContext.getUriInfo();
        if (!uriInfo.getPath().contains("hi1")) {
            containerRequestContext.abortWith(Response.ok("filted").build());
        }
    }
}
