package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.CEspecie;
import pe.edu.upc.entity.CHerramienta;
import pe.edu.upc.entity.CEmpleado;
import pe.edu.upc.entity.CActividadPesquera;
import pe.edu.upc.entity.CPesca;

import pe.edu.upc.service.IEspecieService;
import pe.edu.upc.service.IPescaService;
import pe.edu.upc.service.IHerramientaService;
import pe.edu.upc.service.IEmpleadoService;
import pe.edu.upc.service.IActividadPesqueraService;


@Named
@SessionScoped
public class PescaController implements Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IEspecieService eS;
	@Inject
	private IPescaService pS;
	@Inject
	private IHerramientaService hS;
	@Inject
	private IEmpleadoService emS;
	@Inject
	private IActividadPesquera apS;
	
	
	
	private CEspecie especie;
	private CPesca pesca;
	private CHerramienta herramienta;
	private CEmpleado empleado;
	private CActividadPesquera actividadpesquera;
	
	private List<CEspecie> listEspecies;
	private List<CPesca> listPescas;
	private List<CHerramienta> listHerramientas;
	private List<CEmpleado> listEmpleados;
	private List<CActividadPesquera> listActividadesPesqueras;

	@PostConstruct
	public void init() {
		especie = new CEspecie();
		pesca = new CPesca();
		herramienta = new CHerramienta();
		empleado = new CEmpleado();
		actividadpesquera = new CActividadPesquera();
		
		
		 listEspecies = new ArrayList<>();
		 listPescas = new ArrayList<>();
		listHerramientas = new ArrayList<>();
		 listEmpleados = new ArrayList<>();
		 listActividadesPesqueras = new ArrayList<>();
	
		
		this.listEspecie();
		this.listPesca();
		this.listHerramienta();
		this.listEmpleado();
		this.listActividadesPesqueras();
	}

	// metodos
	public String newCPesca() {
		this.setPesca(new CPesca());
		return "pesca.xhtml";
	}

	public void insert() {
		try {

			pS.insert(pesca);
			cleanPesca();
			this.listPesca();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void delete(CPesca pesca) {
		try {
			pS.delete(pesca.getCPesca());
			listPesca();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listPesca() {
		try {
			listPescas = pS.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void cleanPesca() {
		this.init();
	}
	
	public void listEspecie() {
		try {
			listEspecies = eS.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void listHerramienta() {
		try {
			listHerramientas = hS.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listActividadesPesqueras() {
		try {
			listActividadesPesqueras = apS.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void listEmpleado() {
		try {
			listEmpleados = emS.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	

	//get y set

	public CEspecie getEspecie() {
		return especie;
	}

	public void setEspecie(CEspecie especie) {
		this.especie = especie;
	}

	public CPesca getPesca() {
		return pesca;
	}

	public void setPesca(CPesca pesca) {
		this.pesca = pesca;
	}

	public CHerramienta getHerramienta() {
		return herramienta;
	}

	public void setHerramienta(CHerramienta herramienta) {
		this.herramienta = herramienta;
	}

	public CEmpleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(CEmpleado empleado) {
		this.empleado = empleado;
	}

	public CActividadPesquera getActividadpesquera() {
		return actividadpesquera;
	}

	public void setActividadpesquera(CActividadPesquera actividadpesquera) {
		this.actividadpesquera = actividadpesquera;
	}

	public List<CEspecie> getListEspecies() {
		return listEspecies;
	}

	public void setListEspecies(List<CEspecie> listEspecies) {
		this.listEspecies = listEspecies;
	}

	public List<CPesca> getListPescas() {
		return listPescas;
	}

	public void setListPescas(List<CPesca> listPescas) {
		this.listPescas = listPescas;
	}

	public List<CHerramienta> getListHerramientas() {
		return listHerramientas;
	}

	public void setListHerramientas(List<CHerramienta> listHerramientas) {
		this.listHerramientas = listHerramientas;
	}

	public List<CEmpleado> getListEmpleados() {
		return listEmpleados;
	}

	public void setListEmpleados(List<CEmpleado> listEmpleados) {
		this.listEmpleados = listEmpleados;
	}

	public List<CActividadPesquera> getListActividadesPesqueras() {
		return listActividadesPesqueras;
	}

	public void setListActividadesPesqueras(List<CActividadPesquera> listActividadesPesqueras) {
		this.listActividadesPesqueras = listActividadesPesqueras;
	}


}
