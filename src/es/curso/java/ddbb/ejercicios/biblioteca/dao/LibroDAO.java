package es.curso.java.ddbb.ejercicios.biblioteca.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import es.curso.java.ddbb.ejercicios.biblioteca.entities.Libro;

public class LibroDAO extends ConexionDAO {

	public LibroDAO() throws SQLException {
		
	}

	public List<Libro> getLibros (long id) throws SQLException {
		
		List<Libro> libros = new ArrayList<Libro>();

		String query = "SELECT ID, TITULO, AUTOR, ISBN "
				+ "FROM TB_LIBROS "
				+ "WHERE FK_BIBLIOTECA=?";
		
		System.out.println("Consulta creada" + query);
		System.out.println("Parametro FK_BIBLIOTECA:"+id);
		
		PreparedStatement stmt = this.getConexion().prepareStatement(query);
		stmt.setLong(1, id);
		
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			long idLibro = rs.getLong("ID");
			String titulo = rs.getString("TITULO");
			String autor = rs.getString("AUTOR");
			String isbn = rs.getString("ISBN");
			
		
			libros.add(new Libro(idLibro,titulo,autor,isbn));
		}
		
		return libros;
	}
	
	
}
