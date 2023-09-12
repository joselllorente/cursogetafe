package es.curso.java.introduccion.ejercicios.bucles;

import java.util.Scanner;

public class Multiplos3y5 {

	public static void main(String[] args) {
		int contador3 = 0;
		int contador5 = 0;
		
		System.out.println("Introduce 10 numeros");
		for ( int num=1;  num<=10 ;  num++  ) {
			System.out.println("Introduce el numero "+num);
			Scanner scan = new Scanner(System.in);
			int numero = scan.nextInt();
			
			
			if(numero%3==0) {
				contador3++;
			}
			
			if(numero%5==0) {
				contador5++;
			}
		}
		
		System.out.println("Hay "+ contador3 +" multiplos de 3");
		System.out.println("Hay "+ contador5 +" multiplos de 5");
		

	}

}

