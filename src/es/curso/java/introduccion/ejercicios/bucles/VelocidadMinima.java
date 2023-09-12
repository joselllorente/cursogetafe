package es.curso.java.introduccion.ejercicios.bucles;

import java.util.Scanner;

public class VelocidadMinima {
	public static void main(String[] args) {
		System.out.println("Introduce numero de coches");
		Scanner scan = new Scanner(System.in);
		int numCoches = scan.nextInt();
		int velocidaMinima = 400;
		
		for (int i=1; i<=numCoches; i++) {
			System.out.println("Introduce la velocidad del coche "+i);
			scan = new Scanner(System.in);
			int velocidadCoche = scan.nextInt();
			
			if (velocidadCoche<velocidaMinima) {
				velocidaMinima = velocidadCoche;
			}
			
		}
		
		
		System.out.println("La velocidad mínima es "+velocidaMinima);
		
	}
}
