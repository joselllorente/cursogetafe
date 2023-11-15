package es.curso.java.ddbb.ejercicios.biblioteca;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import es.curso.java.ddbb.ejercicios.biblioteca.dao.BibliotecaDAO;
import es.curso.java.ddbb.ejercicios.biblioteca.dao.LibroDAO;
import es.curso.java.ddbb.ejercicios.biblioteca.entities.Biblioteca;
import es.curso.java.ddbb.ejercicios.biblioteca.entities.Libro;
import es.curso.java.ddbb.ejercicios.biblioteca.exceptions.NoResultsException;
import es.curso.java.utils.Utilidades;

public class BibliotecaMain {
	
	private static final Logger logger = LogManager.getLogger(BibliotecaMain.class);
	private Map<Long,Biblioteca> mapBibliotecas;
	private final int OPCION1 = 1;

	public BibliotecaMain() {
		super();
		this.mapBibliotecas = new HashMap();
	}

	public static void main(String[] args) {
			
		logger.info("Empezando Biblioteca");
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
		int opcion = 0;
		do {
			opcion = Utilidades.pintarMenu(new String[] 
					{"1. Mostrar Info biblioteca",
					"2. Mostrar Libros de la biblioteca",
					"3. Buscar Libro",
					"4. Insertar",
					"5. Modificar",
					"6. Borrar",
					"7. Precio Medio",
					"8. Salir",} ,
					
				"Seleccione una opción");
		
			switch (opcion) {
				case OPCION1: mostrarInfoBiblioteca(biblioteca); break;
				case 2: mostrarLibrosBiblioteca(biblioteca); break;
				case 3: buscarLibroBiblioteca(biblioteca); break;
				case 4: insertarLibroBiblioteca(biblioteca); break;
				case 6: borrarLibroBiblioteca(biblioteca); break;
				case 8: System.out.println("Adios!!!");; break;
				default: System.out.println("opcion incorrecta");	
			}

		}while(opcion!=8);
	}

	public void mostrarInfoBiblioteca(Biblioteca biblioteca) {
		
		System.out.println(biblioteca);

		
	}
	
	public void insertarLibroBiblioteca(Biblioteca biblioteca) {
		logger.debug("insertando libro para la biblioteca "+biblioteca);
		System.out.println(biblioteca);
		String titulo = Utilidades.pideDatoTexto("Introduce titulo libro");
		String autor = Utilidades.pideDatoTexto("Introduce autor libro");
		String isbn = Utilidades.pideDatoTexto("Introduce isbn libro");
		
		LibroDAO libroDAO;
		try {
			libroDAO = new LibroDAO();
			libroDAO.insertarLibro(titulo, autor,isbn,biblioteca.getId());
		} catch (SQLException e) {
			logger.error("Ha ocurrido una excepcion "+e.getMessage());
		} catch (NoResultsException nre) {
			logger.error("No se han insertado los datos del libro");
		}
		
		logger.debug("Fin llamada métod insertar libro");
		
		
	}
	
	
	public void borrarLibroBiblioteca(Biblioteca biblioteca) {
		
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
	
	public void buscarLibroBiblioteca (Biblioteca biblioteca) {
		
		String campo = Utilidades.pideDatoTexto("¿Por qué campo quieres buscar (Titulo,Autor,ISBN)?");
		String valor = Utilidades.pideDatoTexto("Introduce el valor a buscar del "+campo);
		
		Map<String, String> datos = new HashMap<String,String>();
		datos.put(campo, valor);
		
		try {
			LibroDAO libroDAO = new LibroDAO();
			
			List<Libro> libros = libroDAO.buscarLibro(biblioteca.getId(), datos);
			if (libros!=null && !libros.isEmpty()) {
				for (Libro libro : libros) {
					System.out.println(libro);
				}
			}else {
				System.out.println("No hay libros que reunan ese criterio");
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
