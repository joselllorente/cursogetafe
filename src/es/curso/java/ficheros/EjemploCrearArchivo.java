package es.curso.java.ficheros;

public class EjemploCrearArchivo {
    public static void main(String[] args) {
    	//Ruta relativa a la carpeta del proyecto
        String nombreArchivo = "./recursos/java2.txt";

        ArchivoServicio service = new ArchivoServicio();
        service.mostrarContenidoDirectorio("C:\\Users\\Tardes\\");
        //service.crearArchivo2(nombreArchivo);
    }
}
