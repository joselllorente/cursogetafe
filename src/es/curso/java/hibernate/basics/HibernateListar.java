package es.curso.java.hibernate.basics;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import es.curso.java.hibernate.basics.entities.Cliente;
import es.curso.java.hibernate.util.JpaUtil;
import jakarta.persistence.EntityManager;

public class HibernateListar {
	
	private static final Logger logger = LogManager.getLogger(HibernateListar.class);
    public static void main(String[] args) {
    	logger.debug("Empezando");
        EntityManager em = JpaUtil.getEntityManager();
        Cliente cliente1 = new Cliente("Nombre1","Apellido","Efectivo");
        Cliente cliente2 = new Cliente("Nombre2","Apellido2","Tarjeta");
        em.getTransaction().begin();
        em.persist(cliente1);
        em.persist(cliente2);
        em.getTransaction().commit();
        
        List<Cliente> clientes = em.createQuery("from Cliente", Cliente.class).getResultList();
        clientes.forEach(System.out::println);//Método Referencia
        //clientes.forEach(cliente->System.out.println(cliente));
        em.close();
        logger.debug("Final");
    }
}
