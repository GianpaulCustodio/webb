package pe.edu.upc.entity;

import java.io.Serializable

;
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
@Table(name = "Barco")
public class CBarco implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int C_Barco;
	
	@Column(name = "N_Barco",nullable = false , length = 50)
	private String N_Barco;
	
	@ManyToOne
	@JoinColumn(name = "C_Puerto", nullable = false)
	private CPuerto puerto;
	
	@ManyToOne
	@JoinColumn(name = "C_Empresa", nullable = false)
	private CEmpresa empresa;
	
	
	private Date D_Creacion;
	private Boolean F_Eliminar;
	public CBarco( int c_Barco, String n_Barco, CPuerto puerto,CEmpresa empresa,Date d_Creacion,
			Boolean f_Eliminar) {
		super();
		
		this.C_Barco = c_Barco;
		this.N_Barco = n_Barco;
		this.empresa = empresa;
		this.puerto = puerto;
		this.D_Creacion = d_Creacion;
		this.F_Eliminar = f_Eliminar;
	}
	public int getC_Barco() {
		return C_Barco;
	}
	public CBarco() {
		super();
		
	}
	public void setC_Barco(int c_Barco) {
		C_Barco = c_Barco;
	}
	public String getN_Barco() {
		return N_Barco;
	}
	public void setN_Barco(String n_Barco) {
		N_Barco = n_Barco;
	}
	public CPuerto getPuerto() {
		return puerto;
	}
	public void setPuerto(CPuerto puerto) {
		this.puerto = puerto;
	}
	public CEmpresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(CEmpresa empresa) {
		this.empresa = empresa;
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
		result = prime * result + C_Barco;
		result = prime * result + ((D_Creacion == null) ? 0 : D_Creacion.hashCode());
		result = prime * result + ((F_Eliminar == null) ? 0 : F_Eliminar.hashCode());
		result = prime * result + ((N_Barco == null) ? 0 : N_Barco.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + ((puerto == null) ? 0 : puerto.hashCode());
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
		CBarco other = (CBarco) obj;
		if (C_Barco != other.C_Barco)
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
		if (N_Barco == null) {
			if (other.N_Barco != null)
				return false;
		} else if (!N_Barco.equals(other.N_Barco))
			return false;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		if (puerto == null) {
			if (other.puerto != null)
				return false;
		} else if (!puerto.equals(other.puerto))
			return false;
		return true;
	}
	
}
	
	


