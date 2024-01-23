package es.curso.java.sistema;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try {
            InputStream archivo = new FileInputStream("src/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");
            System.out.println(p.getProperty("config.autor.nombre"));
            System.out.println(p.getProperty("mi.propiedad.personalizada"));
            
            
            System.setProperties(p);
//
//            Properties properties = System.getProperties();
//            System.out.println("ps.getProperty(...) = " + properties.getProperty("mi.propiedad.personalizada"));
//            System.out.println(System.getProperty("config.puerto.servidor"));
//            System.out.println(System.getProperty("config.autor.nombre"));
//            System.out.println(System.getProperty("config.autor.email"));
//
//            properties.list(System.out);
        } catch(Exception e){
            System.err.println("no existe el archivo = " + e);
            System.exit(1);
        }
    }
}
