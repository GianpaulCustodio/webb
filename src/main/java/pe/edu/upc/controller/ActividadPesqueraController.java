package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.CActividadPesquera;
import pe.edu.upc.entity.CBarco;
import pe.edu.upc.entity.CClima;
import pe.edu.upc.entity.CEmpleado;
import pe.edu.upc.entity.CEmpresa;
import pe.edu.upc.entity.CPesca;
import pe.edu.upc.entity.CProducto;
import pe.edu.upc.entity.CPuesto;
import pe.edu.upc.entity.CTipoPesca;
import pe.edu.upc.service.IActividadPesqueraService;
import pe.edu.upc.service.IClimaService;
import pe.edu.upc.service.IEmpleadoService;
import pe.edu.upc.service.IProductoService;
import pe.edu.upc.service.ITipoPescaService;

@Named
@SessionScoped
public class ActividadPesqueraController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IActividadPesqueraService aS;
	@Inject
	private IBarcoService bS;
	@Inject
	private IClimaService cS;
	@Inject
	private ITipoPescaService tS;
	@Inject
	private IEmpleadoService eS;
	@Inject
	private IProductoService proS;
	
	private CActividadPesquera actividad;
	private CBarco barco;
	private CClima clima;
	private CTipoPesca tipopesca;
	private CProducto producto;
	
	private List<CActividadPesquera> listaactividad;
	private List<CBarco> listabarco;
	private List<CClima> listaclima;
	private List<CTipoPesca> listatipopesca;
	private List<CProducto> listaproducto;
	
	@PostConstruct
	public void init() {
		actividad = new CActividadPesquera();
		barco = new CBarco();
		clima = new CClima();
		tipopesca = new CTipoPesca();
		producto = new CProducto();
		listaactividad = new ArrayList<>();
		listabarco = new ArrayList<>();
		listaclima = new ArrayList<>();
		listatipopesca = new ArrayList<>();
		listaproducto = new ArrayList<>();
		this.ListaActividades();
		this.ListarBarcos();
		this.ListarClimas();
		this.ListarTiposPesca();
		this.ListarProductos();
	}
	public String newCActividad() {
		this.setActividad(new CActividadPesquera());
		return "actividadpesquera.xhtml";
	}
	public void insert() {
		try {

			aS.insertar(actividad);
			Limpiar();
			this.ListaActividades();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void ListaActividades() {
		try {
			listaactividad = aS.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void Eliminar(CActividadPesquera acti) {
		try {
			aS.eliminar(acti.getC_Actividad());
			ListaActividades();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void ListarBarcos() {
		try {
			listabarco = bS.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void ListarClimas() {
		try {
			listaclima = cS.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void ListarTiposPesca() {
		try {
			listatipopesca = tS.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void ListarProductos() {
		try {
			listaproducto = proS.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	
	
	
	public void Limpiar() {
		this.init();
	}
	
	public CActividadPesquera getActividad() {
		return actividad;
	}

	public void setActividad(CActividadPesquera actividad) {
		this.actividad = actividad;
	}

	public CBarco getBarco() {
		return barco;
	}

	public void setBarco(CBarco barco) {
		this.barco = barco;
	}

	public CClima getClima() {
		return clima;
	}

	public void setClima(CClima clima) {
		this.clima = clima;
	}

	public CTipoPesca getTipopesca() {
		return tipopesca;
	}

	public void setTipopesca(CTipoPesca tipopesca) {
		this.tipopesca = tipopesca;
	}

	public CProducto getProducto() {
		return producto;
	}

	public void setProducto(CProducto producto) {
		this.producto = producto;
	}

	public List<CActividadPesquera> getListaactividad() {
		return listaactividad;
	}

	public void setListaactividad(List<CActividadPesquera> listaactividad) {
		this.listaactividad = listaactividad;
	}

	public List<CBarco> getListabarco() {
		return listabarco;
	}

	public void setListabarco(List<CBarco> listabarco) {
		this.listabarco = listabarco;
	}

	public List<CClima> getListaclima() {
		return listaclima;
	}

	public void setListaclima(List<CClima> listaclima) {
		this.listaclima = listaclima;
	}

	public List<CTipoPesca> getListatipopesca() {
		return listatipopesca;
	}

	public void setListatipopesca(List<CTipoPesca> listatipopesca) {
		this.listatipopesca = listatipopesca;
	}

	public List<CProducto> getListaproducto() {
		return listaproducto;
	}

	public void setListaproducto(List<CProducto> listaproducto) {
		this.listaproducto = listaproducto;
	}

}
