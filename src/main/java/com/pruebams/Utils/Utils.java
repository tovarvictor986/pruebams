package com.pruebams.Utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Utils {
	InputStream inputStream;	
	
	public Utils() {
		super();
	}

	public static Connection getConexion() throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		String propFileName = "src/main/resources/application.properties";
		prop.load(new FileInputStream(propFileName));
		try {
			Connection conexion = DriverManager.getConnection (prop.getProperty("mysql.url"),prop.getProperty("mysql.user"),prop.getProperty("mysql.password"));
			return conexion;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
//	public static void main(String[] args) throws FileNotFoundException, IOException {
//		getConexion();
//	}

}
