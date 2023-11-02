package es.curso.java.ddbb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedHashSet;
import java.util.Set;

import es.curso.java.ddbb.ejercicios.Facility;

public class ConexionBaseDeDatos {

	public static void main(String[] args) {
		ConexionBaseDeDatos conexion = new ConexionBaseDeDatos();
		conexion.insertPrepareStatement();

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
	
	
	private void conectaPrepareStatement() {
		String url = "jdbc:mysql://localhost:3306/curso?serverTimezone=Europe/Madrid";
		String username = "root";
		String password = "password";

		Connection connection = null;//Conexion con la base de datos
		//Statement stmt = null;//Lanzar consulta
		PreparedStatement prepareStament=null;
		ResultSet rs = null;//Recoger datos de la consulta
		try {

			System.out.println("Estableciendo conexión");
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Conexión establecida");
			
			String address = "DIR2";
			prepareStament = connection.prepareStatement(
					"SELECT * FROM TB_FACILITIES WHERE ADDRESS=? AND ID=?");
			prepareStament.setString(1, address);
			prepareStament.setInt(2, 100);
			
			
			rs = prepareStament.executeQuery();
			
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
				if (prepareStament!=null)
					prepareStament.close();
				if (rs!=null)
					rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	private void insertPrepareStatement() {
		String url = "jdbc:mysql://localhost:3306/curso?serverTimezone=Europe/Madrid";
		String username = "root";
		String password = "password";

		Connection connection = null;//Conexion con la base de datos
		//Statement stmt = null;//Lanzar consulta
		PreparedStatement prepareStament=null;
		ResultSet rs = null;//Recoger datos de la consulta
		try {

			System.out.println("Estableciendo conexión");
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Conexión establecida");
			
			String insert = "INSERT INTO TB_FACILITIES "
					+ "(guid,name,description,category,address,heigth)\r\n"
					+ "VALUES (?,?,?,?,?,?)";
			
			prepareStament = connection.prepareStatement(insert);
			prepareStament.setInt(1, 2314);
			prepareStament.setString(2, "EDIFICIO3");
			prepareStament.setString(3, "DESC EDIFICIO3");
			prepareStament.setString(4, "CATEGORIA");
			prepareStament.setString(5, "ADDRESS");
			prepareStament.setInt(6, 90);
			
			
			boolean insertado = prepareStament.execute();
			System.out.println("Insertado: "+insertado);
			

		} catch (SQLException e) {
			System.err.println("Ha habido un error " + e.getMessage());
//			e.printStackTrace();
		} finally {
			
			try {
				if (connection!=null) {
					connection.close();
				}
				if (prepareStament!=null)
					prepareStament.close();
				if (rs!=null)
					rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	
}
