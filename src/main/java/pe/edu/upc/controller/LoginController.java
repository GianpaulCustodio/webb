package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.User;
import pe.edu.upc.serviceimpl.UserServiceImpl;

@Named
@ViewScoped
public class LoginController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private UserServiceImpl uS;

	private User user;

	@PostConstruct
	public void init() {
		this.user = new User();
	}

	public String authentication() throws Exception {
		String redirect = null;
		// FacesContext.getCurrentInstance().addMessage(null,
	      //          new FacesMessage("Credencialies Incorrectas"));
		try {
			Optional<User> userFound = this.uS.authentication(user);

			if (userFound.isPresent() && userFound.get().getState().equalsIgnoreCase("A")) {
				// Almacenar en la sesiï¿½n de JSF
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("user", userFound.get());
				redirect = "/panel?faces-redirect=true";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Credenciales Incorrectas"));
		//int entero= this.uS.Usuario_O_Pass(user);
		//if(entero==1)
		//{
		//	FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Usuario no encontrado"));
		//}
		//if(entero==2)
		//{
		//	FacesContext.getCurrentInstance().addMessage(null,
		//             new FacesMessage("Contraseña Incorrecta"));		
		//}
		return redirect;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
