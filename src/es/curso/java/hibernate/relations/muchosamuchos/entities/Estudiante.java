package es.curso.java.hibernate.relations.muchosamuchos.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="TB_ESTUDIANTE")
public class Estudiante implements Serializable
{
	@Id
	@SequenceGenerator(name = "ESTUDIANTEGEN", sequenceName = "ESTUDIANTE_GEN", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ESTUDIANTEGEN")
	@Column(name = "ID", nullable = false, updatable = false)
    private long id;
    private String nombre;
    @ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinTable(name="TB_ESTUDIANTES_MATERIAS")
    private List<Materia> materias = new ArrayList<Materia>();

    public Estudiante()
    {
    }

    public long getId()
    {
        return id;
    }

    protected void setId(long id)
    {
        this.id = id;
    }

    public List<Materia> getMaterias()
    {
        return materias;
    }

    public void setMaterias(List<Materia> materias)
    {
        this.materias = materias;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void addMateria(Materia materia)
    {
        this.materias.add(materia);
    }
}