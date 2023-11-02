package es.curso.java.colecciones.ejercicios.mapas.libreria;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
	
	private String nombre;
	private Map<String, Libro> catalogo;
	
	public Biblioteca(String nombre, Map<String, Libro> catalogo) {
		super();
		this.nombre = nombre;
		this.catalogo = catalogo;
	}
	
	public Biblioteca(String nombre) {
		super();
		this.nombre = nombre;
		catalogo = new HashMap<String, Libro>();
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the catalogo
	 */
	public Map<String, Libro> getCatalogo() {
		return catalogo;
	}

	/**
	 * @param catalogo the catalogo to set
	 */
	public void setCatalogo(Map<String, Libro> catalogo) {
		this.catalogo = catalogo;
	}
	
	
	public void aniadirLibro (Libro libro) {
		if (existeLibro(libro.getTitulo())) {
			
			Libro libroActualizar = catalogo.get(libro.getTitulo());
			//libroActualizar.setNumCopias(libroActualizar.getNumCopias()+1);
			libroActualizar.actualizarCopias(libro.getNumCopias());
			
		}else {
			catalogo.put(libro.getTitulo(), libro);
		}
	}
	
	public void aniadirLibro (String titulo, String autor, int cantidad) {
		Libro libro = new Libro(titulo, autor, cantidad);
		aniadirLibro(libro);
	}
	
	public void aniadirLibro (String titulo, String autor) {
		aniadirLibro(titulo,autor,1);
	}
	
	
	public void prestarLibro(String titulo) {
		
		Libro libroActualizar = catalogo.get(titulo);
		libroActualizar.actualizarCopias(-1);
		
	}
	
	public void devolverLibro(String titulo) {
		
		Libro libroActualizar = catalogo.get(titulo);
		libroActualizar.actualizarCopias(1);
		
	}
	
	
	public boolean existeLibro(String titulo) {

		return catalogo.containsKey(titulo);
	}
	
	public boolean estaDisponible(String titulo) {
		return catalogo.get(titulo).getNumCopias()>0;
	}
	
	public void mostrarLibrosDisponibles() {
		System.out.println("Libros disponibles");
		Collection<Libro> libros = catalogo.values();
		for (Libro libro : libros) {
			if (libro.getNumCopias()>0) {
				System.out.println(libro.getTitulo() + " " + libro.getNumCopias());
			}
		}
		System.out.println();
	}
	
}
