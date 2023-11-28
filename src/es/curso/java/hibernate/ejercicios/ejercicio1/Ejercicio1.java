package es.curso.java.hibernate.ejercicios.ejercicio1;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import es.curso.java.hibernate.basics.HibernateListar;
import es.curso.java.hibernate.ejercicios.ejercicio1.dao.UserDao;
import es.curso.java.hibernate.ejercicios.ejercicio1.entity.UserEntity;
import es.curso.java.hibernate.ejercicios.ejercicio1.utils.UtilsFecha;
import es.curso.java.utils.Utilidades;

public class Ejercicio1 {
	private static final Logger logger = LogManager.getLogger(Ejercicio1.class);
	
	public static void main(String[] args) {
		Ejercicio1 ejer1 = new Ejercicio1();
		UserDao userDao = new UserDao();
		
		//Insertar usuario
//		userDao.insertarUsuario(
//				new UserEntity(4, "N", "A", "1A", new Date())
//		);
		
		ejer1.parte1(userDao);
//		ejer1.parte2(userDao);
//		ejer1.parte3(userDao);
//		ejer1.parte4(userDao);
//		ejer1.parte5(userDao);
		
	}

	public void parte1 (UserDao userDao) {
		List<UserEntity> usuarios = userDao.getUsers();
		logger.info("Empieza");
		for (UserEntity userEntity : usuarios) {
			logger.info(userEntity);
		}
		logger.info("Termina");
	}

	public void parte2 (UserDao userDao) {
		List<UserEntity> usuariosName= userDao.getUsersByName("NOMBRE");
		logger.info("Empieza");
		for (UserEntity userEntity : usuariosName) {
			logger.info(userEntity);
		}
		logger.info("Termina");
	}
	
	public void parte3 (UserDao userDao) {
		Date fecha = UtilsFecha.generaFechaMenosDias(10);
		
		List<UserEntity> usuariosDate= userDao.getUsersByDate(fecha);
		logger.info("Empieza date");
		for (UserEntity userEntity : usuariosDate) {
			logger.info(userEntity);
		}
		logger.info("Termina");
	}
	
	
	public void parte4 (UserDao userDao) {
		String nombre = Utilidades.pideDatoTexto("Escribe nombre: ");
		userDao.borrarUsuarioPorNombre(nombre);
		logger.info("Termina borrar usuarios");
	}

	public void parte5 (UserDao userDao) {
		String dni = Utilidades.pideDatoTexto("Escribe dni: ");

		userDao.modificarUsuarioPorDni(dni, 
				new UserEntity(5, "N", "A", "1A", new Date()));
		logger.info("Termina modificar usuario");
	}
	
	
	
	
}
