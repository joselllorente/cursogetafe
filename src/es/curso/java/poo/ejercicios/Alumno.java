package es.curso.java.poo.ejercicios;

public class Alumno {

	//Variables de instancia
	private String dni;
	private String nombre;
	private String apellidos;
	private double nota;
	private boolean vip;
	
	//Constructores
	public Alumno () {
		this.nombre = "Juan";
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
		if (this.nota>9) {
			vip = true;
		}
	}
	
	
	public Alumno(String dni, String nombre, String apellidos, 
			double nota, boolean vip) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nota = nota;
		this.vip = vip;
	}

	//GETTER Y SETTER
	public String getDni() {
		return dni;
	}

//	public void setDni(String dni) {
//		this.dni = dni;
//	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
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

	@Override
	public String toString() {
		return "Alumno [" + (dni != null ? "dni=" + dni + ", " : "") + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (apellidos != null ? "apellidos=" + apellidos : "") + "]";
	}

	
}
