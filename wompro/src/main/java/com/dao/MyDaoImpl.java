package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.model.Workingwomen;

@Repository("myDao")
public class MyDaoImpl implements MyDaoIntf {

	public boolean insertWorkingwomen(Workingwomen ww) {
		
			Boolean result=false;
			try{
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
				EntityManager em1=emf.createEntityManager();
				em1.getTransaction().begin();
				em1.persist(ww);
				em1.getTransaction().commit();
				System.out.println("dao is called");
	            result=true;
	            em1.close();
	            emf.close();
				
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
			
			return result;
		}

	public List<Workingwomen> getUsers() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
		EntityManager em=emf.createEntityManager();
		@SuppressWarnings("unchecked")
		List<Workingwomen> list=em.createQuery("SELECT w FROM Workingwomen w").getResultList();
		System.out.println("dao is called");
		return list;
	}
	}

	
	
	
	
	


