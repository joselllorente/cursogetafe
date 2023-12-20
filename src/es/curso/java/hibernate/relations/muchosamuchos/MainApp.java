package es.curso.java.hibernate.relations.muchosamuchos;

import es.curso.java.hibernate.relations.muchosamuchos.entities.Estudiante;
import es.curso.java.hibernate.relations.muchosamuchos.entities.Materia;
import es.curso.java.hibernate.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    Estudiante estudiante1 = new Estudiante();
	    estudiante1.setNombre("estudiante1");

	    Materia materia1 = new Materia();
	    materia1.setNombre("materia1");
	    Materia materia2 = new Materia();
	    materia2.setNombre("materia2");
	    Materia materia3 = new Materia();
	    materia3.setNombre("materia3");

	    estudiante1.addMateria(materia1);
	    estudiante1.addMateria(materia2);
	    estudiante1.addMateria(materia3);


	    Estudiante estudiante2 = new Estudiante();
	    estudiante2.setNombre("estudiante2");

	    Materia materia4 = new Materia();
	    materia4.setNombre("materia4");
	    Materia materia5 = new Materia();
	    materia5.setNombre("materia5");
	    Materia materia6 = new Materia();
	    materia6.setNombre("materia6");

	    estudiante2.addMateria(materia4);
	    estudiante2.addMateria(materia3);
	    estudiante2.addMateria(materia6);

	    EntityManager em = JpaUtil.getEM("hibernateOracle");
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
	    
	    em.persist(estudiante1);
	    em.persist(estudiante2);
	    transaction.commit();

//	    sesion = HibernateUtils.getSessionFactory().openSession();
//	    sesion.beginTransaction();
//	    sesion.delete(estudiante1);
//	    sesion.getTransaction().commit();
//	    sesion.close();
	    
	    System.exit(0);
	}

}
