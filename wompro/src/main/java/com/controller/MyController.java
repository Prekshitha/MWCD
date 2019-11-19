package com.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Girlboydaycare;
import com.model.Workingwomen;
import com.service.MyserviceIntf;

@Controller

	public class MyController {
		
		@Autowired
		MyserviceIntf myService;
		
		
		
		
	
	@RequestMapping(value="/query",method=RequestMethod.GET)
	public String getQueryform(){
		return "query";
		
		
		
	}
		@RequestMapping(value="/workingwomen", method=RequestMethod.GET)
		public ModelAndView insertContact(HttpServletRequest request,HttpServletResponse response) throws ParseException{
			
		String gender=request.getParameter("gender");
		SimpleDateFormat formatter2=new SimpleDateFormat("yyyy-MM-dd");
		Date datec=formatter2.parse(request.getParameter("date1"));
		Girlboydaycare gbd=new Girlboydaycare();
		
		gbd.setGender(gender);
		gbd.setDob(datec);
		
		
			
		String name=request.getParameter("name");
		String adhar=request.getParameter("ano");
		String address=request.getParameter("add");
		SimpleDateFormat formatter1=new SimpleDateFormat("yyyy-MM-dd");
		Date date=formatter1.parse(request.getParameter("date")); 
		String caste=request.getParameter("caste");
		String contact=request.getParameter("contact");
		String phyl=request.getParameter("phychal");
		String ngo=request.getParameter("ngo");
		int workperiod=Integer.parseInt(request.getParameter("wp"));
		
		Double gross=Double.parseDouble(request.getParameter("gi"));
		
		
		Workingwomen ww =new Workingwomen();
		ww.setName(name);
		ww.setAdharno(adhar);
		ww.setAddress(address);
		ww.setDob(date);
		ww.setCaste(caste);
		ww.setContact(contact);
		ww.setPhychal(phyl);
		ww.setNgo(ngo);
		ww.setTrainingperiod(workperiod);
		ww.setGrossIncome(gross);
		ww.setStatus("false");
		ww.getGlist().add(gbd);
		
		
		boolean flag=myService.insertWorkingwomen(ww);
		ModelAndView mav=new ModelAndView();
		mav.addObject("name",name);
		if(flag)
			mav.addObject("status","message is accecepted");
		else
			mav.addObject("status","sorry.........message is not accecepted");
		mav.setViewName("viewreport");
		return mav;
		
	}
		
		

}
