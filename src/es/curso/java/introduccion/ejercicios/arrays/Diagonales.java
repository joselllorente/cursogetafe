package es.curso.java.introduccion.ejercicios.arrays;

import java.util.Scanner;

public class Diagonales {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Introduce numero de filas");
		int num = scan.nextInt();
		
		//Declaramos la matriz cuadrada
		int[][] numeros = new int[num][num];
		
		//Rellenamos la matriz
		for (int i=0; i<numeros.length; i++) {
			for (int j=0; j<numeros[i].length; j++) {
				
				
				scan = new Scanner (System.in);
				System.out.println("Introduce el "
						+ "valor de la posición ["+i+"],["+j+"]");
				numeros[i][j]=scan.nextInt();
			}
		}
		
		//Mostramos los datos de la matriz
		for (int i=0; i<numeros.length; i++) {
			for (int j=0; j<numeros[i].length; j++) {
				System.out.print(numeros[i][j]);
			}
			System.out.println();
		}
		
		int [] diagonal = new int [num];
		
		//Sacamos los elementos de la diagonal principal y los guardamos 
		//en un array unidimensional
//		for (int i=0; i<numeros.length; i++) {
//			for (int j=0; j<numeros[i].length; j++) {
//				if (i==j) {
//					diagonal[i]=numeros[i][j];
//				}
//			}			
//		}
		
		//Otra forma de hacer lo mismo
		for(int i=0;i<num;i++) {
			diagonal[i]=numeros[i][i];
		}
		//Mostramos los datos del array unidimensional
		for (int numero : diagonal) {
			System.out.println(numero);
		}
		
		for ( int i=0, j= numeros.length-1  ;  i<numeros.length/2  ;  i++, j--) {
			int aux = numeros[i][j] ;
			numeros[i][j] =	numeros[j][i];
			numeros[j][i] = aux;
		}
		System.out.println("========================================");
		for (int i=0; i<numeros.length; i++) {
			for (int j=0; j<numeros[i].length; j++) {
				System.out.print(numeros[i][j]);
			}
			System.out.println();
		}
	}

}
