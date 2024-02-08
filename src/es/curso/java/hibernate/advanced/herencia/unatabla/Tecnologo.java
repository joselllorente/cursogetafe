package es.curso.java.hibernate.advanced.herencia.unatabla;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="TC")
public class Tecnologo extends Persona
{
    private int aniosDeEstudios;
    
    public Tecnologo()
    {
    }

    public Tecnologo(String nombre, int edad, int aniosDeEstudios)
    {
        super(nombre, edad);
        this.aniosDeEstudios = aniosDeEstudios;
    }

    public int getAniosDeEstudios()
    {
        return aniosDeEstudios;
    }

    public void setAniosDeEstudios(int aniosDeEstudios)
    {
        this.aniosDeEstudios = aniosDeEstudios;
    }
}