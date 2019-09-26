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
@Table(name = "Producto")
public class CProducto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int C_Producto;
	
	@ManyToOne
	@JoinColumn(name = "C_Especie", nullable = false)
	private CEspecie C_Especie;
	@ManyToOne
	@JoinColumn(name = "C_Proveedor", nullable = false)
	private CProveedor C_Proveedor;
	@Column(name = "N_Producto", nullable = false, length = 80)
	private String N_Producto;


	private Date D_Creacion;
	private Boolean F_Eliminar;
	
	public CProducto(int c_Producto, String n_Producto, Date d_Creacion, Boolean f_Eliminar,CEspecie _especie, CProveedor _cproveedor) {
		super();
		C_Producto = c_Producto;
		N_Producto = n_Producto;
		D_Creacion = d_Creacion;
		F_Eliminar = f_Eliminar;
		C_Especie = _especie;
		C_Proveedor = _cproveedor;
	}
	public CProducto() {
		super();
	}
	
	public int getC_Producto() {
		return C_Producto;
	}
	public void setC_Producto(int c_Producto) {
		C_Producto = c_Producto;
	}
	public String getN_Producto() {
		return N_Producto;
	}
	public void setN_Producto(String n_Producto) {
		N_Producto = n_Producto;
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
	public CEspecie getC_Especie() {
		return C_Especie;
	}
	public void setC_Especie(CEspecie c_Especie) {
		C_Especie = c_Especie;
	}
	public CProveedor getC_Proveedor() {
		return C_Proveedor;
	}
	public void setC_Proveedor(CProveedor c_Proveedor) {
		C_Proveedor = c_Proveedor;
	}
	
}
