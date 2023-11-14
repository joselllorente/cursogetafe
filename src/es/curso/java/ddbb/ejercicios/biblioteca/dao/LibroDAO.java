package es.curso.java.ddbb.ejercicios.biblioteca.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import es.curso.java.ddbb.ejercicios.biblioteca.entities.Libro;

public class LibroDAO extends ConexionDAO implements ILibro{

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
	
	
	//ISBN, 123123123
	//Autor, "Autor1"
	public List<Libro> buscarLibro (long idBiblioteca, Map<String, String> campoDatoABuscar) throws SQLException {
		
		List<Libro> libros = new ArrayList<Libro>();
		
		String query = "SELECT ID, TITULO, AUTOR, ISBN "
				+ "FROM TB_LIBROS "
				+ "WHERE FK_BIBLIOTECA=?";
		
		StringBuilder sb = new StringBuilder(query);
		
		String valor = "";
		if(campoDatoABuscar.containsKey(ISBN)){
//			query += " AND ISBN = ?";
			sb.append(" AND ISBN = ?");
			valor = campoDatoABuscar.get(ISBN);
		}else if(campoDatoABuscar.containsKey(AUTOR)){
//			query += " AND AUTOR = ?";
			sb.append(" AND AUTOR = ?");
			valor = campoDatoABuscar.get(AUTOR);
		}else if(campoDatoABuscar.containsKey(TITULO)){
//			query += " AND TITULO = ?";
			sb.append(" AND TITULO = ?");
			valor = campoDatoABuscar.get(TITULO);
		}
		
		System.out.println("Consulta creada" + sb.toString());
		System.out.println(idBiblioteca);
		
		PreparedStatement stmt = this.getConexion().prepareStatement(sb.toString());
		stmt.setLong(1, idBiblioteca);
		stmt.setString(2, valor);

		
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
