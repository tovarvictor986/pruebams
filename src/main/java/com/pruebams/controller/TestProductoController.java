package com.pruebams.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.pruebams.dao.TestProductoDao;
import com.pruebams.model.TestProductoModel;

public class TestProductoController {
	TestProductoDao testProductoDao = new TestProductoDao();
	
	public List<TestProductoModel> getProductos() throws FileNotFoundException, SQLException, IOException{		
		return testProductoDao.getProductos();
	}
	
	public TestProductoModel getProductoById(String idProducto) throws FileNotFoundException, SQLException, IOException{
		TestProductoDao testProductoDao = new TestProductoDao();
		return testProductoDao.getProductoById(idProducto);
	}
	
	public TestProductoModel getProductoByCodigo(String codigo) throws FileNotFoundException, SQLException, IOException{
		TestProductoDao testProductoDao = new TestProductoDao();
		return testProductoDao.getProductoByCodigo(codigo);
	}
}
