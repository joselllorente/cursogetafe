package es.curso.java.examen.modulo2.parte3;

import java.sql.SQLException;
import java.util.List;

public class PrincipalParte3 {
	private ProductoDAO pdao;
	
	public PrincipalParte3() throws SQLException {
		super();
		this.pdao = new ProductoDAO();
	}

	public static void main(String[] args) {
		PrincipalParte3 principal;
		try {
			principal = new PrincipalParte3();
			//principal.insertar();
			//principal.consultarProductos();
			principal.getInfoProducto();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	private void insertar () throws SQLException {
		Producto producto = new Producto(3,"PROD 3","ROPA",40,13);
		pdao.insertarProducto(producto);
	}
	
	private void consultarProductos() throws SQLException {
		List<Producto> productos = pdao.getProductos();
		for (Producto producto : productos) {
			System.out.println(producto);
		}
	}
		
	private void getInfoProducto() throws SQLException{
		List<ProductoInfo> productosInfo = pdao.getInfoProductos();
		
		for (ProductoInfo producto : productosInfo) {
			System.out.println(producto);
		}
	}
}










