package com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.principal;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;

public class Principal implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Menu:");
		System.out.println("Opcion 1:Login");
		System.out.println("Opcion 2:Invitado");
		System.out.println("Opcion 9:Exit");

		Scanner sc = new Scanner(System.in);

		
		switch (key) {
		case 1: {

			yield type;
		}
		case 2: {

			yield type;
		}
		case 9: {

			yield type;
		}

		default:
			throw new IllegalArgumentException("Introduce una de las siguientes opciones");
		}

	}
}
