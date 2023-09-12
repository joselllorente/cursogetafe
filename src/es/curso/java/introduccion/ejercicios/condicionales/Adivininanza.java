package es.curso.java.introduccion.ejercicios.condicionales;

import java.util.Scanner;

public class Adivininanza {

	public static void main(String[] args) {
		System.out.println("Oro parece, plata no es, quien no lo adivine...");
		Scanner scan = new Scanner(System.in);
		String respuesta = scan.nextLine();
		String respuestaCorrecta = "platano";
		
		if (respuesta.equalsIgnoreCase(respuestaCorrecta)) {
			System.out.println("Enhorabuena!!!!");
		}else {
			System.out.println("Respuesta incorrecta!");
		}
		
	}

}
