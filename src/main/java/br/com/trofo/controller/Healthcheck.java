package br.com.trofo.controller;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Component
@Path("/")
public class Healthcheck {

    @Path("/ping")
    @GET
    public String ping() {
        return "pong";
    }
}
