package com.service;

import java.util.Date;

import com.dao.ServiceDao;
import com.model.Girlboydaycare;
import com.model.Workingwomen;



public class testapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Workingwomen ww=new Workingwomen();

		ww.setName("oshin");
		ww.setAdharno("672511111744");
		ww.setAddress("bangalore");
	    ww.setDob(new Date(1997,12,12));
		ww.setCaste("obc");
		ww.setPhychal("no");
		ww.setTrainingperiod(12);
		ww.setNgo("ngo1");
		ww.setGrossIncome(35000);
		
		Girlboydaycare g=new Girlboydaycare();
		
		g.setGender("male");
		g.setDob(new Date(1996,12,12));
		
	    ww.getGlist().add(g);
		
		
		
		
		
		boolean flag=new ServiceDao().getAllInfo(ww);
		System.out.println(flag);
		
		System.exit(0);
		
		
		
		

	}
	

}
