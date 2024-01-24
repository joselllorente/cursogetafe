package es.curso.java.repaso.ejercicios.ejercicio1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class FerreteriaMainEnumProperties {

	public static void main(String[] args) {


		
//		System.out.println(args[0]);
//		Tornillo tornillo1 = new Tornillo(TornillosEnum.tornillo1.getId(),
//				TornillosEnum.tornillo1.getColor(),
//				TornillosEnum.tornillo1.getLongitud(),
//				TornillosEnum.tornillo1.getDiametro(),
//				TornillosEnum.tornillo1.getPrecio()
//			);
		
		int size = TornillosEnum.values().length;
		Tornillo[] tornillos = new Tornillo[size];
		
//		for ( int i=0; i<TornillosEnum.values().length;i++) {
//			
//		}
		int contador = 0;
		for ( TornillosEnum te :  TornillosEnum.values()) {
			long id = te.getId();
			String color = te.getColor();
			double longitud = te.getLongitud();
			double diametro = te.getDiametro();
			double precio = te.getPrecio();
			
			Tornillo tornillo = new Tornillo(id,color,longitud,diametro,precio);
			tornillos[contador++]= tornillo;
		}

		try {
			
			String nombreFichero= "ferreteria"+ ((args.length==0)?"":args[0]) + ".properties";
			FileInputStream fichero = new FileInputStream("src/"+nombreFichero);
			
			Properties properties = new Properties();
			properties.load(fichero);
			
			String nombre = properties.getProperty("loquequieras.nombre");
			String direccion = properties.getProperty("direccion");
			long id = Long.parseLong(properties.getProperty("id"));
			
			Ferreteria ferreteria = new Ferreteria (id,nombre,direccion);
			System.out.println(ferreteria.getNombre());
			ferreteria.setTornillos(tornillos);
			System.out.println(ferreteria.getTornillos().length);
			
			
			List<Tornillo> listaTornillos =  Arrays.asList(ferreteria.getTornillos());
			System.out.println("==============================");
			
			double [] precioTornillos= {0};
			Double  precioTornillosDouble= 0.0;
			listaTornillos.forEach(tornillo-> precioTornillos[0]+=tornillo.getPrecio());
			//listaTornillos.forEach(tornillo-> precioTornillosDouble+=tornillo.getPrecio());
			System.out.println(precioTornillos[0]);
			
			
			System.out.println("==============================");
			
			double precioTotal= listaTornillos.stream().
//				filter(tornillo->tornillo.getPrecio()>0.1).
				mapToDouble(Tornillo::getPrecio).
				sum();
			
			System.out.println(precioTotal);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		}
		
		
		
		
		
	}

}
