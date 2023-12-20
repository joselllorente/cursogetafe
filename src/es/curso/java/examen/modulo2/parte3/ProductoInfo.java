package es.curso.java.examen.modulo2.parte3;

public class ProductoInfo {
	private String tipo;
	private double precioMedio;
	private int cantidadPorTipo;
	
	public ProductoInfo(String tipo, double precioMedio, int cantidadPorTipo) {
		super();
		this.tipo = tipo;
		this.precioMedio = precioMedio;
		this.cantidadPorTipo = cantidadPorTipo;
	}
	
	public ProductoInfo(double precioMedio, int cantidadPorTipo) {
		super();
		this.precioMedio = precioMedio;
		this.cantidadPorTipo = cantidadPorTipo;
	}
	/**
	 * @return the precioMedio
	 */
	public double getPrecioMedio() {
		return precioMedio;
	}
	/**
	 * @param precioMedio the precioMedio to set
	 */
	public void setPrecioMedio(double precioMedio) {
		this.precioMedio = precioMedio;
	}
	/**
	 * @return the cantidadPorTipo
	 */
	public int getCantidadPorTipo() {
		return cantidadPorTipo;
	}
	/**
	 * @param cantidadPorTipo the cantidadPorTipo to set
	 */
	public void setCantidadPorTipo(int cantidadPorTipo) {
		this.cantidadPorTipo = cantidadPorTipo;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "ProductoInfo [" + (tipo != null ? "tipo=" + tipo + ", " : "") + "precioMedio=" + precioMedio
				+ ", cantidadPorTipo=" + cantidadPorTipo + "]";
	}
	
	
	
}
