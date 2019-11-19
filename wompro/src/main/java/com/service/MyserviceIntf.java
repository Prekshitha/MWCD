package com.service;

import java.util.List;

import com.model.Workingwomen;

public interface MyserviceIntf {
	public boolean insertWorkingwomen(Workingwomen ww);
	public List<Workingwomen> getUsers();

}
