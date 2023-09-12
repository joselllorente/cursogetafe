package es.curso.java.introduccion.ejercicios.arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ColoresArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el número de colores que quieres guardar");
		int numColores = scan.nextInt();
		
		String [] colores = new String[numColores];
		
		for (int i = 0; i < colores.length; i++) {
			System.out.println("Introduce el color "+(i+1));
			scan = new Scanner(System.in);
			colores[i] = scan.nextLine().trim();
		}
		
		//Bucle tradicional
//		for (int i = 0; i < colores.length; i++) {
//			System.out.println(colores[i]);
//		}
		
		//Bucle for-each
		//mostramos todos los colores
		for (String color : colores) {
			System.out.println(color);
		}
		
		for (String color : colores) {
			if (color.contains("o") && color.toLowerCase().charAt(0)=='a') {
			//if (color.contains("o") && color.toLowerCase().startsWith("a")) {
				System.out.println(color);
			}
		}
		
		
		
	}

}
