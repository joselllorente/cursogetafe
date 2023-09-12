package es.curso.java.introduccion.ejercicios.bucles;

import java.util.Scanner;

public class MenuDoWhile {

	public static void main(String[] args) {
		int opcion=0;
		do {
			String menu = "1. Opcion1\n2. Opcion2\n3. Opcion3\n4. Opcion4\n5. Salir";
			System.out.println(menu);
			System.out.println("Selecciona una opcion");
			Scanner scan = new Scanner(System.in);
			opcion = scan.nextInt();
			
			System.out.println("Opcion seleccionada " + opcion);
		}while (opcion!=5);
		
		
	}

}

