package com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.views;

import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.models.Mensaje;
import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.services.MensajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class MensajeView {

    @Autowired
    private MensajeService mensajeService;

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Gestión de Mensajes ===");
            System.out.println("1. Listar Mensajes");
            System.out.println("2. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> listarMensajes();
                case 2 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 2);
    }

    private void listarMensajes() {
        mensajeService.listarMensajes().forEach(mensaje ->
            System.out.println(mensaje.toString()));
    }
}
