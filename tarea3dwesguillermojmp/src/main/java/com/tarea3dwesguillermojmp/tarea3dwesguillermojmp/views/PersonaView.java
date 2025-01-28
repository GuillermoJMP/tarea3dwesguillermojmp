package com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.views;

import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.models.Persona;
import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class PersonaView {

    @Autowired
    private PersonaService personaService;

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Gestión de Personas ===");
            System.out.println("1. Listar Personas");
            System.out.println("2. Agregar Persona");
            System.out.println("3. Buscar Persona por ID");
            System.out.println("4. Eliminar Persona");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> listarPersonas();
                case 2 -> agregarPersona(scanner);
                case 3 -> buscarPersona(scanner);
                case 4 -> eliminarPersona(scanner);
                case 5 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

    private void listarPersonas() {
        personaService.listarPersonas().forEach(persona ->
            System.out.println(persona.toString()));
    }

    private void agregarPersona(Scanner scanner) {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        Persona persona = new Persona(null, nombre, email);
        personaService.guardarPersona(persona);
        System.out.println("Persona agregada con éxito.");
    }

    private void buscarPersona(Scanner scanner) {
        System.out.print("ID de la persona: ");
        Long id = scanner.nextLong();
        personaService.buscarPorId(id).ifPresentOrElse(
            persona -> System.out.println(persona.toString()),
            () -> System.out.println("Persona no encontrada.")
        );
    }

    private void eliminarPersona(Scanner scanner) {
        System.out.print("ID de la persona a eliminar: ");
        Long id = scanner.nextLong();
        personaService.eliminarPersona(id);
        System.out.println("Persona eliminada con éxito.");
    }
}
