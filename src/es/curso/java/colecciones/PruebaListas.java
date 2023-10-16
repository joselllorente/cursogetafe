package es.curso.java.colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import es.curso.java.poo.Persona;
//import es.curso.java.poo.ejercicios.hospital.Persona;

public class PruebaListas {

	public static void main(String[] args) {
		
		ArrayList<Persona> lista1 = new ArrayList<Persona>();
		
		Persona p = new Persona("Eva");
		
		lista1.add(new Persona("Maria"));
		lista1.add(p);
		lista1.add(p);
		lista1.add(p);
		lista1.add(new Persona("Pedro"));
		lista1.add(new Persona("Angel"));
		//lista1.add("Rojo");
		
		//lista1.add(7,new Persona("Antonio"));
		System.out.println(lista1.size());
		Set<Persona> evas = new HashSet<Persona>();
		evas.add(p);
		
		lista1.remove(p);
		
		//lista1.removeAll(evas);
		
		List<Persona> l2 = lista1.subList(1, 1);
		lista1.removeAll(l2);
		
		System.out.println(lista1.size());
		
		//lista1.clear();
		
		if (!lista1.isEmpty()) {
			//System.out.println(lista1.get(0).getNombre());
		}
		
		for (Persona persona : lista1) {
			System.out.println(persona.getNombre());
		}
	
		System.out.println(lista1.contains(new Persona("Eva")));
		
		System.out.println(lista1.size());
		
//		
//		List<Persona> subLista = lista1.subList(0, 1);
//		subLista.remove(0);
//		
		System.out.println("============================");
		Iterator<Persona> ite = lista1.iterator();
		
//		while(ite.hasNext()) {
//			Persona person = ite.next();
//			System.out.println(person.getNombre());
//			Persona person2 = ite.next();
//			System.out.println(person2.getNombre());
//		}
		
		System.out.println("============================");
		lista1.stream().
			filter(xyu -> xyu.getNombre().startsWith("E")).
			forEach(System.out::println);
		
		
		
		
		
		
		ArrayList lista2 =
				new ArrayList<es.curso.java.poo.ejercicios.hospital.Persona>();

//		for (Object object : lista1) {
//			//System.out.println(object);
//			//if (object instanceof Persona) {
//				Persona p = (Persona)object;
//				System.out.println(p.getNombre());
//			//}
//		}

//		Persona [] personas = new Persona [4];
//		for (Persona persona : personas) {
//			
//		}
		
		
		
		
	}

}

