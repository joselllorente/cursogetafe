package es.curso.java.hibernate.advanced.compositekey;

import java.util.Date;
import org.hibernate.Session;

import es.curso.java.hibernate.basics.entities.Cliente;
import es.curso.java.hibernate.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;


public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Empleado emp = new Empleado();
		emp.setCiudad("Madrid");
		emp.setCodigoPostal("28015");
		emp.setDireccion("Direccion1");
		emp.setLocalidad("Madrid");
		emp.setPais("España");
		emp.setPuesto("Analista");
		
		
		EntityManager em = JpaUtil.getEM("hibernateOracle");
		EntityTransaction transaction = em.getTransaction();
//		transaction.begin();
//		em.persist(emp);
//		transaction.commit();
		
		transaction.begin();
	    DireccionPK dirpk = new DireccionPK("Direccion1","28015");
	    Empleado empleado1 =  em.find(Empleado.class, dirpk);
	    System.out.println(empleado1.toString());
	    empleado1.setFechaAlta(new Date());
	    em.persist(empleado1);
		transaction.commit();
//	    
//	    System.exit(0);
	}

}
