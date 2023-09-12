package es.curso.java.introduccion.ejercicios.bucles;

import java.util.Scanner;

public class Collatz {

	public static void main(String[] args) {

		System.out.println("Introduce numero ");
		Scanner scan = new Scanner(System.in);
		long numero = scan.nextInt();
		//1687461854
		System.out.println(numero);
		//for (  ; numero!=1 ;   ) {
		while (numero!=1) {
			
//			if (numero%2==0) {
//				//numero=numero/2;
//				numero/=2;
//			}else {
//				numero = numero*3+1;
//			}
			
			//OPerador ternario
			numero = numero%2==0 ? numero/=2 : numero*3+1;
			
			System.out.println(numero);
		}
		
		while (numero!=1) {
			numero = numero%2==0 ? numero/=2 : numero*3+1;
			System.out.println(numero);
		}
		
		do {
			
			
		}while(7>5);

	}

}
