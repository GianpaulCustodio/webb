package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ActividadPesquera")
public class CActividadPesquera implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int C_Actividad;
	
	@ManyToOne
	@JoinColumn(name = "C_Barco", nullable = false)
	private CBarco C_Barco;
	@ManyToOne
	@JoinColumn(name = "C_Clima", nullable = false)
	private CClima C_Clima;
	@ManyToOne
	@JoinColumn(name = "C_TipoPesca", nullable = false)
	private CTipoPesca C_TipoPesca;
	@ManyToOne
	@JoinColumn(name = "C_Empleado", nullable = false)
	private CEmpleado C_Empleado;
	@ManyToOne
	@JoinColumn(name = "C_Producto", nullable = false)
	private CProducto C_Producto;
	
	@Column(name = "Q_PesoPesca", nullable = false, length = 50)
	private int Q_PesoPesca;
	@Column(name = "F_Vacio", nullable = false, length = 50)
	private Boolean F_Vacio;
	@Column(name = "D_Pesca", nullable = false, length = 50)
	private Date D_Pesca;
	@Column(name = "D_Creacion", nullable = false, length = 50)
	private Date D_Creacion;
	@Column(name = "F_Eliminar", nullable = false, length = 50)
	private Boolean F_Eliminar;
	
	
	public CActividadPesquera(int c_Actividad, CBarco c_Barco, CClima c_Clima, CTipoPesca c_TipoPesca,
			CEmpleado c_Empleado, CProducto c_Producto, int q_PesoPesca, Boolean f_Vacio, Date d_Pesca, Date d_Creacion,
			Boolean f_Eliminar) {
		super();
		C_Actividad = c_Actividad;
		C_Barco = c_Barco;
		C_Clima = c_Clima;
		C_TipoPesca = c_TipoPesca;
		C_Empleado = c_Empleado;
		C_Producto = c_Producto;
		Q_PesoPesca = q_PesoPesca;
		F_Vacio = f_Vacio;
		D_Pesca = d_Pesca;
		D_Creacion = d_Creacion;
		F_Eliminar = f_Eliminar;
	}
	
	public CActividadPesquera() {
		super();
	}
	public int getC_Actividad() {
		return C_Actividad;
	}
	public void setC_Actividad(int c_Actividad) {
		C_Actividad = c_Actividad;
	}
	
	public int getQ_PesoPesca() {
		return Q_PesoPesca;
	}
	public void setQ_PesoPesca(int q_PesoPesca) {
		Q_PesoPesca = q_PesoPesca;
	}
	public Boolean getF_Vacio() {
		return F_Vacio;
	}
	public void setF_Vacio(Boolean f_Vacio) {
		F_Vacio = f_Vacio;
	}
	public Date getD_Pesca() {
		return D_Pesca;
	}
	public void setD_Pesca(Date d_Pesca) {
		D_Pesca = d_Pesca;
	}
	public Date getD_Creacion() {
		return D_Creacion;
	}
	public void setD_Creacion(Date d_Creacion) {
		D_Creacion = d_Creacion;
	}
	public Boolean getF_Eliminar() {
		return F_Eliminar;
	}
	public void setF_Eliminar(Boolean f_Eliminar) {
		F_Eliminar = f_Eliminar;
	}
	
	public CBarco getC_Barco() {
		return C_Barco;
	}

	public void setC_Barco(CBarco c_Barco) {
		C_Barco = c_Barco;
	}

	public CClima getC_Clima() {
		return C_Clima;
	}

	public void setC_Clima(CClima c_Clima) {
		C_Clima = c_Clima;
	}

	public CTipoPesca getC_TipoPesca() {
		return C_TipoPesca;
	}

	public void setC_TipoPesca(CTipoPesca c_TipoPesca) {
		C_TipoPesca = c_TipoPesca;
	}

	public CEmpleado getC_Empleado() {
		return C_Empleado;
	}

	public void setC_Empleado(CEmpleado c_Empleado) {
		C_Empleado = c_Empleado;
	}

	public CProducto getC_Producto() {
		return C_Producto;
	}

	public void setC_Producto(CProducto c_Producto) {
		C_Producto = c_Producto;
	}
	
}
