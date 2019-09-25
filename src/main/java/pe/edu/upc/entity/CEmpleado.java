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
	public int getID_Empleado() {
		return ID_Empleado;
	}
	public void setID_Empleado(int iD_Empleado) {
		ID_Empleado = iD_Empleado;
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
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Empleado;
	@Column(name = "C_Empleado", nullable = false, length = 45)
	private int C_Empleado;
	
	@ManyToOne
	@JoinColumn(name = "C_Puesto", nullable = false)
	private CPuesto cpuesto;
	@ManyToOne
	@JoinColumn(name = "C_Empresa", nullable = false)
	private CEmpresa cempresa;
	
	@Column(name = "N_Empleado", nullable = false, length = 45)
	private String N_Empleado;
	@Column(name = "D_Creacion", nullable = false, length = 45)
	private Date D_Creacion;
	@Column(name = "F_Eliminar", nullable = false, length = 45)
	private Boolean F_Eliminar;
	public CEmpleado(int c_Empleado, int id_Empleado, CPuesto _cpuesto, CEmpresa _cempresa, String n_Empleado, Date d_Creacion,
			Boolean f_Eliminar) {
		super();
		C_Empleado = c_Empleado;
		ID_Empleado = id_Empleado;
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
	public int getId_Empleado() {
		return ID_Empleado;
	}
	public void setId_Empleado(int id_Empleado) {
		ID_Empleado = id_Empleado;
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
	
}

