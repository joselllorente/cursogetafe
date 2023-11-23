package es.curso.java.ddbb.ejercicios.biblioteca.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import es.curso.java.ddbb.ejercicios.biblioteca.entities.Direccion;

public class DireccionDAO extends ConexionDAO {
	private static final Logger logger = LogManager.getLogger(DireccionDAO.class);
	
	public DireccionDAO() throws SQLException {
		super();
	}
	
	public int insertarDireccion(Direccion direccion) throws SQLException {
		logger.debug("Entrando insertarDireccion "+direccion);

		String query = "INSERT "
				+ "INTO TB_DIRECCION (TIPO_DIRECCION,DIRECCION,"
					+ "CIUDAD,PROVINCIA,COD_POSTAL) "
				+ "VALUES (?,?,?,?,?)";
		
		logger.debug(query);
		
		PreparedStatement ps = this.getConexion().prepareStatement(query);
		ps.setString(1, direccion.getTipo());
		ps.setString(2, direccion.getNombre());
		ps.setString(3, direccion.getCiudad());
		ps.setString(4, direccion.getProvincia());
		ps.setInt(5, direccion.getCodPostal());
		
		
		int insertados = ps.executeUpdate();
		
		return insertados;
	}
	
	public long getIdDireccion(Direccion direccion) throws SQLException{
		long idDireccion=0;
		logger.debug("" + direccion);
		String query = "SELECT ID "
				+ "FROM TB_DIRECCION "
				+ "WHERE direccion=? AND cod_postal=?";
		
		logger.debug(query);
		
		PreparedStatement ps = this.getConexion().prepareStatement(query);
		ps.setString(1, direccion.getNombre());
		ps.setInt(2, direccion.getCodPostal());
		
		ResultSet rs = ps.executeQuery();
		
		logger.debug(query);
		if (rs.next()) {
			logger.debug("Registro encontrado");
			idDireccion = rs.getLong("ID");
			logger.debug("id: " +idDireccion);
		}
		
		return idDireccion;
	}
	

}
