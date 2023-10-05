package es.curso.java.poo.ejercicios.herencia.orquesta;

public class Tambor extends Instrumento {
	private String material;

	public Tambor(String nombre, String tipo, String material) {
		super(nombre, tipo);
		this.material = material;
	}

	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * @param material the material to set
	 */
	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Tambor [" + (material != null ? "material=" + material : "") + "]";
	}

	@Override
	public void afinar() {
		System.out.println("Afinando Tambor "+ getNombre());
	}
	
	public void aporrear() {
		System.out.println("Aporreando Tambor "+ getNombre());
	}
}
