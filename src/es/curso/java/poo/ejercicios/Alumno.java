package es.curso.java.poo.ejercicios;

public class Alumno {

	//Variables de instancia
	String dni;
	String nombre;
	String apellidos;
	double nota;
	
	//Constructores
	public Alumno () {
		
	}
	
	public Alumno (String dni, String nombre, String apellidos) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	public Alumno (String dni, String nombre, String apellidos , double nota) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nota = nota;
	}
	
	//Métodos
	public void estudiar () {
		System.out.println("El alumno "+ nombre );
		if (nota == 0) {
			System.out.println("No ha estudiado nada");
		}else if(nota<5) {
			System.out.println("Ha estudiado poco");
		}else if(nota>=5 && nota <9) {
			System.out.println("Ha estudiado mucho");
		}else {
			System.out.println("Es un genio");
		}
	}	
}
