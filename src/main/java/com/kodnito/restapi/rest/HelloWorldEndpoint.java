package com.kodnito.restapi.rest;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author hayricicek
 */
@Path("hello")
@RequestScoped
public class HelloWorldEndpoint {
    
    @GET
    public Response helloPayara() {
        return Response.ok("Hello From Payara").build();
    }
}
