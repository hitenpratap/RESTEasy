package com.resteasy.controller;

import com.resteasy.model.User;
import org.apache.commons.lang3.RandomStringUtils;
import org.jboss.resteasy.annotations.Form;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by hitenpratap on 17/03/17.
 */
@Path("/users")
public class UserController {

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Response getUserById(@PathParam("id") Integer id) {
        User user = new User();
        user.setId(id);
        user.setFirstName(RandomStringUtils.randomAlphabetic(6));
        user.setLastName(RandomStringUtils.randomAlphabetic(8));
        user.setEmailAddress("abc" + id + "@email.com");
        return Response.status(200).entity(user).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public Response save(@Form User user) {
        return Response.status(200).entity(user).build();
    }

}
