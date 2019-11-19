package com.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MyDaoIntf;
import com.model.Workingwomen;

@Service("myService")
public class MyServiceImpl implements MyserviceIntf {

	
	
	@Autowired
	MyDaoIntf myDao;
	
	public boolean insertWorkingwomen(Workingwomen ww) {
		System.out.println("service is called");
		boolean flag=myDao.insertWorkingwomen(ww);
		return flag;
		
	}

	public List<Workingwomen> getUsers() {
		
		List<Workingwomen> list=myDao.getUsers();
		return list;
		}
	}


