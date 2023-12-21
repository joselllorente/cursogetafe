package es.curso.java.hibernate.relations.unounobidireccional;

import org.hibernate.Session;

import es.curso.java.hibernate.relations.unounobidireccional.entities.Pais;
import es.curso.java.hibernate.relations.unounobidireccional.entities.Presidente;
import es.curso.java.hibernate.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pais pais1 = new Pais();
		pais1.setNombre("China");

		Pais pais2 = new Pais();
		pais2.setNombre("Corea");

		Presidente presidente1 = new Presidente();
		presidente1.setNombre("Jiang Zemin");

		Presidente presidente2 = new Presidente();
		presidente2.setNombre("Kim Dae-Jung");

		pais1.setPresidente(presidente1);
		pais2.setPresidente(presidente2);

		presidente1.setPais(pais2);
		presidente2.setPais(pais1);

		EntityManager em = JpaUtil.getEM("hibernateOracle");
		EntityTransaction transaction = em.getTransaction();

		// Podemos crear un pais sin presidente
		Pais p = new Pais();
		p.setNombre("Chipre");

		/*
		 * En la primer sesion a la base de datos almacenamos los dos objetos Pais los
		 * objetos Presidente se almacenaran en cascada
		 */
		transaction.begin();

		em.persist(p);
		em.persist(pais1);
		em.persist(pais2);

		transaction.commit();

		/*
		 * En la segunda sesion eliminamos el objeto pais1, el presidente1 sera borrado
		 * en cascada
		 */

//		transaction.begin();
//		em.remove(pais1);
//
//		transaction.commit();
//		System.exit(0);
	}

}
