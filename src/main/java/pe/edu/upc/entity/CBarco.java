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
	@JoinColumn(name = "N_Puerto", nullable = false)
	private CPuerto puerto;
	
	@ManyToOne
	@JoinColumn(name = "N_Empresa", nullable = false)
	private CEmpresa empresa;
	
	
	private Date D_Creacion;
	private Boolean F_Eliminar;
	public CBarco( int c_Barco, String n_Barco, CPuerto puerto,CEmpresa empresa,Date d_Creacion,
			Boolean f_Eliminar) {
		super();
		
		C_Barco = c_Barco;
		N_Barco = n_Barco;
		this.empresa = empresa;
		this.puerto = puerto;
		D_Creacion = d_Creacion;
		F_Eliminar = f_Eliminar;
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
}
	
	


