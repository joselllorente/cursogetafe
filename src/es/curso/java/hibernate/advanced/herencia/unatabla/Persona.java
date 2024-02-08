package es.curso.java.hibernate.advanced.herencia.unatabla;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//Si no indicamos nada el nombre de la columna ser� "DTYPE" y el tipo ser� "String".
//La anotaci�n @DiscriminatorColumn solo debe ser usada en la clase raiz de la herencia 
//(a no ser que una subclase desee cambiar los par�metros del mapeo, en cuyo caso ella se convertir�a en clase raiz por derecho). 
//El atributo discriminatorType de la citada anotaci�n nos permite cambiar el tipo de valor que almacenar� la columna discriminatoria. Los tipos soportados son STRING (por defecto), CHAR e INTEGER. 
@DiscriminatorColumn(name="DIS", discriminatorType=DiscriminatorType.STRING)
@Table(name="TB_PERSONA")
public abstract class Persona implements Serializable
{
	@Id
	@SequenceGenerator(name = "PERSONAGEN", sequenceName = "PERSONA_GEN", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PERSONAGEN")
	@Column(name = "ID", nullable = false, updatable = false)
    private long id;
    private String nombre;
    private int edad;

    public Persona()
    {
    }

    public Persona(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public long getId()
    {
        return id;
    }

    protected void setId(long id)
    {
        this.id = id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
}
