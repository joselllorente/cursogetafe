package es.curso.java.hibernate.ejercicios.ejercicio.biblioteca;

import java.util.List;
import java.util.stream.Stream;

import es.curso.java.hibernate.ejercicios.ejercicio.biblioteca.entities.Biblioteca;
import es.curso.java.hibernate.relations.unounounidireccional.entities.Direccion;
import es.curso.java.hibernate.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;

public class MainHibernateBiblioteca {

	public static void main(String[] args) {
		EntityManager em = JpaUtil.getEM("hibernateOracle");
		EntityTransaction transaction = em.getTransaction();
		
		Direccion direccion1 = new Direccion();
		direccion1.setCalle("Calle 1");
		direccion1.setCodigoPostal("12345");
		
		Direccion direccion2 = new Direccion();
		direccion2.setCalle("Calle 2");
		direccion2.setCodigoPostal("12345");
		
		Biblioteca biblioteca1 = new Biblioteca();
		biblioteca1.setNombre("Biblioteca1");
		biblioteca1.setDireccion(direccion1);
		
		Biblioteca biblioteca2 = new Biblioteca();
		biblioteca2.setNombre("Biblioteca2");
		biblioteca2.setDireccion(direccion2);
		
		transaction.begin();
		em.persist(biblioteca1);
		em.persist(biblioteca2);
		transaction.commit();
		
		TypedQuery<Biblioteca> query = em.createQuery("select b from Biblioteca b",Biblioteca.class);
		List<Biblioteca> bibliotecas = query.getResultList();
//		
		for (Biblioteca biblioteca : bibliotecas) {
			System.out.println(biblioteca.getNombre());
			System.out.println(biblioteca.getDireccion().getCalle());
		}
		
		//bibliotecas.forEach( biblioteca -> System.out.println(biblioteca)  );
		//bibliotecas.forEach(System.out::println);
		
		//Stream<Biblioteca> bibliotecaStream = query.getResultStream();
		
		
		
		

	}

}
