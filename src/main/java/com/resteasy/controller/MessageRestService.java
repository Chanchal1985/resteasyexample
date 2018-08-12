package com.resteasy.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/message")
public class MessageRestService {

    @GET
    @Path("/{param}")
    public Response printMessage(@PathParam("param") String message){
        return Response.status(Response.Status.OK).entity("Restful Example "+ message).build();
    }

    @GET
    @Path("/somemethod")
    public Response someMethod(){
        Response helloWorld = Response.status(Response.Status.OK).entity("HelloWorld").build();
        return helloWorld;
    }
}
