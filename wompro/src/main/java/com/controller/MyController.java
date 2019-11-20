package com.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
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
		@RequestMapping(value="/query", method=RequestMethod.POST)
		 public ModelAndView addUser2(HttpServletRequest request, HttpServletResponse response,  @ModelAttribute("workingwomen") Workingwomen workingwomen, @RequestParam("file") MultipartFile files[]) throws ParseException{
		//public ModelAndView insertContact(HttpServletRequest request,HttpServletResponse response) throws ParseException{
			String username = request.getParameter("ano");
			for (int i = 0; i < files.length; i++) {
				String filename="";
				if(i==0)
					
					filename=(username+i)+".pdf";
					else if(i==1)
						filename=(username+i)+".pdf";
					else if(i==2)
						filename=(username+i)+".jpg";
				MultipartFile file = files[i];
				try {
					byte[] bytes = file.getBytes();

					// Creating the directory to store file
					String rootPath = System.getProperty("catalina.home");
					File dir = new File(rootPath + File.separator + "tmpFiles");
					if (!dir.exists())
						dir.mkdirs();

					// Create the file on server
					File serverFile = new File(dir.getAbsolutePath()+ File.separator + filename);
					BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
					stream.write(bytes);
					stream.close();
					
					if(i==0)
                    workingwomen.setAddress_fname(filename);
					else if(i==1)
					workingwomen.setDob_fname(filename);
					else if(i==2)
					workingwomen.setImage(filename);
					
					
					System.out.println("Server File Location="+ serverFile.getAbsolutePath());
					} catch (Exception e) {
					System.out.println( "You failed to upload " + (username+i) + " => " + e.getMessage());
				}
			}
			
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
		
//		if(datec.getYear()-date.getYear()>0){
//			
//		}
		
		
		
		boolean flag=myService.insertWorkingwomen(ww);
		ModelAndView mav=new ModelAndView();
		mav.addObject("name",name);
	
		if(flag)
			mav.addObject("status","Your details are successfully inserted");
		else
			mav.addObject("status","sorry.........data is not inserted");
		mav.setViewName("viewreport");
		return mav;
		
	}
		
		

}

