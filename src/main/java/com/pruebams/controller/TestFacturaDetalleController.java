package com.pruebams.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.pruebams.dao.TestFacturaDetalleDao;
import com.pruebams.model.TestFacturaDetalleModel;

public class TestFacturaDetalleController {
	TestFacturaDetalleDao testFacturaDetalleDao = new TestFacturaDetalleDao();
	
	public List<TestFacturaDetalleModel> getFacturasDetalle() throws FileNotFoundException, SQLException, IOException{		
		return testFacturaDetalleDao.getFacturasDetalle();
	}
}
