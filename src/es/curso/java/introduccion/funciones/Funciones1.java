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
		scan.nextLine();
		
		Math.random();
		metodoEstatico();
		f1.metodo1();
		metodoEstatico();
		Funciones2.metodo3();
		Funciones2 f2 = new Funciones2();
		f2.metodo4();
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
	void metodo1 () {
		System.out.println("Metodo1");
		metodoEstatico();
	}
	
	static void metodoEstatico () {
		System.out.println("Metodo Estático");
	}

}
