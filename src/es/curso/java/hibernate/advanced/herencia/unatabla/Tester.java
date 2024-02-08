package es.curso.java.hibernate.advanced.herencia.unatabla;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="TS")
public class Tester extends Tecnologo
{
    private String herramientaDeTesteo;
    
    public Tester()
    {
    }

    public Tester(String nombre, int edad, int aniosDeEstudios, String herramientaDeTesteo)
    {
        super(nombre, edad, aniosDeEstudios);
        this.herramientaDeTesteo = herramientaDeTesteo;
    }
    
    public String getHerramientaDeTesteo()
    {
        return herramientaDeTesteo;
    }

    public void setHerramientaDeTesteo(String herramientaDeTesteo)
    {
        this.herramientaDeTesteo = herramientaDeTesteo;
    }
}