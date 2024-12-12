package com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.views.PlantaView;

@SpringBootApplication
public class Tarea3Application implements CommandLineRunner {

    @Autowired
    private PlantaView plantaView;

    public static void main(String[] args) {
        SpringApplication.run(Tarea3Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        plantaView.mostrarMenu();
    }
}
