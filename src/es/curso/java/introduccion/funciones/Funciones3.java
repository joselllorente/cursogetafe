package es.curso.java.introduccion.funciones;

import es.curso.java.utils.Utilidades;

public class Funciones3 {

	public static void main(String[] args) {
		String nombre = Utilidades.pideDatoTexto("Introduce tu dni");
		System.out.println("El nombre introducido es: "+nombre);
		
		int edad = Utilidades.pideDatoNumerico("Introduce tu edad");
		System.out.println(edad);

	}

}
