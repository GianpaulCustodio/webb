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
@Table(name = "Herramienta")
public class CHerramienta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int C_Herramienta;
	@Column(name = "N_Herramienta",nullable = false, length = 50)
	private String N_Herramienta;
	private Date D_Herramienta;
	private Boolean F_Eliminar;
	public CHerramienta( int c_Herramienta, String n_Herramienta, Date d_Herramienta,
			Boolean f_Eliminar) {
		super();
	
		C_Herramienta = c_Herramienta;
		N_Herramienta = n_Herramienta;
		D_Herramienta = d_Herramienta;
		F_Eliminar = f_Eliminar;
	}
	public CHerramienta() {
		super();
	}

	public int getC_Herramienta() {
		return C_Herramienta;
	}
	public void setC_Herramienta(int c_Herramienta) {
		C_Herramienta = c_Herramienta;
	}
	public String getN_Herramienta() {
		return N_Herramienta;
	}
	public void setN_Herramienta(String n_Herramienta) {
		N_Herramienta = n_Herramienta;
	}
	public Date getD_Herramienta() {
		return D_Herramienta;
	}
	public void setD_Herramienta(Date d_Herramienta) {
		D_Herramienta = d_Herramienta;
	}
	public Boolean getF_Eliminar() {
		return F_Eliminar;
	}
	public void setF_Eliminar(Boolean f_Eliminar) {
		F_Eliminar = f_Eliminar;
	}
	
}
