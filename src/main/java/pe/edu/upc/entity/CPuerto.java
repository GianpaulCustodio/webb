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
@Table(name = "Puerto")
public class CPuerto implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int C_Puerto;
	@Column(name = "N_Puerto", nullable = false, length = 50)
	private String N_Puerto;
	private Date D_Creacion;
	private Boolean F_Eliminar;
	
	public CPuerto(int iD_Puerto, int c_Puerto, String n_Puerto, Date d_Creacion, Boolean f_Eliminar) {
		super();

		C_Puerto = c_Puerto;
		N_Puerto = n_Puerto;
		D_Creacion = d_Creacion;
		F_Eliminar = f_Eliminar;
	}
	
	public CPuerto() {
		super();
	}

	public int getC_Puerto() {
		return C_Puerto;
	}
	public void setC_Puerto(int c_Puerto) {
		C_Puerto = c_Puerto;
	}
	public String getN_Puerto() {
		return N_Puerto;
	}
	public void setN_Puerto(String n_Puerto) {
		N_Puerto = n_Puerto;
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
		result = prime * result + C_Puerto;
		result = prime * result + ((D_Creacion == null) ? 0 : D_Creacion.hashCode());
		result = prime * result + ((F_Eliminar == null) ? 0 : F_Eliminar.hashCode());
		result = prime * result + ((N_Puerto == null) ? 0 : N_Puerto.hashCode());
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
		CPuerto other = (CPuerto) obj;
		if (C_Puerto != other.C_Puerto)
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
		if (N_Puerto == null) {
			if (other.N_Puerto != null)
				return false;
		} else if (!N_Puerto.equals(other.N_Puerto))
			return false;
		return true;
	}



}
