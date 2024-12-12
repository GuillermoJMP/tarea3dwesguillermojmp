package com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.views;

import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.models.Planta;
import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.services.PlantaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class PlantaView {

    @Autowired
    private PlantaService plantaService;

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Gestión de Plantas ===");
            System.out.println("1. Listar Plantas");
            System.out.println("2. Agregar Planta");
            System.out.println("3. Buscar Planta por ID");
            System.out.println("4. Eliminar Planta");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1 -> listarPlantas();
                case 2 -> agregarPlanta(scanner);
                case 3 -> buscarPlanta(scanner);
                case 4 -> eliminarPlanta(scanner);
                case 5 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

    private void listarPlantas() {
        plantaService.listarPlantas().forEach(planta -> 
            System.out.println(planta.toString()));
    }

    private void agregarPlanta(Scanner scanner) {
        System.out.print("Código: ");
        String codigo = scanner.nextLine();
        System.out.print("Nombre Común: ");
        String nombreComun = scanner.nextLine();
        System.out.print("Nombre Científico: ");
        String nombreCientifico = scanner.nextLine();

        Planta planta = new Planta(null, codigo, nombreComun, nombreCientifico);
        plantaService.guardarPlanta(planta);
        System.out.println("Planta agregada con éxito.");
    }

    private void buscarPlanta(Scanner scanner) {
        System.out.print("ID de la planta: ");
        Long id = scanner.nextLong();
        plantaService.buscarPorId(id).ifPresentOrElse(
            planta -> System.out.println(planta.toString()),
            () -> System.out.println("Planta no encontrada.")
        );
    }

    private void eliminarPlanta(Scanner scanner) {
        System.out.print("ID de la planta a eliminar: ");
        Long id = scanner.nextLong();
        plantaService.eliminarPlanta(id);
        System.out.println("Planta eliminada con éxito.");
    }
}
