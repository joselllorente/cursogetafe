package es.curso.java.introduccion.funciones;

import java.util.Scanner;

public class Funciones1 {

	public static void main(String[] args) {
		
		for (String valor : args) {
			System.out.println(valor);
		}
		
		
		// TODO Auto-generated method stub
		Funciones1 f1 = new Funciones1();
		String msg = "Hola";
		Scanner scan = new Scanner(System.in);
		//scan.nextLine();
		
		Math.random();
		metodoEstatico();
		metodo1();
		metodoEstatico();
		Funciones2.metodo3();
		
		//Estan las clases en el mismo paquete
		Funciones2.metodo4();
		
		String texto = metodo6();
		System.out.println(texto);
		//System.out.println(metodo6());
		
		String textoPar = "asdasdasd";
		boolean numeroPar = numeroParCaracteres(textoPar);
		String mensaje = numeroPar?"Es par":"Es impar";
		System.out.println(mensaje + " con "+ textoPar.length() + " caracteres");
	}

	// Declaración de un método
	// 1. modificador de acceso:
	//=======================================================================
	// + public: modificador que permite el acceso desde cualquier otra clase.
	// + private: solo se puede acceder desde la clase en la que está declarado
	// + package (defecto) : Solo la propia clase y las clases que están en el mismo
	// paquete tienen acceso a ese método
	// + protected: Igual que package pero las clases hijas aunque estén en
	// diferentes paquetes tendrán acceso
	
	// 2. static
	static void metodo1 () {
		System.out.println("Metodo1");
		metodoEstatico();
	}
	
	static void metodoEstatico () {
		System.out.println("Metodo Estático");
	}
	
	
	//3. Devolución de objetos
	// - void: no devuelve nada
	// - objeto o tipo primitivo: return 
	static String metodo6 () {
		String mensaje = "Hola";
		
		return mensaje;
	}
	
	
	static boolean numeroParCaracteres(String cadena) {
		int numCaracteres = cadena.length();
		boolean esPar = true;
		if (numCaracteres%2!=0) {
			esPar = false;
			//return false;
		}else {
			//return true;
		}
		
		return esPar;
		
		//return cadena.length()%2==0;
	}
	

}
