package es.curso.java.utils;

import java.util.Scanner;

public class Utilidades {

	public static String pideDatoTexto (String texto) {
		String reply=null;
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		reply = scan.nextLine();
		
		return reply;
	}
	
	public static int pideDatoNumerico (String texto) {
		int reply=0;
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		reply = scan.nextInt();
		
		return reply;
	}
	
	
}
