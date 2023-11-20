package es.curso.java.ficheros.ejercicios.biblioteca;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import es.curso.java.ddbb.ejercicios.biblioteca.entities.Biblioteca;
import es.curso.java.ddbb.ejercicios.biblioteca.entities.Direccion;

public class LeerFicheroBiblioteca {

	public static void main(String[] args) {
		LeerFicheroBiblioteca leer = new LeerFicheroBiblioteca();
		try {
			leer.leerFicheroBiblioteca("./recursos/biblioteca.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public List<Biblioteca> leerFicheroBiblioteca(String rutaFichero) 
			throws IOException{
		
		return leerFicheroBiblioteca(rutaFichero,0);
		
	}
	
	
	public List<Biblioteca> leerFicheroBiblioteca(String rutaFichero, 
			int skipLines) throws IOException{
		Path path = Paths.get(rutaFichero);
		List<Biblioteca> bibliotecas = new ArrayList();

		List<String> lines = Files.readAllLines(path);
		int numLinea = 1;
		for (String linea : lines) {
			if (numLinea>skipLines) {
				String[] datos = linea.split("\\|");
				
				String tipoCalle = datos[0];
				String calle = datos[1];
				String ciudad = datos[2];
				String provincia = datos[3];
				String codPostal = datos[4];
				String nombreBiblioteca = datos[5];
				
				Direccion direccion = new Direccion(tipoCalle, 
						calle, ciudad, provincia, Integer.parseInt(codPostal));
				Biblioteca biblioteca = new Biblioteca (nombreBiblioteca, direccion);
				bibliotecas.add(biblioteca);
				
				
			}
			numLinea++;
		}

		return bibliotecas;
	}
	
	

}
