package es.curso.java.hibernate.relations.unomuchos;

import es.curso.java.hibernate.relations.unomuchos.entities.Libro;
import es.curso.java.hibernate.relations.unomuchos.entities.Persona;
import es.curso.java.hibernate.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* Primero creamos una persona y la asociamos con dos libros */
		Libro libro1 = new Libro();
		libro1.setTitulo("20000 leguas de viaje submarino");

		Libro libro2 = new Libro();
		libro2.setTitulo("La maquina del tiempo");

		Persona persona1 = new Persona();
		persona1.setNombre("Persona que se eliminara");
		persona1.addLibro(libro1);
		persona1.addLibro(libro2);

		libro1.setPersona(persona1);
		libro2.setPersona(persona1);
		
		
		/*
		 * Creamos una segunda persona, que sera eliminada, y la asociamos con otros dos
		 * libros
		 */
		Libro libro3 = new Libro();
		libro3.setTitulo("El ingenioso hidalgo...");

		Libro libro4 = new Libro();
		libro4.setTitulo("La Galatea");

		Persona persona2 = new Persona();
		persona2.setNombre("Alex");
		persona2.addLibro(libro3);
		persona2.addLibro(libro4);

		libro3.setPersona(persona2);
		libro4.setPersona(persona2);
		/*
		 * En la primer sesion guardamos las dos personas (los libros correspondientes
		 * seran guardados en cascada
		 */
		EntityManager em = JpaUtil.getEM("hibernateOracle");
		EntityTransaction transaction = em.getTransaction();
		
//		try {
//			transaction.begin();
//			em.persist(persona1);
//			em.persist(persona2);
//			transaction.commit();
//
//		} catch (Exception e) {
//			System.out.println("Error " + e);
//			e.printStackTrace();
//			transaction.rollback();
//		} finally {
//			
//		}

//		TypedQuery<Persona> query = em.createQuery("from Persona p where p.nombre=?1",Persona.class);
//		query.setParameter(1, "Alex");
//		
//		Persona persona = query.getSingleResult();
//		
//		System.out.println(persona.getNombre());
//		System.out.println(persona.getLibros().get(0).getTitulo());
//		System.out.println(persona.getLibros().get(1).getTitulo());
		
		
		Query queryLibros = em.createQuery("from Libro",Libro.class);
		queryLibros.getResultList().forEach(System.out::println);
		
		/*
		 * Eliminamos la persona1 (los dos primeros libros seran
		 * borrados en cascada)
		 */
//		transaction.begin();
//
//		em.remove(persona1);
//
//		transaction.commit();
		System.exit(0);
	}

}
