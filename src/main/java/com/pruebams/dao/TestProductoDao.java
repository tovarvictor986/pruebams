package com.pruebams.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pruebams.Utils.Utils;
import com.pruebams.model.TestProductoModel;

public class TestProductoDao {
	
	public List<TestProductoModel> getProductos() throws SQLException, FileNotFoundException, IOException {
		Connection conexion = Utils.getConexion();
		List<TestProductoModel> lstProductos = new ArrayList<TestProductoModel>();
		
		Statement s = conexion.createStatement();
		ResultSet rs = s.executeQuery ("select * from TEST_PRODUCTO");
		
		// Recorremos el resultado, mientras haya registros para leer, y escribimos el resultado en pantalla.
		while (rs.next())
		{
			TestProductoModel tempProductoModel = new TestProductoModel();
			tempProductoModel.setIdProducto(rs.getInt(1));
			tempProductoModel.setCodigo(rs.getString(2));
			tempProductoModel.setNombre(rs.getString(3));
			tempProductoModel.setValorUnidad(rs.getString(4));
			tempProductoModel.setStock(rs.getString(5));
		    lstProductos.add(tempProductoModel);
		}
		 return lstProductos;
	}

	public TestProductoModel getProductoById(String idProducto) throws SQLException, FileNotFoundException, IOException {
		Connection conexion = Utils.getConexion();
		TestProductoModel producto = new TestProductoModel();
		
		Statement s = conexion.createStatement();
		ResultSet rs = s.executeQuery ("select * from TEST_PRODUCTO where idProducto ="+idProducto);
		
		// Recorremos el resultado, mientras haya registros para leer, y escribimos el resultado en pantalla.
		while (rs.next())
		{			
			producto.setIdProducto(rs.getInt(1));
			producto.setCodigo(rs.getString(2));
			producto.setNombre(rs.getString(3));
			producto.setValorUnidad(rs.getString(4));
			producto.setStock(rs.getString(5));
		}
		 return producto;
	}
	
	public TestProductoModel getProductoByCodigo(String codigo) throws SQLException, FileNotFoundException, IOException {
		Connection conexion = Utils.getConexion();
		TestProductoModel producto = new TestProductoModel();
		
		Statement s = conexion.createStatement();
		ResultSet rs = s.executeQuery ("select * from TEST_PRODUCTO where codigo ="+codigo);
		
		// Recorremos el resultado, mientras haya registros para leer, y escribimos el resultado en pantalla.
		while (rs.next())
		{			
			producto.setIdProducto(rs.getInt(1));
			producto.setCodigo(rs.getString(2));
			producto.setNombre(rs.getString(3));
			producto.setValorUnidad(rs.getString(4));
			producto.setStock(rs.getString(5));
		}
		 return producto;
	}

}
