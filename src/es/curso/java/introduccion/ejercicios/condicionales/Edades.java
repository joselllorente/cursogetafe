package es.curso.java.introduccion.ejercicios.condicionales;

import java.util.Scanner;

public class Edades {

	public static void main(String[] args) {
		System.out.println("Introduce nombre");
		Scanner scan = new Scanner(System.in);
		String nombre = scan.nextLine();
		
		System.out.println("Introduce la edad");
		scan = new Scanner(System.in);
		int edad = scan.nextInt();
		String estado ="";
		if (edad>0) {
			if (edad <=5) {
				estado = "bebe";
			}else if (edad <=15) {
				estado = "niño";
			}else if (edad <=20) {
				estado = "adolescente";
			}else if (edad <=40) {
				estado = "adulto";
			}else if (edad <=60) {
				estado = "mayor";
			}else if (edad <=80) {
				estado = "anciano";
			}else {
				estado = "enhorabuena!";
			}
			System.out.println("Te llamas "+nombre +" y eres "+ estado);
		}else {
			System.out.println("Edad incorrecta");
		}
		
	}

}
