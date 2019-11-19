package com.dao;

import java.util.List;

import com.model.Workingwomen;

public interface MyDaoIntf {
	
	public boolean insertWorkingwomen(Workingwomen ww);
	public List<Workingwomen> getUsers();

}
