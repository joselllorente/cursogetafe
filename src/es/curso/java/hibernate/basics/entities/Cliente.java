package es.curso.java.hibernate.basics.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="TB_CLIENTES")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name="nombre_cliente", length = 30 , nullable = false )
    private String nombre;
    
    private String apellido;

    @Column(name="forma_pago", length = 10 )
    private String formaPago;
    
 
    private String campo1;

    //Debe existir obligatoriamente 
    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String formaPago) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.formaPago = formaPago;
    }
    
    public Cliente(Long id, String nombre, String apellido, String formaPago) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.formaPago = formaPago;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }
    
    

    /**
	 * @return the campo1
	 */
	public String getCampo1() {
		return campo1;
	}

	/**
	 * @param campo1 the campo1 to set
	 */
	public void setCampo1(String campo1) {
		this.campo1 = campo1;
	}

	@Override
    public String toString() {
        return "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", formaPago='" + formaPago +"'";
    }
}
