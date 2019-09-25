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
@Table (name = "Clima" )
public class CClima implements Serializable  {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int C_Clima;
	@Column(name = "N_Clima",nullable = false, length = 50)
	private String N_Clima;
	@Column(name = "T_Clima",nullable = false, length = 50)
	private int T_Clima;
	
	private Date D_Creacion;
	private Boolean F_Eliminar;
	public CClima(int c_Clima, String n_Clima, Date d_Creacion, Boolean f_Eliminar, int t_Clima) {
		super();
		
		C_Clima = c_Clima;
		N_Clima = n_Clima;
		T_Clima = t_Clima;
		D_Creacion = d_Creacion;
		F_Eliminar = f_Eliminar;
	}
	public CClima() {
		super();
	}

	
	
	public int getC_Clima() {
		return C_Clima;
	}
	public void setC_Clima(int c_Clima) {
		C_Clima = c_Clima;
	}
	public int getT_Clima() {
		return C_Clima;
	}
	public void setT_Clima(int t_Clima) {
		T_Clima = t_Clima;
	}
	public String getN_Clima() {
		return N_Clima;
	}
	public void setN_Clima(String n_Clima) {
		N_Clima = n_Clima;
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
