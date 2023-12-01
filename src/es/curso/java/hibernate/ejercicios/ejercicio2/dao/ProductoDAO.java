package es.curso.java.hibernate.ejercicios.ejercicio2.dao;

import java.util.List;

import es.curso.java.hibernate.ejercicios.ejercicio2.entities.Producto;
import jakarta.persistence.EntityManager;

public class ProductoDAO {
	private EntityManager em;

	public ProductoDAO(EntityManager em) {
		this.em = em;
	}
	
	public List<Producto> getProductos (){
		return em.createQuery("from Producto", Producto.class).getResultList();
	}
	
	public List<Producto> getProductosByDate (){
		return em.createQuery("from Producto", Producto.class).getResultList();
	}
	
	
//	public List<Producto> getInfoTiposProductos (){
//		return em.createQuery("from Producto", Producto.class).getResultList();
//	}
	
	
	public void insertarProductos (List<Producto> productos) {
		 em.getTransaction().begin();
		 try {
			 
			for (Producto producto : productos) {
				 em.persist(producto);
			}
			 
			em.getTransaction().commit();
		 }catch(Exception e) {
			 em.getTransaction().rollback();
		 }
	     
	}
}
