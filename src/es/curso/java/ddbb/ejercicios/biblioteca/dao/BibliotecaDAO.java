package es.curso.java.ddbb.ejercicios.biblioteca.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import es.curso.java.ddbb.ejercicios.biblioteca.entities.Biblioteca;

public class BibliotecaDAO extends ConexionDAO {


	public BibliotecaDAO() throws SQLException {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Biblioteca> getBibliotecas () throws SQLException {
		
		List<Biblioteca> bibliotecas = new ArrayList<Biblioteca>();

		this.getConexion();
		
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
