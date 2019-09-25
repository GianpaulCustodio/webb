package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.CProveedor;
import pe.edu.upc.service.IProveedorService;
@Named
@RequestScoped
public class ProveedorController implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Inject
	private IProveedorService pService;
	private CProveedor provee;

	List<CProveedor> listaProveedores;

	@PostConstruct
	public void init() {
		this.listaProveedores = new ArrayList<CProveedor>();
		this.provee = new CProveedor();
		this.listar();
	}
	
	// metodos
	public String nuevoProveedor() {
		this.setProveedor(new CProveedor());
		return "proveedor.xhtml";
	}
	
	public String Modificar() {
		this.setProveedor(new CProveedor());
		return "modificarproveedor.xhtml";
	}
	
	public void insertar() {
		try {
			this.provee.setF_Eliminar(Boolean.TRUE);
			pService.insertar(provee);
			limpiarProveedor();

			this.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	/*public void modificar_update( ) {
		for (CProveedor cProveedor : listaProveedores) {
			if (cProveedor.getC_Proveedor()==provee.getCod_guardar()) 
			{
				cProveedor.setN_Proveedor(provee.getN_Proveedor());
				cProveedor.setD_Creacion(provee.getD_Creacion());
				cProveedor.setF_Eliminar(provee.getF_Eliminar());
			}
			
		}
		limpiarProveedor();
		this.listar();
	}*/
	
	public String Estado_Buscar(int cod)
	{
		for (CProveedor cProveedor : listaProveedores) {
			if (cProveedor.getC_Proveedor()==cod) {
				if (cProveedor.getF_Eliminar()==Boolean.TRUE) {
					return "Activo";
				}
				if (cProveedor.getF_Eliminar()==Boolean.FALSE) {
					return "Inactivo";
				}
			}
		}
		return "";
	}
	public String Estado()
	{
		if (this.provee.getF_Eliminar()==Boolean.TRUE) {
			return "Activo";
		} else {

		} return "Inactivo";	
	}
	public void listar() {
		try {
			listaProveedores = pService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void limpiarProveedor() {
		this.init();
	}
	public void eliminar(CProveedor po) {
		try {
			pService.eliminar(po.getC_Proveedor());
			listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// get y set
	public CProveedor getProveedor() {
		return provee;
	}

	public void setProveedor(CProveedor proveedor) {
		this.provee = proveedor;
	}

	public List<CProveedor> getListaMotores() {
		return listaProveedores;
	}

	public void setListaMotores(List<CProveedor> listaProveedores) {
		this.listaProveedores = listaProveedores;
	}
}
