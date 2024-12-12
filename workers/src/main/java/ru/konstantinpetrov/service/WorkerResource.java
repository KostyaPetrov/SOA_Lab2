package ru.konstantinpetrov.service;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class WorkerResource {
    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello, JAX-RS with Java 17!";
    }


    @POST
    @Produces(MediaType.APPLICATION_ATOM_XML)
    public String addWorker() {
        return "Add worker";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getAllWorker() {
        return "get All worker";
    }

    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_PLAIN)
    public String test() {
        return "test";
    }
}
