package es.curso.java.lambdas.advanced;

import java.util.Arrays;

import es.curso.java.hibernate.basics.entities.Cliente;
import es.curso.java.hibernate.ejercicios.ejercicio2.dao.ProductoDAO;
import es.curso.java.hibernate.ejercicios.ejercicio2.entities.Producto;

public class Test {

	public static void main(String[] args) {
		EjemploConsumer ec = new EjemploConsumer();
		ec.getProductos( () -> {
        	ProductoDAO pDAO = new ProductoDAO(null);
        	return pDAO.getProductos();
        } );
		
		ec.getProductos(() -> Arrays.asList(new Producto()) );
		
		
		ec.generaNombre("Jose");
		

	}
	
	public static void pintaNombreCliente(Cliente cliente) {
		System.out.println(cliente.getNombre());
	}

}
