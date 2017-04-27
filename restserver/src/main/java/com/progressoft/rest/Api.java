package com.progressoft.rest;

import com.progressoft.rest.datastructures.Response;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class Api {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getHelloWorld(){
        return "Hello World TEXT";
    }

    @GET
    @Produces(MediaType.TEXT_XML)
    public String getHelloWorldXml(){
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?><hello> Hello XML</hello>";
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHtmlHello() {
        return "<html> " + "<title>" + "Hello Jersey" + "</title>"
                + "<body><h1>" + "Hello HTML" + "</body></h1>" + "</html> ";
    }

    @GET
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public Response getResponse(){
        Response response = new Response();
        response.setName("Mousa Ibrahim");
        return response;

    }
}
