package es.curso.java.ficheros;

import java.time.Instant;
import java.time.LocalDateTime;

public class EjemploCrearArchivo {
    public static void main(String[] args) {
    	LocalDateTime datetime = LocalDateTime.now();
    	System.out.println(datetime.getYear());
    	System.out.println(datetime.getMonthValue());
    	//System.out.println(datetime.getMonth());
    	
    	Instant instant = Instant.now();
    	System.out.println(instant);
    	//Ruta relativa a la carpeta del proyecto
        String nombreArchivo = "./recursos/java3.txt";

        ArchivoServicio service = new ArchivoServicio();
        //service.mostrarContenidoDirectorio("C:\\Users\\Tardes\\");
        service.crearArchivo2(nombreArchivo);
    }
}
