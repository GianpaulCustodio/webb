package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.expression.impl.ThisExpressionResolver;

import pe.edu.upc.entity.CBarco;
import pe.edu.upc.entity.CEspecie;
import pe.edu.upc.entity.CProducto;
import pe.edu.upc.entity.CProveedor;

import pe.edu.upc.service.IEspecieService;
import pe.edu.upc.service.IProductoService;
import pe.edu.upc.service.IProveedorService;


@Named
@RequestScoped
public class ProductoController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IProductoService pservice;
	
	@Inject
	private IEspecieService eservice;
	
	@Inject
	private IProveedorService oservice;
	
	
	
	private CProducto producto;
	private CEspecie especie;
	private CProveedor proveedor;
	
	private List<CProducto> listProducto;
	private List<CEspecie> listEspecie;
	private List<CProveedor> listProveedor;
	
	
	@PostConstruct
	public void init() {

		producto = new CProducto();
		especie = new CEspecie();
		proveedor = new CProveedor();

		listProducto = new ArrayList<>();
		listEspecie = new ArrayList<>();
		listProveedor = new ArrayList<>();
		
		
	this.listProductos();
	this.listEspecies();
	this.listProveedors();
	}

///////METODOS
	
	public String newCProducto() {
		this.setProducto(new CProducto());
		return "producto.xhtml";
	}
	
	public void insert() {
		try {
			pservice.Insertar(producto);
			cleanProducto();
			this.listProductos();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void eliminar(CProducto producto) {
		try {
			pservice.Eliminar(producto.getC_Producto());
			listProductos();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void listProductos() {
		try {
			listProducto = pservice.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void cleanProducto() {
		this.init();
	}
	public void listEspecies() {
		try {
			listEspecie = eservice.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void listProveedors() {
		try {
			listProveedor = oservice.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
/////GET AN SETTTT
	public IProductoService getPservice() {
		return pservice;
	}


	public void setPservice(IProductoService pservice) {
		this.pservice = pservice;
	}


	public IEspecieService getEservice() {
		return eservice;
	}


	public void setEservice(IEspecieService eservice) {
		this.eservice = eservice;
	}


	public IProveedorService getOservice() {
		return oservice;
	}


	public void setOservice(IProveedorService oservice) {
		this.oservice = oservice;
	}


	public CProducto getProducto() {
		return producto;
	}


	public void setProducto(CProducto producto) {
		this.producto = producto;
	}


	public CEspecie getEspecie() {
		return especie;
	}


	public void setEspecie(CEspecie especie) {
		this.especie = especie;
	}


	public CProveedor getProveedor() {
		return proveedor;
	}


	public void setProveedor(CProveedor proveedor) {
		this.proveedor = proveedor;
	}


	public List<CProducto> getListProducto() {
		return listProducto;
	}


	public void setListProducto(List<CProducto> listProducto) {
		this.listProducto = listProducto;
	}


	public List<CEspecie> getListEspecie() {
		return listEspecie;
	}


	public void setListEspecie(List<CEspecie> listEspecie) {
		this.listEspecie = listEspecie;
	}


	public List<CProveedor> getListProveedor() {
		return listProveedor;
	}


	public void setListProveedor(List<CProveedor> listProveedor) {
		this.listProveedor = listProveedor;
	}




}
