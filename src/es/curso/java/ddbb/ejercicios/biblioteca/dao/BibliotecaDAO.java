package es.curso.java.ddbb.ejercicios.biblioteca.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import es.curso.java.ddbb.ejercicios.biblioteca.entities.Biblioteca;
import es.curso.java.ddbb.ejercicios.biblioteca.entities.Direccion;

public class BibliotecaDAO extends ConexionDAO {


	public BibliotecaDAO() throws SQLException {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Biblioteca> getBibliotecas () throws SQLException {
		
		List<Biblioteca> bibliotecas = new ArrayList<Biblioteca>();

		Statement stmt = this.getConexion().createStatement();
		String query = "SELECT biblio.id, biblio.nombre, \r\n"
				+ "dir.tipo_direccion, dir.direccion, dir.ciudad, dir.provincia, dir.cod_postal\r\n"
				+ "FROM TB_BIBLIOTECA as biblio JOIN TB_DIRECCION as dir \r\n"
				+ "ON biblio.fk_direccion = dir.id";
		
		ResultSet rs = stmt.executeQuery(query);
		
		while (rs.next()) {
			long idBiblioteca = rs.getLong("biblio.id");
			String nombreBiblioteca = rs.getString("biblio.nombre");
			String tipoDireccion = rs.getString("dir.tipo_direccion");
			String direccion = rs.getString("dir.direccion");
			String ciudad = rs.getString("dir.ciudad");
			String provincia = rs.getString("dir.provincia");
			int codPostal = rs.getInt("dir.cod_postal");

			Direccion dire = new Direccion(tipoDireccion,direccion,ciudad,provincia,codPostal);
			Biblioteca biblio = new Biblioteca(idBiblioteca, nombreBiblioteca, dire);
			
			bibliotecas.add(biblio);
		}
		
		return bibliotecas;
	}
	
	public List<Biblioteca> getBibliotecas (String ciudad) {
		
		List<Biblioteca> bibliotecas = new ArrayList<Biblioteca>();
		
		return bibliotecas;
	}
	
	
	public Biblioteca getBiblioteca (long id) {
		
		
		return null;
	}
	
	
}
