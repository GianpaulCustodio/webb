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
@Table(name = "Empleado")
public class CEmpleado implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int C_Empleado;
	
	@ManyToOne
	@JoinColumn(name = "C_Puesto", nullable = false)
	private CPuesto cpuesto;
	@ManyToOne
	@JoinColumn(name = "C_Empresa", nullable = false)
	private CEmpresa cempresa;
	
	@Column(name = "C_Contraseņa", nullable = false, length = 80)
	private String C_contraseņa;	
	@Column(name = "N_Empleado", nullable = false, length = 45)
	private String N_Empleado;
	@Column(name = "D_Creacion", nullable = false, length = 45)
	private Date D_Creacion;
	@Column(name = "F_Eliminar", nullable = false, length = 45)
	private Boolean F_Eliminar;
	@Column(name = "state", nullable = false, length = 1)
	private String state;
	public CEmpleado(int c_Empleado, CPuesto _cpuesto, CEmpresa _cempresa, String n_Empleado, Date d_Creacion,
			Boolean f_Eliminar) {
		super();
		C_Empleado = c_Empleado;
		cpuesto = _cpuesto;
		cempresa = _cempresa;
		N_Empleado = n_Empleado;
		D_Creacion = d_Creacion;
		F_Eliminar = f_Eliminar;
	}
	public CEmpleado() {
		super();
	}
	public int getC_Empleado() {
		return C_Empleado;
	}
	public void setC_Empleado(int c_Empleado) {
		C_Empleado = c_Empleado;
	}
	public String getN_Empleado() {
		return N_Empleado;
	}
	public void setN_Empleado(String n_Empleado) {
		N_Empleado = n_Empleado;
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
	public CPuesto getCpuesto() {
		return cpuesto;
	}
	public void setCpuesto(CPuesto cpuesto) {
		this.cpuesto = cpuesto;
	}
	public CEmpresa getCempresa() {
		return cempresa;
	}
	public void setCempresa(CEmpresa cempresa) {
		this.cempresa = cempresa;
	}
	public String getC_contraseņa() {
		return C_contraseņa;
	}
	public void setC_contraseņa(String c_contraseņa) {
		C_contraseņa = c_contraseņa;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}

