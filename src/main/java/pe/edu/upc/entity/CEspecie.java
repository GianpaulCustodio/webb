package pe.edu.upc.entity;

import java.util.Date;

public class CEspecie {

	
	
	
	private int C_Especie;
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

	
}
