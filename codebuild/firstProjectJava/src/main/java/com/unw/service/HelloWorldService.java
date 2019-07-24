package com.unw.service;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * @author UNGERW
 */
@Component
@Path("/spring-docker/")
public class HelloWorldService {

    @GET
    @Path("/hello")
    public Response test() {
        return Response.status(200).entity("Hello Cloud Gurus").build();
    }

}
