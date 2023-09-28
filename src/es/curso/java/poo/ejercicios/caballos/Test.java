package es.curso.java.poo.ejercicios.caballos;

public class Test {

	public static void main(String[] args) {
		Caballo caballo = new Caballo(1,"Caballo Alumno",11,6,80,200);
		GranPremio gp = new GranPremio();
		gp.iniciarGranPremio(caballo);

	}

}
