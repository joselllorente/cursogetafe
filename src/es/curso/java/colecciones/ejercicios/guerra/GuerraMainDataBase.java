package es.curso.java.colecciones.ejercicios.guerra;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import es.curso.java.colecciones.ejercicios.guerra.exceptions.LimiteValoresException;
import es.curso.java.ddbb.utils.UtilsDataBase;

public class GuerraMainDataBase {

	public static void main(String[] args) {
		GuerraMainDataBase gm = new GuerraMainDataBase();
		gm.empezarGuerra();

	}
	
	private void empezarGuerra() {
		getVehiculosGuerreros ();
		
		
		
	}
	
	
	private List<VehiculoGuerra> getVehiculosGuerreros (){
		
		try {
			List<VehiculoGuerra> vehiculos = getVehiculos ();
			for (VehiculoGuerra vehiculo : vehiculos) {
				System.out.println(vehiculo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (LimiteValoresException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
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
				
				if (tipo.equals("Nave")) {
					VehiculoGuerra nave = new Nave(nombre,ataque,defensa);
					vehiculos.add(nave);
				}else {
					VehiculoGuerra tanque = new Tanque(nombre,ataque,defensa);
					vehiculos.add(tanque);
				}
			} 
		}
		
		return vehiculos;
	}

}
