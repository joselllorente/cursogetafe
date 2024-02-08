package es.curso.java.hibernate.advanced.compositekey;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Version;

@Entity
@Table(name="TB_EMPLEADO")
@IdClass(value=DireccionPK.class)
public class Empleado {
	@Id
	private String direccion;
	@Id
	private String codigoPostal;
	private String ciudad;
	private String localidad;
	private String pais;
	private String puesto;
	@Column(name="FECHA_ALTA")
	@Temporal(TemporalType.DATE)
	private Date fechaAlta;
	@Version
	private int version;
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "Empleado [direccion=" + direccion + ", codigoPostal="
				+ codigoPostal + ", ciudad=" + ciudad + ", localidad="
				+ localidad + ", pais=" + pais + ", puesto=" + puesto + "]";
	}

	
}
