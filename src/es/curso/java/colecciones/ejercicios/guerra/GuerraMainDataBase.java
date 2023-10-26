package es.curso.java.colecciones.ejercicios.guerra;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import es.curso.java.colecciones.ejercicios.guerra.exceptions.LimiteValoresException;
import es.curso.java.colecciones.ejercicios.guerra.exceptions.UnidadesPermitadasException;
import es.curso.java.ddbb.utils.UtilsDataBase;

public class GuerraMainDataBase {

	public static void main(String[] args) {
		GuerraMainDataBase gm = new GuerraMainDataBase();
		gm.empezarGuerra();

	}
	
	private void empezarGuerra() {
		GuerraMain guerra = new GuerraMain();
		guerra.batalla(getVehiculosGuerreros());
		
	}
	
	
	private List<VehiculoGuerra> getVehiculosGuerreros (){
		List<VehiculoGuerra> vehiculos = null;
		try {
			vehiculos = getVehiculos ();
			reclutamiento ( vehiculos );
			
//			for (VehiculoGuerra vehiculo : vehiculos) {
//				System.out.println(vehiculo);
//			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (LimiteValoresException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnidadesPermitadasException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				UtilsDataBase.cerrarConexion();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return vehiculos;
	}
	
	private List<VehiculoGuerra> getVehiculos () throws SQLException, LimiteValoresException{
		List<VehiculoGuerra> vehiculos = null;
		Connection connection = UtilsDataBase.getInstance();
		
		try(
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM TB_VEHICULOS_GUERRA"); 
		){
			vehiculos = new ArrayList<VehiculoGuerra>();

			while(rs.next()) {
				String tipo = rs.getString("tipo");
				String nombre = rs.getString("nombre");
				int ataque = rs.getInt("ataque");
				int defensa = rs.getInt("defensa");
				long id = rs.getLong("id");
				
				if (tipo.equals("Nave")) {
					VehiculoGuerra nave = new Nave(nombre,ataque,defensa);
					nave.setId(id);
					vehiculos.add(nave);
				}else {
					VehiculoGuerra tanque = new Tanque(nombre,ataque,defensa);
					tanque.setId(id);
					vehiculos.add(tanque);
				}
			} 
		}
		
		return vehiculos;
	}
	
	
	private void reclutamiento (List<VehiculoGuerra> vehiculos) 
			throws SQLException, LimiteValoresException, UnidadesPermitadasException{
		Connection connection = UtilsDataBase.getInstance();
		
		try(
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM TB_GUERRERO"); 
		){
			
			while(rs.next()) {
				String nombre = rs.getString("nombre");
				int fuerza = rs.getInt("fuerza");
				int resistencia = rs.getInt("resistencia");
				int vehiculoId = rs.getInt("fk_vehiculo_guerra"); 
				
				Guerrero guerrero = new Guerrero(nombre, "", fuerza, resistencia);
				
				for (VehiculoGuerra vehiculoGuerra : vehiculos) {
					if (vehiculoGuerra.getId() == vehiculoId) {
						vehiculoGuerra.embarcarGuerro(guerrero);
						break;
					}
				}
			} 
		}
		
		
		
		//return vehiculos;
	}

}
