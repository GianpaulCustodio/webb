package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Proveedor")
public class CProveedor implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int C_Proveedor;
	
	@Column(name = "N_Proveedor", nullable = false, length = 50)
	private String N_Proveedor;
	@Column(name = "D_Creacion", nullable = false, length = 50)
	private Date D_Creacion;
	@Column(name = "F_Eliminar", nullable = false, length = 50)
	private Boolean F_Eliminar;

	public CProveedor(int iD_Proveedor, int c_Proveedor, String n_Proveedor, Date d_Creacion, Boolean f_Eliminar) {
		super();
	
		C_Proveedor = c_Proveedor;
		N_Proveedor = n_Proveedor;
		D_Creacion = d_Creacion;
		F_Eliminar = Boolean.TRUE;
	}
	public CProveedor() {
		super();
	}

	public int getC_Proveedor() {
		return C_Proveedor;
	}
	public void setC_Proveedor(int c_Proveedor) {
		C_Proveedor = c_Proveedor;
	}
	public String getN_Proveedor() {
		return N_Proveedor;
	}
	public void setN_Proveedor(String n_Proveedor) {
		N_Proveedor = n_Proveedor;
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
	
	
}


