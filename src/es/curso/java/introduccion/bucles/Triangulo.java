package es.curso.java.introduccion.bucles;

import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		
		System.out.println("Ingresa la base del triangulo: ");
		Scanner scan =new Scanner(System.in);
		int base = scan.nextInt();
		for(int i= 0; i<base; i++) {
			for(int j = i;j<base;j++) {
				System.out.print("");
			}
			System.out.print("*");
			for(int x = 0;x<i*2-1; x++) {
				if(i == base-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			if(i != 0) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
