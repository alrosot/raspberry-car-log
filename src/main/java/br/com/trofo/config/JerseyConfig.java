package br.com.trofo.config;


import br.com.trofo.controller.Healthcheck;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(Healthcheck.class);
    }


}
