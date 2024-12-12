package com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.main;

import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.views.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Scanner;

@SpringBootApplication
@ComponentScan("com.tarea3dwesguillermojmp.tarea3dwesguillermojmp")
public class Tarea3Application implements CommandLineRunner {

    @Autowired
    private PlantaView plantaView;

    @Autowired
    private PersonaView personaView;

    @Autowired
    private CredencialesView credencialesView;

    @Autowired
    private EjemplarView ejemplarView;

    @Autowired
    private MensajeView mensajeView;

    public static void main(String[] args) {
        SpringApplication.run(Tarea3Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Menú Principal ===");
            System.out.println("1. Gestión de Plantas");
            System.out.println("2. Gestión de Personas");
            System.out.println("3. Gestión de Credenciales");
            System.out.println("4. Gestión de Ejemplares");
            System.out.println("5. Gestión de Mensajes");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> plantaView.mostrarMenu();
                case 2 -> personaView.mostrarMenu();
                case 3 -> credencialesView.mostrarMenu();
                case 4 -> ejemplarView.mostrarMenu();
                case 5 -> mensajeView.mostrarMenu();
                case 6 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
    }
}
