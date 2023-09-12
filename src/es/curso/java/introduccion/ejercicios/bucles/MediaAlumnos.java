package es.curso.java.introduccion.ejercicios.bucles;

import java.util.Scanner;

public class MediaAlumnos {

	public static void main(String[] args) {
		
		System.out.println("Introduce numero de alumnos");
		Scanner scan = new Scanner(System.in);
		int numAlumnos = scan.nextInt();
		double sumatorioNotas = 0;
		double nota = 0;
		for ( int num=1;  num<=numAlumnos ;  num++  ) { 
			System.out.println("Introduce nota alumno " + num);
			scan = new Scanner(System.in);
			nota = scan.nextDouble();
			sumatorioNotas = sumatorioNotas + nota  ;
			//sumatorioNotas += scan.nextDouble();
		}
		
		System.out.println("La media de todos los alumnos es " + 
					sumatorioNotas/numAlumnos);
	}//1,2,3,

}