package com.openbootcamp.demo.controllers;

import java.net.URI;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.openbootcamp.demo.models.Bootcamper;
import com.openbootcamp.demo.services.BootcamperService;

@Component
@Path("/")
public class BootcampersController {
    private BootcamperService bootcamperService;

    public BootcampersController(BootcamperService bootcamperService) {
        this.bootcamperService = bootcamperService;

        this.bootcamperService.add(new Bootcamper("Luis", 20));
        this.bootcamperService.add(new Bootcamper("María", 28));
    }

    @GET
    @Path("hi")
    public String hola() {
        return "hola";
    }

    @GET
    @Path("/bootcampers")
    @Produces("Application/json")
    public List<Bootcamper> listAll() {
        return this.bootcamperService.getAll();

    }

    @GET
    @Path("/bootcampers/{name}")
    @Produces("Application/json")
    public Bootcamper getOnebootcamper(@PathParam("name") String name) {
        Bootcamper nn = this.bootcamperService.getOne(name);

        return nn;
    }

    @POST
    @Path("/bootcampers")
    @Produces("Application/json")
    @Consumes("Application/json")
    public Response pushBootcamper(Bootcamper bootcamper) {
        this.bootcamperService.add(bootcamper);

        return Response
                .created(URI.create("/bootcampers/" + bootcamper.getName()))
                .build();
    }

}