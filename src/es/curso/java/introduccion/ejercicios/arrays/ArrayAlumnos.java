package es.curso.java.introduccion.ejercicios.arrays;

import java.util.Scanner;

public class ArrayAlumnos {

	public static void main(String[] args) {
	
		/*
		#Preguntar nombre del alumno y la nota.
		
		Indicar número de notas a almacenar, preguntar y guardar las notas.
		- Sacar la media de las notas
		- Nota máxima
		- Nota mínima
				
		*/
		
		System.out.println("Ingrese el número de alumnos: ");
		Scanner scan = new Scanner(System.in);
		int numAlu = scan.nextInt();
	
		double [] notas = new double [numAlu];
		
		double suma = 0;
		
		String [] alumnos = new String [numAlu];
		String aluMayor = "";
		String aluMenor = "";		
		
		for (int i = 0 ; i < notas.length ; i++ ) {
			
			System.out.println("¿Cuál es el nombre del alumno nº " + (i+1) + "?");
			scan = new Scanner(System.in);
			alumnos[i] = scan.nextLine();
			System.out.println("Indica nota del alumno nº " + (i+1) + ":");
			scan = new Scanner(System.in);
			notas[i] = scan.nextFloat();
			
		}
		
		double notaMax = notas[0];
		double notaMin = notas[0];
		
		for (double nota : notas) {
			System.out.println(nota);
			
			suma += nota; 
			
		}
		
		for (int i = 1 ; i < numAlu ; i++) {
			
			if (notas[i] > notaMax) {
				
				notaMax = notas[i];
				aluMayor = alumnos[i];
			}
			
			if (notas[i] < notaMin) {
				
				notaMin = notas[i];
				aluMenor = alumnos[i];
			}
		}
		
		System.out.println("La media es " + (suma/numAlu));
		System.out.println("Alumno con nota máxima: " + aluMayor + " y es " + notaMax);
		System.out.println("Alumno con nota mínima: " + aluMenor + " y es " + notaMin);
		
		//Un nuevo array con las notas ordenadas de mayor a menor
		for (int i = 0 ; i < notas.length-1 ; i++) {
			for (int j = i+1 ; j < notas.length ; j++) {
				if (notas[j]>notas[i]) {
					double newNota = notas[j];
					notas[j] = notas[i];
					notas[i] = newNota;
					
					String newAlu = alumnos[j];
					alumnos[j] = alumnos[i];
					alumnos[i] = newAlu;
					
				}
			}
			
		}
		
		for (int i = 0 ; i < numAlu ; i++ ) {
			
			System.out.println(alumnos[i] + ": " + notas[i]);
			
		}
	}

}
