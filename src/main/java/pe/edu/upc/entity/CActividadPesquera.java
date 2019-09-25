package pe.edu.upc.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CActividadPesquera  implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Actividad;
	private int ID_Barco;
	private int ID_Clima;
	private int ID_TipoPesca;
	private int ID_Empleado;
	private int C_Actividad;
	private String N_Actividad;
	private Date D_Creacion;
	private Boolean F_Eliminar;
	public CActividadPesquera(int iD_Actividad, int iD_Barco, int iD_Clima, int iD_TipoPesca, int iD_Empleado,
			int c_Actividad, String n_Actividad, Date d_Creacion, Boolean f_Eliminar) {
		super();
		ID_Actividad = iD_Actividad;
		ID_Barco = iD_Barco;
		ID_Clima = iD_Clima;
		ID_TipoPesca = iD_TipoPesca;
		ID_Empleado = iD_Empleado;
		C_Actividad = c_Actividad;
		N_Actividad = n_Actividad;
		D_Creacion = d_Creacion;
		F_Eliminar = f_Eliminar;
	}
	public CActividadPesquera() {
		super();
	}
	public int getID_Actividad() {
		return ID_Actividad;
	}
	public void setID_Actividad(int iD_Actividad) {
		ID_Actividad = iD_Actividad;
	}
	public int getID_Barco() {
		return ID_Barco;
	}
	public void setID_Barco(int iD_Barco) {
		ID_Barco = iD_Barco;
	}
	public int getID_Clima() {
		return ID_Clima;
	}
	public void setID_Clima(int iD_Clima) {
		ID_Clima = iD_Clima;
	}
	public int getID_TipoPesca() {
		return ID_TipoPesca;
	}
	public void setID_TipoPesca(int iD_TipoPesca) {
		ID_TipoPesca = iD_TipoPesca;
	}
	public int getID_Empleado() {
		return ID_Empleado;
	}
	public void setID_Empleado(int iD_Empleado) {
		ID_Empleado = iD_Empleado;
	}
	public int getC_Actividad() {
		return C_Actividad;
	}
	public void setC_Actividad(int c_Actividad) {
		C_Actividad = c_Actividad;
	}
	public String getN_Actividad() {
		return N_Actividad;
	}
	public void setN_Actividad(String n_Actividad) {
		N_Actividad = n_Actividad;
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
