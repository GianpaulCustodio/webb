package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import pe.edu.upc.entity.CEmpresa;
import pe.edu.upc.service.IEmpresaService;


@Named
@RequestScoped
public class EmpresaController implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IEmpresaService es;
    private CEmpresa empresa;
	List<CEmpresa> listaEmpresas;
	
	@PostConstruct
	public void init() {
		this.listaEmpresas = new ArrayList<CEmpresa>();
		this.empresa = new CEmpresa();
		this.listar();
		
	}
	
	//GET andd SET
	

	public CEmpresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(CEmpresa empresa) {
		this.empresa = empresa;
	}

	public List<CEmpresa> getListaEmpresas() {
		return listaEmpresas;
	}

	public void setListaEmpresas(List<CEmpresa> listaEmpresas) {
		this.listaEmpresas = listaEmpresas;
	}
     //METODOS 
	public String NuevoEmpresa() {
		this.setEmpresa(new CEmpresa());
		return "empresa.xhtml";
		}
	public void listar() {
		try {
			listaEmpresas = es.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void limpiarEmpresa() {
		this.init();
	}
	public void insertar() {
		try {

			es.insertar(empresa);
			limpiarEmpresa();

			this.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	@Transactional
	public void eliminar(CEmpresa mo) {
		try {
			es.eliminar(mo.getC_Empresa());
			listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	
	

}
