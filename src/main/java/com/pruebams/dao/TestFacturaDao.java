package com.pruebams.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pruebams.Utils.*;
import com.pruebams.model.TestFacturaModel;

public class TestFacturaDao {	
	
	public List<TestFacturaModel> getFacturas() throws SQLException, FileNotFoundException, IOException {
		Connection conexion = Utils.getConexion();
		List<TestFacturaModel> lstFacturas = new ArrayList<TestFacturaModel>();
		
		Statement s = conexion.createStatement();
		ResultSet rs = s.executeQuery ("select * from TEST_FACTURA");
		
		while (rs.next())
		{
			TestFacturaModel tempFacturaModel = new TestFacturaModel();
			tempFacturaModel.setIdFactura(rs.getInt(1));
			tempFacturaModel.setIdCliente(rs.getInt(2));
			tempFacturaModel.setFechaVenta(rs.getDate(3));
			tempFacturaModel.setValorTotal(BigInteger.valueOf(rs.getInt(4)));
			lstFacturas.add(tempFacturaModel);
		}
		 return lstFacturas;
	}
}
