package es.curso.java.hibernate.advanced.herencia.unatabla;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import es.curso.java.hibernate.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public abstract class AbstractDAO
{
    private static EntityManager em;

    protected void iniciaOperacion()
    {
    	em = JpaUtil.getEM("hibernateOracle");
    }

    protected void terminaOperacion()
    {
//        sesion.getTransaction().commit();
//        sesion.close();
    }

//    protected void manejaExcepcion(HibernateException he) throws HibernateException
//    {
//        sesion.getTransaction().rollback();
//        throw he;
//    }

//    protected Session getSession()
//    {
//        return sesion;
//    }

    public static void almacenaEntidad(Persona entidad) throws HibernateException
    {
        AbstractDAO dummy = new AbstractDAO(){};

        try
        {
        	em = JpaUtil.getEM("hibernateOracle");
        	EntityTransaction transaction = em.getTransaction();
        	transaction.begin();
            em.persist(entidad);
            transaction.commit();
            
        }
        catch (HibernateException he)
        {
           System.err.println("Error "+he.getMessage());
        }
    }

    public static <T> T getEntidad(Serializable id, Class<T> claseEntidad) throws HibernateException
    {
        AbstractDAO dummy = new AbstractDAO(){};

        T objetoRecuperado = null;

        try
        {
            dummy.iniciaOperacion();
            objetoRecuperado = (T) em.find(claseEntidad, id);
        }
        catch (HibernateException he)
        {
            
        }

        return objetoRecuperado;
    }

    public static <T> List<T> getListaEntidades(Class<T> claseEntidad) throws HibernateException
    {
        AbstractDAO dummy = new AbstractDAO(){};

        List<T> listaResultado = null;

        try
        {
            dummy.iniciaOperacion();
            listaResultado = em.createQuery("FROM " + claseEntidad.getSimpleName()).getResultList();
        }
        catch (HibernateException he)
        {
           
        }
        return listaResultado;
    }
}