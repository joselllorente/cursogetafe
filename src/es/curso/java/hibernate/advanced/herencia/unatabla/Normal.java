package es.curso.java.hibernate.advanced.herencia.unatabla;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="NRM")
public class Normal extends Persona
{
    private String ocupacion;
    
    public Normal()
    {
    }

    public Normal(String nombre, int edad, String ocupacion)
    {
        super(nombre, edad);
        this.ocupacion = ocupacion;
    }

    public String getOcupacion()
    {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion)
    {
        this.ocupacion = ocupacion;
    }
}