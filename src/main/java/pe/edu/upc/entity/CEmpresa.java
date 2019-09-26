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




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + C_Empresa;
		result = prime * result + ((D_Creacion == null) ? 0 : D_Creacion.hashCode());
		result = prime * result + ((F_Eliminar == null) ? 0 : F_Eliminar.hashCode());
		result = prime * result + ((N_Empresa == null) ? 0 : N_Empresa.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CEmpresa other = (CEmpresa) obj;
		if (C_Empresa != other.C_Empresa)
			return false;
		if (D_Creacion == null) {
			if (other.D_Creacion != null)
				return false;
		} else if (!D_Creacion.equals(other.D_Creacion))
			return false;
		if (F_Eliminar == null) {
			if (other.F_Eliminar != null)
				return false;
		} else if (!F_Eliminar.equals(other.F_Eliminar))
			return false;
		if (N_Empresa == null) {
			if (other.N_Empresa != null)
				return false;
		} else if (!N_Empresa.equals(other.N_Empresa))
			return false;
		return true;
	}
	
	
}
