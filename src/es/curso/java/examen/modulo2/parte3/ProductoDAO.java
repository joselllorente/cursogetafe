package es.curso.java.examen.modulo2.parte3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import es.curso.java.ddbb.utils.UtilsDataBase;

public class ProductoDAO {

	private Connection conexion;

	public ProductoDAO() throws SQLException {
		this.conexion = UtilsDataBase.getInstance("jdbc:oracle:thin:@localhost:1521:XE", "curso", "password");
	}

	public void insertarProducto(Producto producto) throws SQLException {

		PreparedStatement ps = conexion.prepareStatement("INSERT INTO TB_PRODUCTOS_EXAMEN " + " VALUES (?,?,?,?,?)");

		ps.setInt(1, producto.getId());
		ps.setString(2, producto.getNombre());
		ps.setString(3, producto.getTipo());
		ps.setDouble(4, producto.getPrecio());
		ps.setInt(5, producto.getStock());

		ps.execute();
	}

	public List<Producto> getProductos() throws SQLException {
		// SELECT ID, NOMBRE, TIPO, PRECIO, STOCK FROM TB_PRODUCTOS_EXAMEN;
		Statement st = conexion.createStatement();
		ResultSet rs = st.executeQuery("SELECT ID, NOMBRE, TIPO, PRECIO, STOCK " + "FROM TB_PRODUCTOS_EXAMEN");
		List<Producto> productos = new ArrayList<Producto>();

		while (rs.next()) {
			int id = rs.getInt("ID");
			String nombre = rs.getString("NOMBRE");
			String tipo = rs.getString("TIPO");
			int stock = rs.getInt("STOCK");
			double precio = rs.getDouble("PRECIO");

			Producto p = new Producto(id, nombre, tipo, precio, stock);
			productos.add(p);
		}

		return productos;
	}

	public List<ProductoInfo> getInfoProductos() throws SQLException {
		// SELECT TIPO, ROUND(AVG(PRECIO),2) as PRECIO_MEDIO, COUNT(ID) AS TOTAL 
		//FROM TB_PRODUCTOS_EXAMEN GROUP BY TIPO;
		Statement st = conexion.createStatement();
		ResultSet rs = st.executeQuery(
				"SELECT "
					+ "TIPO, "
					+ "ROUND(AVG(PRECIO),2) as PRECIO_MEDIO, "
					+ "COUNT(ID) AS TOTAL "
				+ "FROM TB_PRODUCTOS_EXAMEN "
				+ "GROUP BY TIPO");
		
		List<ProductoInfo> productosInfo = new ArrayList<ProductoInfo>();

		while (rs.next()) {
			String tipo = rs.getString("TIPO");
			double precioMedio = rs.getDouble("PRECIO_MEDIO");
			int total = rs.getInt("TOTAL");

			ProductoInfo pi = new ProductoInfo(tipo,precioMedio, total);
			productosInfo.add(pi);
		}

		return productosInfo;
	}

}
