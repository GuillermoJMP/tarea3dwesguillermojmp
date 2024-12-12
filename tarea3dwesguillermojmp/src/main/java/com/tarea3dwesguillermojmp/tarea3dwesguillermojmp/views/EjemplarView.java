package com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.views;

import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.models.Ejemplar;
import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.models.Planta;
import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.services.EjemplarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class EjemplarView {

    @Autowired
    private EjemplarService ejemplarService;

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Gestión de Ejemplares ===");
            System.out.println("1. Listar Ejemplares");
            System.out.println("2. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> listarEjemplares();
                case 2 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 2);
    }

    private void listarEjemplares() {
        ejemplarService.listarEjemplares().forEach(ejemplar ->
            System.out.println(ejemplar.toString()));
    }
}
