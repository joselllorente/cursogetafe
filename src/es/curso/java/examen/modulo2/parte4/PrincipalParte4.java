package es.curso.java.examen.modulo2.parte4;

import java.util.Date;
import java.util.List;

import es.curso.java.hibernate.ejercicios.ejercicio1.utils.UtilsFecha;
import es.curso.java.hibernate.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

public class PrincipalParte4 {

	public static void main(String[] args) {
		
		
		EntityManager em = JpaUtil.getEM("hibernateOracle");
		EntityTransaction transaction = em.getTransaction();
		
		System.out.println("FIN");
		
		Date fechaFinContrato1 = UtilsFecha.generaFecha(2023);
		Date fechaFinContrato2 = UtilsFecha.generaFecha(2024);
		Date fechaFinContrato3 = UtilsFecha.generaFecha(2025);
		
		Contrato contrato1 = new Contrato("Nombre1",new Date(),fechaFinContrato1,1000);
		Contrato contrato2 = new Contrato("Nombre2",new Date(),fechaFinContrato2,5000);
		Contrato contrato3 = new Contrato("Nombre3",new Date(),fechaFinContrato3,10000);

		try {
			//INSERTAMOS 3 CONTRATOS
			transaction.begin();
			em.persist(contrato1);
			em.persist(contrato2);
			em.persist(contrato3);
			transaction.commit();
			
			
			
			
		}catch(Exception e){
			transaction.rollback();
		}

		
		//CONSULTAMOS
		List<Contrato> contratos = em.createQuery("from Contrato",Contrato.class).getResultList();
		//List<Contrato> contratos = query.getResultList();
		for (Contrato contrato : contratos) {
			System.out.println(contrato);
		}
		
		
		//CONSULTAMOS POR NOMBRE DE CLIENTE
		Query query = em.createQuery(""
        		+ "from Contrato c "
        		+ "where c.nombreCliente=?1", Contrato.class);
        
		query.setParameter(1, "Nombre2");
		
		List<Contrato> listContratos = query.getResultList();
		listContratos.forEach( contrato  ->  System.out.println(contrato.getImporte()) );
		
		
		System.out.println("=====================================");
		//CONSULTAMOS POR NOMBRE DE CLIENTE
		Query query2 = em.createQuery(""
        		+ "from Contrato c "
        		+ "where c.fechaFin>?1", Contrato.class);
        
		Date fechaConsulta = UtilsFecha.generaFecha(2024, 10, 10);
		query2.setParameter(1, fechaConsulta);
		
		List<Contrato> listContratosPorFecha = query2.getResultList();
		listContratosPorFecha.forEach( contrato  ->  System.out.println(contrato) );
		
		
		
		System.out.println("=====================================");
		//CONSULTAMOS POR IMPORTE
		Query query3 = em.createQuery(""
        		+ "from Contrato c "
        		+ "where c.importe>?1", Contrato.class);
        
		query3.setParameter(1, 1000);
		
		List<Contrato> listContratosPorImporte = query3.getResultList();
		listContratosPorImporte.forEach( contrato  ->  System.out.println(contrato) );
		
		
		
		
	}

}
