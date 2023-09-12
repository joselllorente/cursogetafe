package es.curso.java.introduccion.ejercicios.bucles;

import java.util.Scanner;

public class Fibonacci {

	//1,1,2,3,5,8,13,21
	
	public static void main(String[] args) {
		System.out.println("Introduce numero elementos a mostrar");
		Scanner scan = new Scanner(System.in);
		int numElementos = scan.nextInt();

		int num1 = 1;
		int num2 = 1;

		System.out.print(num1);
		System.out.print("," + num2);

		for (int i = 0; i < numElementos-2 ;  ++i) {
		//for (int i = 0; i < numElementos - 2; System.out.println("i:" + ++i)) {
			int suma = num1 + num2;
			System.out.print("," + suma);
			num1 = num2;
			num2 = suma;
		}

	}

}
