package es.curso.java.hibernate.relations.unounounidireccional;

import es.curso.java.hibernate.relations.unounounidireccional.entities.Direccion;
import es.curso.java.hibernate.relations.unounounidireccional.entities.Persona;
import es.curso.java.hibernate.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class UAUUNIANOTMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Persona persona1 = new Persona();
		persona1.setNombre("Persona que sera borrada");

		Persona persona2 = new Persona();
		persona2.setNombre("Persona que permanecera");

		Persona persona3 = new Persona(); 
	    persona3.setNombre("Persona sin direccion");
	    
		Direccion direccion1 = new Direccion();
		direccion1.setCalle("Calle 1");
		direccion1.setCodigoPostal("12345");

		Direccion direccion2 = new Direccion();
		direccion2.setCalle("Calle 2");
		direccion2.setCodigoPostal("54321");

		persona1.setDireccion(direccion1);
		persona2.setDireccion(direccion2);

		EntityManager em = JpaUtil.getEM("hibernateOracle");
		EntityTransaction transaction = em.getTransaction();

		/*
		 * Esta direccion se agrega para comprobar que las personas tomen el
		 * mismo identificador que las direcciones
		 */
		Direccion d = new Direccion();
		d.setCalle("Calle de Prueba de identificadores");
		d.setCodigoPostal("21345");

		/*
		 * En la primera transacción la base de datos almacenamos los dos objetos
		 * Persona los objetos Direccion se almacenaran en cascada
		 */
		transaction.begin();
		em.persist(persona1);
		em.persist(persona2);
		em.persist(persona3);
		transaction.commit();


		/*
		 * En la segunda sesion eliminamos el objeto persona1, la direccion1
		 * sera borrada en cascada
		 */
		transaction.begin();
		em.remove(persona1);
		transaction.commit();
		
		System.exit(0);
	}

}
