package es.curso.java.examen.modulo2.parte2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrincipalParte2 {

	public static void main(String[] args) {
		PrincipalParte2 principal = new PrincipalParte2();
		try {
			List<String> lineas = principal.leerArchivo("./examen/FicheroEjercicio2.txt");
			Map<Integer,String> lineasFichero = new HashMap<>();
			
			int i = 1;
			for (String linea : lineas) {
				//linea = linea.toLowerCase();
				if (linea.toLowerCase().contains("java")) {
					lineasFichero.put(i, linea);
					//System.out.println(linea);
				}
				i++;
			}
			
			System.out.println("\nLineas que contienen java");
			Set<Integer> lineasJava = lineasFichero.keySet();
			for (Integer numLinea : lineasJava) {
				System.out.println(numLinea);
			}
			
			System.out.println();
			Set<Entry<Integer,String>  > entryLines =  lineasFichero.entrySet();
			for (Entry<Integer, String> entry : entryLines) {
				int suma = entry.getKey() + entry.getValue().length();
				System.out.println("Para la linea "+ entry.getKey() + " la suma es "+ suma);
			}

			System.out.println("Fin");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private List<String> leerArchivo(String nombre) throws IOException{
		Path path = Paths.get(nombre);
		List<String> lines = Files.readAllLines(path);
		
		return lines;
	}

}
