package com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.views;

import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.models.Credenciales;
import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.services.CredencialesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class CredencialesView {

    @Autowired
    private CredencialesService credencialesService;

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Gestión de Credenciales ===");
            System.out.println("1. Buscar Credenciales por Usuario");
            System.out.println("2. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> buscarCredenciales(scanner);
                case 2 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 2);
    }

    private void buscarCredenciales(Scanner scanner) {
        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();
        credencialesService.buscarPorUsuario(usuario).ifPresentOrElse(
            credenciales -> System.out.println("Credenciales encontradas: " + credenciales.toString()),
            () -> System.out.println("Credenciales no encontradas.")
        );
    }
}
