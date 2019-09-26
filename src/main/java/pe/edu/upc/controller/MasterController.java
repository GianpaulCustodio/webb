package pe.edu.upc.controller;


import java.io.Serializable;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.User;
import pe.edu.upc.entity.UserRol;
import pe.edu.upc.service.IRolService;

@Named
@ViewScoped
public class MasterController implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IRolService rS;

	public void verificarSesion() {
		try {
			FacesContext context = FacesContext.getCurrentInstance();
			User us = (User) context.getExternalContext().getSessionMap().get("user");
			
			if(us == null) {
				context.getExternalContext().redirect("Login.xhtml");
			}else {
				//verificacion de roles
				String viewId = context.getViewRoot().getViewId();
				boolean rpta = this.verificarMenu(viewId);
				
				if(!rpta) {
					context.getExternalContext().redirect("./403.xhtml");
				}
			}			
		} catch (Exception e) {

		}
	}
	
	public boolean verificarMenu(String viewId) throws Exception {
		FacesContext context = FacesContext.getCurrentInstance();
		User us = (User) context.getExternalContext().getSessionMap().get("user");

		List<UserRol> roles = rS.findUserRolesByUser(us);

		String rol = "";
		switch (viewId) {
		case "/panel.xhtml":
			rol = "AP,JP";
			break;
		case "/listempresa.xhtml":
			rol = "AP";
			break;
		case "/listempleado.xhtml":
			rol = "AP";
			break;
		case "/listpuesto.xhtml":
			rol = "AP";
			break;
		case "/listbarco.xhtml":
			rol = "AP";
			break;
		case "/listpuerto.xhtml":
			rol = "AP";
			break;
		case "/listclima.xhtml":
			rol = "AP,JP";
			break;
		case "/listtipopesca.xhtml":
			rol = "AP,JP";
			break;
		case "/listpesca.xhtml":
			rol = "AP,JP";
			break;
		case "/listherramienta.xhtml":
			rol = "AP";
			break;
		case "/listespecie.xhtml":
			rol = "AP,JP";
			break;
		case "/listproducto.xhtml":
			rol = "AP";
			break;
		case "/listproveedor.xhtml":
			rol = "AP";
			break;
		case "/listactividadpesquera.xhtml":
			rol = "AP,JP";
			break;
			
		case "/empresa.xhtml":
			rol = "AP";
			break;
		case "/empleado.xhtml":
			rol = "AP";
			break;
		case "/puesto.xhtml":
			rol = "AP";
			break;
		case "/barco.xhtml":
			rol = "AP";
			break;
		case "/puerto.xhtml":
			rol = "APR";
			break;
		case "/clima.xhtml":
			rol = "AP,JP";
			break;
		case "/tipopesca.xhtml":
			rol = "AP,JP";
			break;
		case "/pesca.xhtml":
			rol = "AP,JP";
			break;
		case "/herramienta.xhtml":
			rol = "AP";
			break;
		case "/especie.xhtml":
			rol = "AP,JP";
			break;
		case "/producto.xhtml":
			rol = "AP";
			break;
		case "/proveedor.xhtml":
			rol = "AP";
			break;
		case "/actividadpesquera.xhtml":
			rol = "AP,JP";
			break;
		
		default:
			break;
		}

		String arreglo[] = rol.split(",");

		int[] iarr = { 0 };
		roles.forEach(r -> {
			for (String x : arreglo) {
				if (r.getRol().getType().equals(x)) {
					iarr[0]++;
				}
			}
		});

		// System.out.println(iarr[0]);
		if (iarr[0] == 0) {
			return false;
		}
		return true;
	}
	
	public void cerrarSesion() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
	}
}
