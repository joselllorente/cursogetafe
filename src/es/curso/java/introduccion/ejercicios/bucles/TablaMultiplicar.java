package es.curso.java.introduccion.ejercicios.bucles;

import java.util.Scanner;

public class TablaMultiplicar {
	public static void main(String[] args) {
		System.out.println("Introduce numero ");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		
		//Tabla del numero indicado
		for (int i=0; i<=10; i++) {
			System.out.println(numero + "*" + i +"=" + (numero*i));
		}
		
		System.out.println("==============================================");
		//Todas las tablas del 1 al 10
		for (int i=1; i<=10; i++) {
			System.out.println("Para el numero " + i);
			for (int j=0; j<=10; j++) {
				System.out.println(i + "*" + j +"=" + (i*j));
			}
			System.out.println("====");
			
		}
		
		
	}
}