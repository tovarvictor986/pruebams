package com.pruebams.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.pruebams.dao.TestClienteDao;
import com.pruebams.model.TestClienteModel;

public class TestClienteController {

	public List<TestClienteModel> getClientes() throws FileNotFoundException, SQLException, IOException{
		TestClienteDao testClienteDao = new TestClienteDao();
		return testClienteDao.getClientes();
	}
	
	public TestClienteModel getClienteByIdentificacion(String identificacion) throws FileNotFoundException, SQLException, IOException{
		TestClienteDao testClienteDao = new TestClienteDao();
		return testClienteDao.getClienteByIdentificacion(identificacion);
	}
}
