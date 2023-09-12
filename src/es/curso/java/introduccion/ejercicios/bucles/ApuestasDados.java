package es.curso.java.introduccion.ejercicios.bucles;

import java.util.Scanner;

public class ApuestasDados {

	public static void main(String[] args) {
		double importe = 1000;
		String respuesta = "";
		
		do {
		
			System.out.println("Cuanto quieres apostar de los " +importe+ " €");
			Scanner scan = new Scanner(System.in); 
			double importeApostado = scan.nextDouble();
			
			System.out.println("Por qué número quieres apostar??");
			scan = new Scanner(System.in);
			int numeroApostado = scan.nextInt();
			
			//GEnero la tirada del dado
			int tirada = (int)(Math.random()*6)+1;
			System.out.println("El dado ha sacado un "+tirada);
			importe-=importeApostado;
			if(numeroApostado==tirada) {
				System.out.println("Enhorabuena has acertado!!!");
				importe+=importeApostado*3;
			}
			
			if (importe>0) {
				System.out.println("Te quedan "+ importe + " euros");
				System.out.println("Quieres seguir jugando??");
				scan = new Scanner(System.in); 
				respuesta = scan.nextLine();
			}
//			if (respuesta.equals("No")) {
//				break;
//			}
			
		}while(importe>0 && !respuesta.equalsIgnoreCase("no"));
		
		System.out.println("Te has quedado con "+ importe);
	}

}
