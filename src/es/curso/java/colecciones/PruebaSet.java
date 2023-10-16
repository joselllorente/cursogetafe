package es.curso.java.colecciones;

import java.util.HashSet;
import java.util.Set;

import es.curso.java.poo.Persona;


public class PruebaSet {

	public static void main(String[] args) {
		
		Set<Persona> personas = new HashSet<Persona>();
		
		Persona p = new Persona("Nombre1");
		Persona p1 = new Persona("Nombre3");

		System.out.println(personas.add(p));
		System.out.println(personas.add(p1));
		System.out.println(personas.add(new Persona("Nombre4")));
		System.out.println(personas.add(new Persona("Nombre5")));
		
		System.out.println(personas.size());
		
		for (Persona persona : personas) {
			System.out.println(persona.getNombre());
		}
		
		personas.remove(p);
		
		System.out.println(personas.size());
		
		for (Persona persona : personas) {
			System.out.println(persona.getNombre());
		}
		
	}

}


