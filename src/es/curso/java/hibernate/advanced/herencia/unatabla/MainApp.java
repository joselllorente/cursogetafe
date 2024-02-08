package es.curso.java.hibernate.advanced.herencia.unatabla;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		Normal      normal       = new Normal("normal", 21, "Empleado");
	    Tecnologo   tecnologo    = new Tecnologo("tecnologo", 24, 4);
	    Programador programador1 = new Programador("primer programador", 25, 4, "java", 4);
	    Programador programador2 = new Programador("segundo programador", 25, 5, "java", 2);
	    Tester      tester       = new Tester("tester", 18, 3, "JUnit");
	    
	    AbstractDAO.almacenaEntidad(normal);
	    AbstractDAO.almacenaEntidad(tecnologo);
	    AbstractDAO.almacenaEntidad(programador1);
	    AbstractDAO.almacenaEntidad(programador2);
	    AbstractDAO.almacenaEntidad(tester);
	    System.exit(0);
	}

}
