package es.curso.java.colecciones.ejercicios.guerra;

import java.util.ArrayList;
import java.util.List;

import es.curso.java.colecciones.ejercicios.guerra.exceptions.LimiteValoresException;
import es.curso.java.colecciones.ejercicios.guerra.exceptions.UnidadesPermitadasException;

public abstract class VehiculoGuerra implements Tripulable {

	private String nombre;
	private int ataque;
	private int defensa;
	private List<Guerrero> guerreros = new ArrayList<Guerrero>();
	private int puntosVida=PUNTOS_VIDA;
	
	
	private VehiculoGuerra (int ataque, int defensa) throws LimiteValoresException {
		if (ataque+defensa>10) {
			throw new LimiteValoresException(
					"La suma del ataque "
					+ "y defensa de la nave no puede ser superior a 10");
		}else {
			this.ataque = ataque;
			this.defensa = defensa;
		}
	}
	/**
	 * Inicializa la nave con los valores de ataque y defensa en 5
	 * @param nombre
	 */
	public VehiculoGuerra(String nombre) throws LimiteValoresException{
		this(5,5);
		this.nombre = nombre;

	}
	public VehiculoGuerra(String nombre, int ataque, int defensa) throws LimiteValoresException{
		this(ataque,defensa);
		this.nombre = nombre;
	}
	
	public VehiculoGuerra(String nombre, int ataque, int defensa, int puntosVida) throws LimiteValoresException{
		this(ataque,defensa);
		this.nombre = nombre;
		this.puntosVida = puntosVida;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the ataque
	 */
	public int getAtaque() {
		return ataque;
	}
	/**
	 * @param ataque the ataque to set
	 */
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	/**
	 * @return the defensa
	 */
	public int getDefensa() {
		return defensa;
	}
	/**
	 * @param defensa the defensa to set
	 */
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	/**
	 * @return the guerreros
	 */
	public List<Guerrero> getGuerreros() {
		return guerreros;
	}
	
	/**
	 * @return the puntosVida
	 */
	int getPuntosVida() {
		return puntosVida;
	}
	/**
	 * @param puntosVida the puntosVida to set
	 */
	void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}
	
	
	/**
	 * @param guerreros the guerreros to set
	 */
	public void setGuerreros(List<Guerrero> guerreros) {
		this.guerreros = guerreros;
	}
	
	
	public void embarcarGuerro (Guerrero guerrero) throws UnidadesPermitadasException {
	
		if (this.guerreros.size()<10) {
			this.guerreros.add(guerrero);
		}else {
			throw new UnidadesPermitadasException("Has superado el numero de unidades máximo establecido en 10"); 
		}

	}	
}
