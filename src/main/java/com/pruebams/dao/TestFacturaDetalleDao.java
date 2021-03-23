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
import com.pruebams.model.TestFacturaDetalleModel;

public class TestFacturaDetalleDao {	
	
	public List<TestFacturaDetalleModel> getFacturasDetalle() throws SQLException, FileNotFoundException, IOException {
		Connection conexion = Utils.getConexion();
		List<TestFacturaDetalleModel> lstFacturasDetalle = new ArrayList<TestFacturaDetalleModel>();
		
		Statement s = conexion.createStatement();
		ResultSet rs = s.executeQuery ("select * from TEST_FACTURA_DETALLE");
		
		while (rs.next())
		{
			TestFacturaDetalleModel tempFacturaDetalleModel = new TestFacturaDetalleModel();
			tempFacturaDetalleModel.setIdFacturaDetalle(rs.getInt(1));
			tempFacturaDetalleModel.setIdFactura(rs.getInt(2));
			tempFacturaDetalleModel.setIdProducto(rs.getInt(3));
			tempFacturaDetalleModel.setCantidad(rs.getInt(4));
			tempFacturaDetalleModel.setValorUnidad(BigInteger.valueOf(rs.getInt(5)));
			tempFacturaDetalleModel.setValorTotal(BigInteger.valueOf(rs.getInt(6)));
			lstFacturasDetalle.add(tempFacturaDetalleModel);
		}
		 return lstFacturasDetalle;
	}
}
