package es.curso.java.hibernate.basics;

import es.curso.java.hibernate.util.JpaUtil;
import jakarta.persistence.EntityManager;

public class HibernateOracle {

	public static void main(String[] args) {

		EntityManager em = JpaUtil.getEM("hibernateOracle");

	}

}
