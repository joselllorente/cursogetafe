package es.curso.java.ddbb.ejercicios.biblioteca;

import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import es.curso.java.colecciones.ejercicios.mapas.libreria.Libro;
import es.curso.java.ddbb.ejercicios.biblioteca.dao.BibliotecaDAO;
import es.curso.java.ddbb.ejercicios.biblioteca.entities.Biblioteca;
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
			Biblioteca biblioElegida= mapBibliotecas.get(opcion);
			cargarSubmenu(biblioElegida);
		}
		
	}
	
	public void cargarSubmenu(Biblioteca b) {
		String[] opciones = new String[3];
		opciones[0]="";
		opciones[1]="";
		
		String[] opciones2 = {"","",""};
		
		Utilidades.pintarMenu(new String[] {"","",""} , null);
		
		
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
