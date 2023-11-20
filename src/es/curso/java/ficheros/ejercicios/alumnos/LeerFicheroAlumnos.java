package es.curso.java.ficheros.ejercicios.alumnos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import es.curso.java.poo.ejercicios.Alumno;

public class LeerFicheroAlumnos {

	public static void main(String[] args) {
		LeerFicheroAlumnos leer = new LeerFicheroAlumnos();
		try {
			System.out.println(leer.leerFicheroAlumnos(
					"./recursos/alumnos.txt").size());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public List<Alumno> leerFicheroAlumnos(String rutaFichero) 
			throws IOException{
		
		return leerFicheroAlumnos(rutaFichero,0);
		
	}
	
	
	public List<Alumno> leerFicheroAlumnos(String rutaFichero, 
			int skipLines) throws IOException{
		Path path = Paths.get(rutaFichero);
		List<Alumno> alumnos = new ArrayList();

		List<String> lines = Files.readAllLines(path);
		int numLinea = 1;
		for (String linea : lines) {
			if (numLinea>skipLines) {
				String[] datos = linea.split("\\|");
				
				String dni = datos[2];
				String nombre = datos[0];
				String apellidos = datos[1];
				double nota = Double.parseDouble(datos[3]);
				boolean isVip = datos[4].equals("1");
				
				Alumno alumno = new Alumno(dni, nombre, apellidos, nota , isVip);
				alumnos.add(alumno);
			}
			numLinea++;
		}

		return alumnos;
	}
	
	

}
