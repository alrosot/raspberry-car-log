package br.com.trofo;

import br.com.trofo.config.MainConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(MainConfig.class)
public class RaspberryCarLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(RaspberryCarLogApplication.class, args);
	}
}
