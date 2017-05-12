package com.paxxi.routing.machine.prm;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.server.mvc.Viewable;

/**
 * Root resource (exposed at "myresource" path)
 */
//@Path("api")
@Path("/")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Hello, Heroku2! https://jersey.java.net/documentation/latest/getting-started.html#new-webapp";
    }
    
    @GET
    @Path("get")
    @Produces({MediaType.TEXT_HTML})
    public Viewable form(
//    		@Context HttpServletRequest request
    		) {
        return new Viewable("/form.jsp", null);
    }
}
