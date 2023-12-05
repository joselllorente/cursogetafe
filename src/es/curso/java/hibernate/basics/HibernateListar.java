package es.curso.java.hibernate.basics;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import es.curso.java.hibernate.basics.entities.Cliente;
import es.curso.java.hibernate.util.JpaUtil;
import es.curso.java.lambdas.advanced.Test;
import jakarta.persistence.EntityManager;

public class HibernateListar {
	
	private static final Logger logger = LogManager.getLogger(HibernateListar.class);
    public static void main(String[] args) {
    	logger.debug("Empezando");
        EntityManager em = JpaUtil.getEM("hibernateOracle");
        Cliente cliente1 = new Cliente("Nombre1","Apellido","Efectivo");
        Cliente cliente2 = new Cliente("Nombre2","Apellido2","Tarjeta");
        
        em.getTransaction().begin();
        em.persist(cliente1);
        em.persist(cliente2);
        em.getTransaction().commit();
        logger.debug("============================================");
        List<Cliente> clientes = em.createQuery("FROM Cliente", Cliente.class).getResultList();
        clientes.forEach(Test::pintaNombreCliente);//Método Referencia
        clientes.forEach(System.out::println);
        clientes.forEach(cliente -> Test.pintaNombreCliente(cliente));
        //clientes.forEach(x -> System.out.println(x));
        clientes.stream().
        	filter( cliente -> cliente.getNombre().equals("Juan")).
        	map( cliente -> { cliente.setFormaPago("as"); return cliente; } ).
        	forEach(cliente -> System.out.println(cliente));
        
        for (Cliente x : clientes) {
			
		}
        
        em.close();
        logger.debug("Final");
    }
}







