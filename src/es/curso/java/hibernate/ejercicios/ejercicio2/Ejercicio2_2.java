package es.curso.java.hibernate.ejercicios.ejercicio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import es.curso.java.hibernate.ejercicios.ejercicio2.dao.ProductoDAO;
import es.curso.java.hibernate.ejercicios.ejercicio2.entities.Producto;
import es.curso.java.hibernate.ejercicios.ejercicio2.pojos.ProductosInfo;
import es.curso.java.hibernate.util.JpaUtil;
import jakarta.persistence.EntityManager;

public class Ejercicio2_2 {

	private final String FICHERO = "./enunciados/hibernate/fichero_carga_ejercicio2.txt";
	private final int NUM_LINEAS_CABECERA = 1;
	
	public static void main(String[] args) {
		Ejercicio2_2 ejer2 = new Ejercicio2_2();
		ejer2.iniciar();
	}
	
	public void iniciar() {
		EntityManager em = JpaUtil.getEM("hibernateOracle");
		ProductoDAO productoDao = new ProductoDAO(em);
		try {
			//Leemos el fichero 
			List<String> lineas = leerFichero(FICHERO);
			List<Producto> productos = generaProductosDesdeFichero(lineas,NUM_LINEAS_CABECERA);
			
			//Insertamos los datos
			productoDao.insertarProductos(productos);
//			
//			//Consulta general
//			List<Producto> productosConsulta = productoDao.getProductos();
//			for (Producto producto : productosConsulta) {
//				System.out.println(producto);
//			}

			//Consulta por fecha
//			String fecha = Utilidades.pideDatoTexto("Introduce la fecha de búsqueda(formato dd-MM-yyyy)");

//			SimpleDateFormat spdf = new SimpleDateFormat("dd-MM-yyyy");
//			Date fechaBusqueda = spdf.parse(fecha);
//			List<Producto> productosConsultaFecha = productoDao.getProductosByDate(fechaBusqueda);
//			for (Producto producto : productosConsultaFecha) {
//				System.out.println(producto);
//			}
			
			//Consulta media importe y total por tipo
//			List<Object[]> datos = productoDao.getInfoTiposProductos();
//			
//			for (Object[] registro : datos) {
//				
//				ProductosInfo productoInfo = 
//						new ProductosInfo(
//								Double.parseDouble(registro[1].toString()),
//								Long.parseLong(registro[2].toString()),
//								registro[0].toString());
//				
//				
//				System.out.println(productoInfo);
//			}
			
			List<ProductosInfo> datosHQL = productoDao.getInfoTiposProductosHQL();
			datosHQL.forEach(datos->System.out.println(datos));
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (ParseException pe) {
			pe.printStackTrace();
		}
		
	}
	
	private List<String> leerFichero(String rutaFichero) throws IOException{
		return Files.readAllLines(Paths.get(rutaFichero));
	
	}
	
	private List<Producto> generaProductosDesdeFichero (List<String> lineas, 
			int numLineasCabeceras) throws ParseException{
		
		List<Producto> productos = new ArrayList<Producto>();
		for (int i = numLineasCabeceras; i < lineas.size(); i++) {
			String linea = lineas.get(i);
			String [] campos = linea.split("\\;");
			Producto producto = generaProducto(campos);
			
			productos.add(producto);
		}
		
		return productos;
	}

	private Producto generaProducto (String [] campos) throws ParseException {
		Producto producto = new Producto();
		producto.setNombre(campos[0]);
		producto.setTipo(campos[1]);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		producto.setFechaAlta(sdf.parse(campos[2]));
		producto.setPrecio(Double.parseDouble(campos[3]));
		producto.setUnidades(Integer.parseInt(campos[4]));
	
		return producto;
	}
	
}
