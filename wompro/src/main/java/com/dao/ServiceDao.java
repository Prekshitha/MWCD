package com.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class ServiceDao {
	
	public boolean getAllInfo(com.model.Workingwomen ww){
		Boolean result=false;
		try{
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
			EntityManager em1=emf.createEntityManager();
			em1.getTransaction().begin();
			em1.persist(ww);
			em1.getTransaction().commit();
            result=true;
            em1.close();
            emf.close();
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		return result;
	}
	
	
	
	/*public boolean getAllChildren(Girlboydaycare gbd){
		Boolean result=false;
		try{
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
			EntityManager em1=emf.createEntityManager();
			em1.getTransaction().begin();
			em1.persist(gbd);
			em1.getTransaction().commit();
            result=true;
            em1.close();
            emf.close();
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		return result;
	}*/


}
