package com.pruebams.rest;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pruebams.controller.TestClienteController;
import com.pruebams.controller.TestProductoController;
import com.pruebams.controller.TestFacturaController;
import com.pruebams.controller.TestFacturaDetalleController;
import com.pruebams.model.ModelData;
import com.pruebams.model.TestClienteModel;
import com.pruebams.model.TestProductoModel;
import com.pruebams.model.TestFacturaModel;
import com.pruebams.model.TestFacturaDetalleModel;

@RestController
@RequestMapping(path = "/rest/dataPruebaMS")
public class RestData {
	TestClienteController testClienteController = new TestClienteController();
	TestProductoController testProductoController = new TestProductoController();
	TestFacturaController testFacturaController = new TestFacturaController();
	TestFacturaDetalleController testFacturaDetalleController = new TestFacturaDetalleController();
	
	@GetMapping(path = "/obtenerDatos", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ModelData getData(@RequestParam(name = "msg") String mensaje) {
		ModelData response = new ModelData();
		response.setCode(200);
		response.setMensaje("Mensaje Recibido >> "+mensaje);
		response.setEstado(true);
		return response;
	}
	
	@GetMapping(path = "/obtenerClientes", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<TestClienteModel> getClientes() throws FileNotFoundException, SQLException, IOException {
		List<TestClienteModel> listClientes = new ArrayList<TestClienteModel>();
		listClientes = testClienteController.getClientes();
		return listClientes;
	}
	
	@GetMapping(path = "/obtenerProductos", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<TestProductoModel> getProductos() throws FileNotFoundException, SQLException, IOException {
		List<TestProductoModel> listProductos = new ArrayList<TestProductoModel>();
		listProductos = testProductoController.getProductos();
		return listProductos;
	}
	
	@GetMapping(path = "/obtenerFacturas", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<TestFacturaModel> getFacturas() throws FileNotFoundException, SQLException, IOException {
		List<TestFacturaModel> listFacturas = new ArrayList<TestFacturaModel>();
		listFacturas = testFacturaController.getFacturas();
		return listFacturas;
	}
	
	@GetMapping(path = "/obtenerFacturasDetalle", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<TestFacturaDetalleModel> getFacturasDetalle() throws FileNotFoundException, SQLException, IOException {
		List<TestFacturaDetalleModel> listFacturasDetalle = new ArrayList<TestFacturaDetalleModel>();
		listFacturasDetalle = testFacturaDetalleController.getFacturasDetalle();
		return listFacturasDetalle;
	}
	
	@GetMapping(path = "/clienteByIdentificacion", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody TestClienteModel getClienteByIdentificacion(@RequestParam(name = "identificacion") String identificacion) throws FileNotFoundException, SQLException, IOException {
		TestClienteModel testClienteModel = new TestClienteModel();
		testClienteModel = testClienteController.getClienteByIdentificacion(identificacion);
		return testClienteModel;
	}
	
	@GetMapping(path = "/productoById", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody TestProductoModel getProductoByIdentificacion(@RequestParam(name = "idProducto") String idProducto) throws FileNotFoundException, SQLException, IOException {
		TestProductoModel testProductoModel = new TestProductoModel();
		testProductoModel = testProductoController.getProductoById(idProducto);
		return testProductoModel;
	}
	
	@GetMapping(path = "/productoByCodigo", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody TestProductoModel getProductoByCodigo(@RequestParam(name = "codigo") String codigo) throws FileNotFoundException, SQLException, IOException {
		TestProductoModel testProductoModel = new TestProductoModel();
		testProductoModel = testProductoController.getProductoByCodigo(codigo);
		return testProductoModel;
	}

}
