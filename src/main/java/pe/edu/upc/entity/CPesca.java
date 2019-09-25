package pe.edu.upc.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Pesca")

public class CPesca implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CPesca;

	@ManyToOne
	@JoinColumn(name = "C_Empleado", nullable = false)
	private CEmpleado empleado;

	@ManyToOne
	@JoinColumn(name = "C_Actividad", nullable = false)
	private CActividadPesquera actividad;

	@ManyToOne
	@JoinColumn(name = "C_Especie", nullable = false)
	private CEspecie especie;

	@ManyToOne
	@JoinColumn(name = "C_Herramienta", nullable = false)
	private CHerramienta herramienta;

	public CPesca(CEmpleado empleado, CActividadPesquera actividad, CEspecie especie, CHerramienta herramienta) {
		super();
		this.empleado = empleado;
		this.actividad = actividad;
		this.especie = especie;
		this.herramienta = herramienta;
	}

	public CPesca() {
		super();
	}

	public CEmpleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(CEmpleado empleado) {
		this.empleado = empleado;
	}

	public CActividadPesquera getActividad() {
		return actividad;
	}

	public void setActividad(CActividadPesquera actividad) {
		this.actividad = actividad;
	}

	public CEspecie getEspecie() {
		return especie;
	}

	public void setEspecie(CEspecie especie) {
		this.especie = especie;
	}

	public CHerramienta getHerramienta() {
		return herramienta;
	}

	public void setHerramienta(CHerramienta herramienta) {
		this.herramienta = herramienta;
	}

}
