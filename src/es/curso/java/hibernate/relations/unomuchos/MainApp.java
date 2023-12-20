package es.curso.java.hibernate.relations.unomuchos;

import es.curso.java.hibernate.relations.unomuchos.entities.Libro;
import es.curso.java.hibernate.relations.unomuchos.entities.Persona;
import es.curso.java.hibernate.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

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

		/*
		 * En la primer sesion guardamos las dos personas (los libros correspondientes
		 * seran guardados en cascada
		 */
		EntityManager em = JpaUtil.getEM("hibernateOracle");
		EntityTransaction transaction = em.getTransaction();
		
		try {
			transaction.begin();
			em.persist(persona1);
			em.persist(persona2);
			transaction.commit();

		} catch (Exception e) {
			System.out.println("Error " + e);
			e.printStackTrace();
			transaction.rollback();
		} finally {
			
		}

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
