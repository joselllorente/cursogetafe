package es.curso.java.hibernate.ejercicios.ejercicio2;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import es.curso.java.hibernate.ejercicios.ejercicio1.dao.UserDao;
import es.curso.java.hibernate.ejercicios.ejercicio1.entity.UserEntity;
import es.curso.java.hibernate.util.JpaUtil;
import jakarta.persistence.EntityManager;

public class Ejercicio2_1 {

	public static void main(String[] args) {
		Ejercicio2_1 ejer2 = new Ejercicio2_1();
		ejer2.iniciar();
	}
	
	public void iniciar() {
		UserDao userDao = new UserDao();
		insertarUsuarios(userDao);
		List<UserEntity> usuarios = consultaUsuarios(userDao);
		escribirFichero("./hibernate_ejercicio2.txt",usuarios);
	}
	
	public void insertarUsuarios(UserDao userDao) {
		EntityManager em = JpaUtil.getEM("hibernateOracle");
		
		UserEntity user1 = new UserEntity("N1", "A1", "1A", new Date());
		UserEntity user2 = new UserEntity("N2", "A2", "2A", new Date());
		UserEntity user3 = new UserEntity("N3", "A3", "3A", new Date());
		
		userDao.insertarUsuarios(Arrays.asList(user1,user2,user3));
	}
	
	public List<UserEntity> consultaUsuarios(UserDao userDao) {
		EntityManager em = JpaUtil.getEM("hibernateOracle");
		
		return userDao.getUsers();
	}
	
	public void escribirFichero (String fichero, List<UserEntity> usuarios) {
		
	}
}
