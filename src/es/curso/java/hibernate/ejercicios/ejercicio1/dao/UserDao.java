package es.curso.java.hibernate.ejercicios.ejercicio1.dao;

import java.util.Date;
import java.util.List;

import es.curso.java.hibernate.ejercicios.ejercicio1.entity.UserEntity;
import es.curso.java.hibernate.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

public class UserDao {
	
	private EntityManager em;

	public UserDao() {
		em = JpaUtil.getEM("hibernateMySQL");
	}
	
	public UserDao(String persitenceUnitName) {
		em = JpaUtil.getEM(persitenceUnitName);
	}
	
	public UserDao(EntityManager em) {
		this.em = em;
	}
	
	public List<UserEntity> getUsers (){
		List<UserEntity> usuarios;
		
		usuarios = em.createQuery("from UserEntity", UserEntity.class)
			.getResultList();
		
		return usuarios;
	}
	
	public List<UserEntity> getUsersByName (String name){
		List<UserEntity> usuarios;
		
		Query query = em.createQuery(
				"from UserEntity ue where ue.nombre=?1", 
				UserEntity.class);
		
		
//		Query query2 = em.createQuery(
//				"select new UserVip(ue.id) from UserEntity ue where ue.vip=?1", 
//				UserVip.class);
		
		query.setParameter(1, name);
		usuarios = query.getResultList();
		
		return usuarios;
	}
	
	public List<UserEntity> getUsersByDate (Date fechaConsulta){
		List<UserEntity> usuarios;
		
		Query query = em.createQuery(
				"from UserEntity ue where ue.fechaAlta>=?1", 
				UserEntity.class);
		
		query.setParameter(1, fechaConsulta);
		usuarios = query.getResultList();
		
		return usuarios;
	}
	
	public void insertarUsuario (UserEntity user) {
		 em.getTransaction().begin();
		 try {
			 em.persist(user);
			 
			 em.getTransaction().commit();
		 }catch(Exception e) {
			 em.getTransaction().rollback();
		 }
	     
	}
	
	public void insertarUsuarios (List<UserEntity> users) {
		 em.getTransaction().begin();
		 try {
			 
			for (UserEntity user : users) {
				 em.persist(user);
			}
			 
			em.getTransaction().commit();
		 }catch(Exception e) {
			 em.getTransaction().rollback();
		 }
	     
	}
	
	
	public void borrarUsuarioPorNombre (String nombre) {
		 em.getTransaction().begin();
		 try {
			List<UserEntity> usuarios = getUsersByName(nombre);
            
            for (UserEntity userEntity : usuarios) {
            	em.remove(userEntity);
			}
            
            em.getTransaction().commit();
		 }catch(Exception e) {
			 em.getTransaction().rollback();
		 }
	     
	}
	
	public void modificarUsuarioPorDni (String dni, UserEntity userModified) {
		
		TypedQuery<UserEntity> query = em.createQuery(
				"from UserEntity where dni=?1",
				UserEntity.class);
		query.setParameter(1, dni);
		
		try {
			UserEntity user = query.getSingleResult();
			em.getTransaction().begin();
			//user.setId(userModified.getId());
			user.setNombre(userModified.getNombre());
			user.setApellidos(userModified.getApellidos());
			user.setFechaAlta(userModified.getFechaAlta());

			em.merge(user);
			
			em.getTransaction().commit();
		}catch (NoResultException nre) {
			System.out.println("Dni "+dni+ " no encontrado");
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		
	}
	
}
