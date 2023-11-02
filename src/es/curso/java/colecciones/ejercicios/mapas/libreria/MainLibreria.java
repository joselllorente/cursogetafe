package es.curso.java.colecciones.ejercicios.mapas.libreria;

import es.curso.java.utils.Utilidades;

public class MainLibreria {

	public static void main(String[] args) {
		MainLibreria mainLibreria = new MainLibreria();
		mainLibreria.iniciaLibreria();

	}

	private void iniciaLibreria () {
		Biblioteca biblioteca = new Biblioteca("Biblioteca1");
		int opcion=0;
		do {
			//Mostrar los libros disponibles
			biblioteca.mostrarLibrosDisponibles();
			
			//Pinta Menu
			String[] preguntas = {"1. Agregar libro","2. Prestar ","3. Devolver","4. Salir"};
			opcion = Utilidades.pintarMenu(preguntas, "Elige una opcion");
			
			switch (opcion) {
			case 1: agregarLibro(biblioteca); break;
			case 2: prestarLibro(biblioteca); break;
			case 3: devolverLibro(biblioteca); break;
			case 4: System.out.println("Adios");break;
			default: System.out.println("Opción incorrecta");
			}
			
			
			
		}while(opcion!=4);
		
	}
	
	public void agregarLibro(Biblioteca biblioteca) {
		
		String titulo = Utilidades.pideDatoTexto("Introduce Titulo");
		String autor = Utilidades.pideDatoTexto("Introduce Autor");
		int copias = Utilidades.pideDatoNumerico("Introduce numero de copias");
		
		biblioteca.aniadirLibro(titulo,autor,copias);
		
	}
	
	
	public void prestarLibro(Biblioteca biblioteca) {
		String titulo = Utilidades.pideDatoTexto("Introduce Titulo del libro");
		if(biblioteca.existeLibro(titulo) && biblioteca.estaDisponible(titulo)) {
			biblioteca.prestarLibro(titulo);
		}else {
			System.out.println("El libro "+ titulo + " no está en el catálogo");
		}
	
	}
	
	public void devolverLibro(Biblioteca biblioteca) {
		String titulo = Utilidades.pideDatoTexto("Introduce Titulo del libro");
		if(biblioteca.existeLibro(titulo)) {
			biblioteca.devolverLibro(titulo);
		}else {
			System.out.println("El libro "+ titulo + " no está en el catálogo");
		}
	
	}
	
}
