package com.tarea3dwesguillermojmp.tarea3dwesguillermojmp;



import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.main.Principal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Tarea3dwesguillermojmpApplication {
	
	@Bean
	public Principal applicationStartupRunner() {
		return new Principal();
	}

	public static void main(String[] args) {
		SpringApplication.run(Tarea3dwesguillermojmpApplication.class, args);
	}

}
