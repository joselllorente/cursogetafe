package es.curso.java.hibernate.ejercicios.ejercicio2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import es.curso.java.hibernate.basics.daos.AlumnoHibernateDAO;
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
		EntityManager em = JpaUtil.getEM("hibernateOracle");
		
		UserDao userDao = new UserDao(em);
		//Insertar los usuarios
		insertarUsuarios(userDao);
		//Consultar usuarios
		List<UserEntity> usuarios = consultaUsuarios(userDao);
		//Escribir en fichero
		escribirFichero("./hibernate_ejercicio2.txt",usuarios);
	}
	
	public void insertarUsuarios(UserDao userDao) {
		
		UserEntity user1 = new UserEntity("N1", "A1", "1A", new Date());
		UserEntity user2 = new UserEntity("N2", "A2", "2A", new Date());
		UserEntity user3 = new UserEntity("N3", "A3", "3A", new Date());
		
		userDao.insertarUsuarios(Arrays.asList(user1,user2,user3));
	}
	
	public List<UserEntity> consultaUsuarios(UserDao userDao) {
		
		return userDao.getUsers();
	}
	
	public void escribirFichero (String fichero, List<UserEntity> usuarios) {
		File archivo = new File(fichero);
		try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, false))) {

			//CABECERA
			buffer.append("ID;NOMBRE;APELLIDOS;DNI;FECHA");
			buffer.newLine();
			for (UserEntity userEntity : usuarios) {
				SimpleDateFormat formattedDate = new SimpleDateFormat("yyyyMMdd");
				String fecha = formattedDate.format(userEntity.getFechaAlta());
				
				buffer.append(userEntity.getId() + ";" +
						userEntity.getNombre() + ";" +
						userEntity.getApellidos() + ";" +
						userEntity.getDni() + ";" +
						userEntity.getNombre() + ";" +
						fecha
						);
				buffer.newLine();
			}

			System.out.println("El archivo se ha creado con éxito!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
