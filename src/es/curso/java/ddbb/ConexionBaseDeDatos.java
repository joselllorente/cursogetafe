package es.curso.java.ddbb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedHashSet;
import java.util.Set;

import es.curso.java.ddbb.ejercicios.Facility;

public class ConexionBaseDeDatos {

	public static void main(String[] args) {
		ConexionBaseDeDatos conexion = new ConexionBaseDeDatos();
		conexion.conectaTryWithResources();

	}
	
	private void conectaTryWithResources() {
		String url = "jdbc:mysql://localhost:3306/curso?serverTimezone=Europe/Madrid";
		String username = "root";
		String password = "password";
		
		//Connection connection = null;//Conexion con la base de datos
		//Statement stmt = null;//Lanzar consulta
		//ResultSet rs = null;//Recoger datos de la consulta
		
		try (
				Connection connection = DriverManager.getConnection(url, username, password);
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM TB_FACILITIES");
			) {

			Set<Facility> facilities = new LinkedHashSet<Facility>();
			while (rs.next()) {
				long id = rs.getInt("id");
				
				Facility facility = new Facility(id,rs.getInt("guid"),rs.getString("name"),
						rs.getString("description"),rs.getString("category"),rs.getString("address"),
						rs.getDouble("heigth"));
			
				facilities.add(facility);
				
			}
			System.out.println(facilities.size());

		} catch (SQLException e) {
			System.err.println("Ha habido un error " + e.getMessage());
//			e.printStackTrace();
		} 

	}
	

	private void conecta() {
		String url = "jdbc:mysql://localhost:3306/curso?serverTimezone=Europe/Madrid";
		String username = "root";
		String password = "password";

		Connection connection = null;//Conexion con la base de datos
		Statement stmt = null;//Lanzar consulta
		ResultSet rs = null;//Recoger datos de la consulta
		try {

			System.out.println("Estableciendo conexión");
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Conexión establecida");
			stmt = connection.createStatement();

			rs = stmt.executeQuery("SELECT * FROM TB_FACILITIES");
			while (rs.next()) {
				System.out.println(rs.getLong("id"));
				System.out.println(rs.getInt("guid"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("description"));
				System.out.println(rs.getString("category"));
				System.out.println("===============================");
			}

		} catch (SQLException e) {
			System.err.println("Ha habido un error " + e.getMessage());
//			e.printStackTrace();
		} finally {
			
			try {
				if (connection!=null) {
					connection.close();
				}
				if (stmt!=null)
					stmt.close();
				if (rs!=null)
					rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
