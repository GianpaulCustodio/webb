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
@Table(name = "Especie")
public class CEspecie implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int C_Especie;
	@Column(name = "N_Especie",nullable = false, length = 50)
	private String N_Especie;
	private Date D_Creacion;	
	private float Q_PesoPro;
	private Boolean F_Eliminar;
	public CEspecie(int iD_Especie, int c_Especie, String n_Especie, Date d_Creacion, float q_PesoPro,
			Boolean f_Eliminar) {
		super();
	
		C_Especie = c_Especie;
		N_Especie = n_Especie;
		D_Creacion = d_Creacion;
		Q_PesoPro = q_PesoPro;
		F_Eliminar = f_Eliminar;
	}
	public CEspecie() {
		super();
	}

	public int getC_Especie() {
		return C_Especie;
	}
	public void setC_Especie(int c_Especie) {
		C_Especie = c_Especie;
	}
	public String getN_Especie() {
		return N_Especie;
	}
	public void setN_Especie(String n_Especie) {
		N_Especie = n_Especie;
	}
	public Date getD_Creacion() {
		return D_Creacion;
	}
	public void setD_Creacion(Date d_Creacion) {
		D_Creacion = d_Creacion;
	}
	public float getQ_PesoPro() {
		return Q_PesoPro;
	}
	public void setQ_PesoPro(float q_PesoPro) {
		Q_PesoPro = q_PesoPro;
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
		result = prime * result + C_Especie;
		result = prime * result + ((D_Creacion == null) ? 0 : D_Creacion.hashCode());
		result = prime * result + ((F_Eliminar == null) ? 0 : F_Eliminar.hashCode());
		result = prime * result + ((N_Especie == null) ? 0 : N_Especie.hashCode());
		result = prime * result + Float.floatToIntBits(Q_PesoPro);
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
		CEspecie other = (CEspecie) obj;
		if (C_Especie != other.C_Especie)
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
		if (N_Especie == null) {
			if (other.N_Especie != null)
				return false;
		} else if (!N_Especie.equals(other.N_Especie))
			return false;
		if (Float.floatToIntBits(Q_PesoPro) != Float.floatToIntBits(other.Q_PesoPro))
			return false;
		return true;
	} 

	
}
