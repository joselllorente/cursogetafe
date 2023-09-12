package es.curso.java.introduccion.ejercicios.condicionales;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		String menu = "1. Opcion1\n2. Opcion2\n3. Opcion3\n4. Opcion4\n5. Salir";
		System.out.println(menu);
		System.out.println("Selecciona una opcion");
		Scanner scan = new Scanner(System.in);
		int opcion = scan.nextInt();
		System.out.println(opcion);
		
		switch(opcion) {
			case 1:
			case 2:
			case 3:
			case 4: System.out.println("Has elegido la opcion "+opcion);break;
			case 5: System.out.println("Adios!!!");break;
			default: System.out.println("Opcion incorrecta");
		}
		
		
		

	}

}
