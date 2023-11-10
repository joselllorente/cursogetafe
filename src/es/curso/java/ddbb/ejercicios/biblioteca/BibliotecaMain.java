package es.curso.java.ddbb.ejercicios.biblioteca;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import es.curso.java.ddbb.ejercicios.biblioteca.dao.BibliotecaDAO;
import es.curso.java.ddbb.ejercicios.biblioteca.dao.LibroDAO;
import es.curso.java.ddbb.ejercicios.biblioteca.entities.Biblioteca;
import es.curso.java.ddbb.ejercicios.biblioteca.entities.Libro;
import es.curso.java.utils.Utilidades;

public class BibliotecaMain {
	private Map<Long,Biblioteca> mapBibliotecas;
	
	public BibliotecaMain() {
		super();
		this.mapBibliotecas = new HashMap();
	}

	public static void main(String[] args) {
		BibliotecaMain bibliotecaMain = new BibliotecaMain();
		bibliotecaMain.inicio();
		
	}

	public void inicio () {
		
		cargarDatosBiblioteca();
		int opcion = crearMenuPrincipal();
		if (opcion==(mapBibliotecas.size()+1)) {
			System.out.println("Adios");
		}else {
			Biblioteca biblioElegida= mapBibliotecas.get((long)opcion);
			cargarSubmenu(biblioElegida);
		}
		
	}
	
	public void cargarSubmenu(Biblioteca biblioteca) {
//		String[] opciones = new String[3];
//		opciones[0]="";
//		opciones[1]="";
//		
//		String[] opciones2 = {"","",""};
		
		int opcion = Utilidades.pintarMenu(new String[] {"1. Mostrar Info biblioteca","2. Mostrar Libros de la biblioteca"} , 
				"Seleccione una opción");
		
		switch (opcion) {
			case 1: mostrarInfoBiblioteca(biblioteca); break;
			case 2: mostrarLibrosBiblioteca(biblioteca); break;
			default: System.out.println("opcion incorrecta");	
		}

	}

	public void mostrarInfoBiblioteca(Biblioteca biblioteca) {
		
		System.out.println(biblioteca);

		
	}
	
	public void mostrarLibrosBiblioteca(Biblioteca b) {
		
		try {
			LibroDAO libroDAO = new LibroDAO();
			List<Libro> libros = libroDAO.getLibros(b.getId());
			for (Libro libro : libros) {
				System.out.println(libro);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	public void cargarDatosBiblioteca () {
		
		try {
			BibliotecaDAO bibliotecaDAO = new BibliotecaDAO();
			
			for (Biblioteca biblioteca :  bibliotecaDAO.getBibliotecas()) {
				mapBibliotecas.put(biblioteca.getId(), biblioteca);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public int crearMenuPrincipal() {
		
		Set<Entry<Long,Biblioteca> > entryBiblioteca  =  mapBibliotecas.entrySet();
		int opcion = 0;
		do {
			for (Entry<Long, Biblioteca> entry : entryBiblioteca) {
				System.out.println(entry.getKey() + ". " + entry.getValue().getNombre());
			}
			opcion = Utilidades.pintarMenu((entryBiblioteca.size()+1) + ". Salir");
			
		}while (!mapBibliotecas.containsKey((long)opcion));

		return opcion;
	}
	
	
	
}
