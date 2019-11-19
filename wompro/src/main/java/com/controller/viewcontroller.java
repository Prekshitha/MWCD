package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Workingwomen;
import com.service.MyserviceIntf;

@Controller
public class viewcontroller {

	
	@Autowired
	MyserviceIntf myService;
	
	
	
	@RequestMapping(value="/viewusers",method=RequestMethod.GET)
	public ModelAndView ViewUsers(){
		List<Workingwomen> list=myService.getUsers();
		ModelAndView mav=new ModelAndView("viewrecord");
		mav.addObject("obj",list);
		return  mav;
	}
		
}
	

