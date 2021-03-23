package com.pruebams.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pruebams.Utils.*;
import com.pruebams.model.TestClienteModel;

public class TestClienteDao {	
	
	public List<TestClienteModel> getClientes() throws SQLException, FileNotFoundException, IOException {
		Connection conexion = Utils.getConexion();
		List<TestClienteModel> lstClientes = new ArrayList<TestClienteModel>();
		
		Statement s = conexion.createStatement();
		ResultSet rs = s.executeQuery ("select * from TEST_CLIENTE");
		
		// Recorremos el resultado, mientras haya registros para leer, y escribimos el resultado en pantalla.
		while (rs.next())
		{
			TestClienteModel tempClienteModel = new TestClienteModel();
		    tempClienteModel.setIdCliente(rs.getInt(1));
		    tempClienteModel.setIdentificacion(rs.getString(2));
		    tempClienteModel.setNombres(rs.getString(3));
		    tempClienteModel.setApellidos(rs.getString(4));
		    tempClienteModel.setDireccion(rs.getString(5));
		    tempClienteModel.setTelefono(rs.getString(6));
		    tempClienteModel.setEmail(rs.getString(7));
		    lstClientes.add(tempClienteModel);
		}
		 return lstClientes;
	}
	
	public TestClienteModel getClienteByIdentificacion(String identificacion) throws SQLException, FileNotFoundException, IOException {
		Connection conexion = Utils.getConexion();
		TestClienteModel cliente = new TestClienteModel();
		
		Statement s = conexion.createStatement();
		ResultSet rs = s.executeQuery ("select * from TEST_CLIENTE WHERE identificacion="+identificacion);
		
		// Recorremos el resultado, mientras haya registros para leer, y escribimos el resultado en pantalla.
		while (rs.next())
		{			
		    cliente.setIdCliente(rs.getInt(1));
		    cliente.setIdentificacion(rs.getString(2));
		    cliente.setNombres(rs.getString(3));
		    cliente.setApellidos(rs.getString(4));
		    cliente.setDireccion(rs.getString(5));
		    cliente.setTelefono(rs.getString(6));
		    cliente.setEmail(rs.getString(7));		    
		}
		 return cliente;
	}
}
