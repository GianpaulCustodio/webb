package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.CEmpleado;
import pe.edu.upc.entity.CEmpresa;
import pe.edu.upc.entity.CProveedor;
import pe.edu.upc.entity.CPuesto;
import pe.edu.upc.service.IEmpleadoService;
import pe.edu.upc.service.IEmpresaService;
import pe.edu.upc.service.IPuestoService;

@Named
@SessionScoped
public class EmpleadoController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private IEmpleadoService eS;
	@Inject
	private IPuestoService pS;
	@Inject
	private IEmpresaService erS;
	private CEmpleado empleado;
	private CPuesto puesto;
	private CEmpresa empresa;
	private List<CEmpleado> listaempleado;
	private List<CPuesto> listapuesto;
	private List<CEmpresa> listaempresa;

	@PostConstruct
	public void init() {
		puesto = new CPuesto();
		empresa = new CEmpresa();
		empleado = new CEmpleado();
		listaempleado = new ArrayList<>();
		listapuesto = new ArrayList<>();
		listaempresa = new ArrayList<>();
		this.ListarEmpresas();
		this.ListarPuestos();
		this.ListarEmpleados();
	}

	public String NuevoEmpleado() {
		this.setEmpleado(new CEmpleado());
		return "Empleado.xhtml";
	}

	public void limpiarEmpleado() {
		this.init();
	}

	public void insertar() {
		try {
			this.empleado.setF_Eliminar(Boolean.TRUE);
			eS.insertar(empleado);
			limpiarEmpleado();

			this.ListarEmpleados();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void eliminar(CEmpleado emp) {
		try {
			eS.eliminar(emp.getC_Empleado());
			ListarEmpleados();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void ListarEmpleados() {
		try {
			listaempleado = eS.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void ListarEmpresas() {
		try {
			listaempresa = erS.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void ListarPuestos() {
		try {
			listapuesto = pS.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public String Estado()
	{
		if (this.empleado.getF_Eliminar()==Boolean.TRUE) {
			return "Activo";
		} else {

		} return "Inactivo";	
	}
	
	
	public CEmpleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(CEmpleado empleado) {
		this.empleado = empleado;
	}

	public CPuesto getPuesto() {
		return puesto;
	}

	public void setPuesto(CPuesto puesto) {
		this.puesto = puesto;
	}

	public CEmpresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(CEmpresa empresa) {
		this.empresa = empresa;
	}

	public List<CEmpleado> getListaempleado() {
		return listaempleado;
	}

	public void setListaempleado(List<CEmpleado> listaempleado) {
		this.listaempleado = listaempleado;
	}

	public List<CPuesto> getListapuesto() {
		return listapuesto;
	}

	public void setListapuesto(List<CPuesto> listapuesto) {
		this.listapuesto = listapuesto;
	}

	public List<CEmpresa> getListaempresa() {
		return listaempresa;
	}

	public void setListaempresa(List<CEmpresa> listaempresa) {
		this.listaempresa = listaempresa;
	}
}
