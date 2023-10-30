package es.curso.java.colecciones.mapas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PruebaMapas {

	public static void main(String[] args) {
		
		Map<Integer,String> mapa1 = new HashMap<Integer,String>();
		
		//Añadir información al mapa
		mapa1.put(1,"Amarillo");
		mapa1.put(2,"Rojo");
		mapa1.put(3,"Verde");
		mapa1.put(4,"Naranja");
		String datoAntiguo = mapa1.put(1, "Azul");
		System.out.println( datoAntiguo );

		System.out.println(mapa1.containsKey(1));
		System.out.println(mapa1.containsValue("azul"));
		
		mapa1.remove(3);
		//Solo reemplaza si el objeto antiguo que le pasas está para esa clave
		mapa1.replace(4, "Naranja", "Rosa");
		
		//Accedemos a todas las claves
		Set<Integer> claves = mapa1.keySet();
		for (Integer num : claves) {
			System.out.println(num);
			//Accedemos al valor de cada clave
			System.out.println(mapa1.get(num));
		}
		
		//Recorre los valores
		Collection<String> valores = mapa1.values();
		for (String color : valores) {
			System.out.println(color);
		}
		
		
		//Objeto Entry nos permite recorrer de manera directa 
		//las claves y valores de un mapa
		Set<Entry<Integer,String>> entries = mapa1.entrySet();
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + " " +entry.getValue());
		}
		
		boolean mapaVacio = mapa1.isEmpty();
		
		
		
		
		
		//System.out.println(mapa1.get(1));
		
	}

}
