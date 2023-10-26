package es.curso.java.ddbb.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UtilsDataBase {

	private static Connection connection;
	
	/**
	 * Conexion por defecto a la base de datos curso de la maquina local
	 * @return
	 * @throws SQLException 
	 */
	public static Connection getInstance () throws SQLException {
		String url = "jdbc:mysql://localhost:3306/curso?serverTimezone=Europe/Madrid";
		String userName = "root";
		String password = "password";
		
		connection = getInstance(url, userName, password);
		
		return connection;
	}
	
	public static Connection getInstance (String url, String userName, String password) throws SQLException{

		if (connection==null) {
			connection = DriverManager.getConnection(url, userName, password);
		}
		return connection;
	}
	
	public static void cerrarConexion() throws SQLException {
		if (connection!=null) {
			connection.close();
			connection=null;
		}
	}
	
	
	
}
