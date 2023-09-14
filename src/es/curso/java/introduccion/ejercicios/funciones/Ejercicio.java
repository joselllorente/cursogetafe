package es.curso.java.introduccion.ejercicios.funciones;

import java.util.Scanner;

public class Ejercicio {
	
	public static void main(String[] args) {
		
		pintaTablas ();
		int numero_mio = 8;
		pintaTablaMultiplicar(numero_mio);
		
		
		Scanner scan = new Scanner(System.in);
		double espacio = scan.nextDouble();
		scan = new Scanner(System.in);
		int tiempo = scan.nextInt();
		calculaVelocidad(espacio , tiempo);

	}
	
	
	
	public static void calculaVelocidad(double distancia, int tiempo) {
		
		System.out.println("Velocidad: "+distancia/tiempo);
	}
	
	public static void pintaTablaMultiplicar (int numero) {
		for (int j =0; j<=10; j++ ) {
			System.out.println(numero + "x" +j + "="+(numero*j));
		}
	}
	
	public static void pintaTablas () {
		
		for(int i=1;i<=10; i++) {
			for (int j =0; j<=10; j++ ) {
				System.out.println(" "+i + "x" +j + "="+(i*j));
				
			}
			System.out.println("=====================");
			
		}
		
	}

}
