package es.curso.java.ddbb.ejercicios.biblioteca.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import es.curso.java.ddbb.ejercicios.biblioteca.entities.Biblioteca;
import es.curso.java.ddbb.utils.UtilsDataBase;

public class BibliotecaDAO {

	private Connection conexion;
	
	public BibliotecaDAO() throws SQLException {
		super();
		this.conexion = UtilsDataBase.getInstance();
	}

	public List<Biblioteca> getBibliotecas () throws SQLException {
		
		List<Biblioteca> bibliotecas = new ArrayList<Biblioteca>();

		
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
