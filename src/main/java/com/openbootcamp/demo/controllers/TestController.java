package com.openbootcamp.demo.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

@Component
@Path("/test")
public class TestController {

    @GET
    @Path("/hello")
    @Produces("Application/json")
    public String[] myTest() {
        String[] myreturn = {"hello, world", "by, world."};
        return myreturn;
    }

}