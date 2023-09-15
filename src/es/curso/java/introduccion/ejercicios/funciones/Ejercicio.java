package es.curso.java.introduccion.ejercicios.funciones;

import java.util.Scanner;

public class Ejercicio {
	
	public static void main(String[] args) {
		
		pintaTablas ();
		int numero_mio = 8;
		pintaTablaMultiplicar(numero_mio);
		
		
//		Scanner scan = new Scanner(System.in);
//		double espacio = scan.nextDouble();
//		scan = new Scanner(System.in);
//		int tiempo = scan.nextInt();
//		calculaVelocidad(espacio , tiempo);
//		int numeroResultado= calculaVelocidad(100, 50);
//		System.out.println(numeroResultado);
//		
//		int resultado2 = numeroResultado*3;
		
		int edad = calculaEdad("2021");
		System.out.println("La edad es de "+edad);
	}
	
	/**
	 * 
	 * @param anio
	 * @return
	 */
	public static int calculaEdad (String anio) {
		final int anioActual = 2023;
		int edad = 0;
		int anioRecibido = Integer.parseInt(anio);
		edad = anioActual-anioRecibido;
		
		
		return edad;
	}
	
	
	public static int calculaVelocidad(double distancia, int tiempo) {
		int var = 0;
		System.out.println("Velocidad: "+distancia/tiempo);
		return var;
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
