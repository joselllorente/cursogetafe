package es.curso.java.hibernate.basics.enums;

public enum AlumnoEnum {

	ALUMNO1("Nombre1","Apellido1","DNI1","admin"),
	ALUMNO2("Nombre2","Apellido2","DNI2","admin"),
	ALUMNO3("Nombre3","Apellido3","DNI3","user1");
	
	private String nombre;
	private String apellidos;
	private String dni;
	private String user;
	
	private AlumnoEnum(String nombre, String apellidos, String dni, String user) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.user = user;
	}

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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
}
