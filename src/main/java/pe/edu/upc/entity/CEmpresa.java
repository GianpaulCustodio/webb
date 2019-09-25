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
@Table (name = "Empresa")
public class CEmpresa implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int C_Empresa;
	@Column(name = "N_Empresa",nullable = false, length = 50)
	private String N_Empresa;
	private Date D_Creacion;
	private Boolean F_Eliminar;
	public CEmpresa( int c_Empresa, String n_Empresa, Date d_Creacion, Boolean f_Eliminar) {
		super();
		
		C_Empresa = c_Empresa;
		N_Empresa = n_Empresa;
		D_Creacion = d_Creacion;
		F_Eliminar = f_Eliminar;
	}
	
	
	
	
	public CEmpresa() {
		super();
	}





	public int getC_Empresa() {
		return C_Empresa;
	}
	public void setC_Empresa(int c_Empresa) {
		C_Empresa = c_Empresa;
	}
	public String getN_Empresa() {
		return N_Empresa;
	}
	public void setN_Empresa(String n_Empresa) {
		N_Empresa = n_Empresa;
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
