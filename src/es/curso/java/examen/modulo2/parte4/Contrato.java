package es.curso.java.examen.modulo2.parte4;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity	
@Table(name="TB_CONTRATOS")
public class Contrato {
	@Id
	@SequenceGenerator(name="CONTRATOSGEN", sequenceName="CONTRATOS_GEN", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CONTRATOSGEN")
	@Column(name="ID", nullable=false, updatable=false)
    private long id;
	private String nombreCliente;
	private Date fechaInicio;
	private Date fechaFin;
	private double importe;
	
	
	public Contrato() {
		super();
	}

	public Contrato(String nombreCliente, Date fechaInicio, Date fechaFin, double importe) {
		super();
		this.nombreCliente = nombreCliente;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.importe = importe;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the nombreCliente
	 */
	public String getNombreCliente() {
		return nombreCliente;
	}

	/**
	 * @param nombreCliente the nombreCliente to set
	 */
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	/**
	 * @return the fechaInicio
	 */
	public Date getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * @param fechaInicio the fechaInicio to set
	 */
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	/**
	 * @return the fechaFin
	 */
	public Date getFechaFin() {
		return fechaFin;
	}

	/**
	 * @param fechaFin the fechaFin to set
	 */
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	/**
	 * @return the importe
	 */
	public double getImporte() {
		return importe;
	}

	/**
	 * @param importe the importe to set
	 */
	public void setImporte(double importe) {
		this.importe = importe;
	}

	@Override
	public String toString() {
		return "Contrato [id=" + id + ", " + (nombreCliente != null ? "nombreCliente=" + nombreCliente + ", " : "")
				+ (fechaInicio != null ? "fechaInicio=" + fechaInicio + ", " : "")
				+ (fechaFin != null ? "fechaFin=" + fechaFin + ", " : "") + "importe=" + importe + "]";
	}
	
	
	
	
	

}
