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
@Table(name ="Puesto")
public class CPuesto implements Serializable 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int C_Puesto;
	
	@Column(name = "N_Puesto",nullable =false, length = 50) 
	private String N_Puesto;
	@Column(name = "D_Creacion",nullable =false, length = 50) 
	private Date D_Creacion;
	@Column(name = "F_Eliminar",nullable =false, length = 50) 
	private Boolean F_Eliminar;
	public CPuesto(int iD_Puesto, int c_Puesto, String n_Puesto, Date d_Creacion, Boolean f_Eliminar) {
		super();
		C_Puesto = c_Puesto;
		N_Puesto = n_Puesto;
		D_Creacion = d_Creacion;
		F_Eliminar = f_Eliminar;
	}
	public CPuesto() {
		super();
	}

	public int getC_Puesto() {
		return C_Puesto;
	}
	public void setC_Puesto(int c_Puesto) {
		C_Puesto = c_Puesto;
	}
	public String getN_Puesto() {
		return N_Puesto;
	}
	public void setN_Puesto(String n_Puesto) {
		N_Puesto = n_Puesto;
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
