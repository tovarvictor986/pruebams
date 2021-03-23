package com.pruebams.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.pruebams.dao.TestFacturaDao;
import com.pruebams.model.TestFacturaModel;

public class TestFacturaController {
	TestFacturaDao testFacturaDao = new TestFacturaDao();
	
	public List<TestFacturaModel> getFacturas() throws FileNotFoundException, SQLException, IOException{		
		return testFacturaDao.getFacturas();
	}
}
