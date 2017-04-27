package com.progressoft.restclient;






import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class Client {

    public static void main(String[] args) {
        ClientConfig clientConfig = new ClientConfig();
        javax.ws.rs.client.Client client = ClientBuilder.newClient(clientConfig);
        WebTarget target = client.target(getBaseURI());
        Response response = target.path("services").path("api").request().accept(MediaType.TEXT_PLAIN).get(Response.class);

        String htmlResponse = target.path("services").path("api").request().accept(MediaType.TEXT_PLAIN).get(String.class);
        String applicationXMLResponse = target.path("services").path("api").request().accept(MediaType.APPLICATION_XML).get(String.class);
        String applicationJsonResponse = target.path("services").path("api").request().accept(MediaType.APPLICATION_JSON).get(String.class);

        System.out.println("Response from REST Services >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> \n" + response.getStatus());
        System.out.println("Response from REST Services >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> \n" + htmlResponse);
        System.out.println("JAXB XML Response from REST Services >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> \n" + applicationXMLResponse);
        System.out.println("Json Response from REST Services >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> \n" + applicationJsonResponse);

    }

    private static URI getBaseURI() {
        return UriBuilder.fromUri("http://localhost:58080/restapi/").build();
    }
}
