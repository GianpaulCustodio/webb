package pe.edu.upc.controller;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.mindrot.jbcrypt.BCrypt;

import pe.edu.upc.entity.Empleado;
import pe.edu.upc.entity.Rol;
import pe.edu.upc.entity.User;

import pe.edu.upc.service.IEmpleadoService;
import pe.edu.upc.service.IRolService;

@Named
@ViewScoped
public class RegisterController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IEmpleadoService cS;

	@Inject
	private IRolService rS;
	private List<Rol> listaroles;
	private Empleado empleado;
	private User user;
	private Rol rol;
	@PostConstruct
	public void init() {
		this.rol= new Rol();
		this.listaroles= new ArrayList<>();
		this.empleado = new Empleado();
		this.user = new User();
		this.listaroles= new ArrayList<>();
		this.listar();
	}

	public void listar() {
		try {
			listaroles = rS.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public List<Rol> getListaroles() {
		return listaroles;
	}

	public void setListaroles(List<Rol> listaroles) {
		this.listaroles = listaroles;
	}

	public String registerUser() {
		String redirect = null;
		try {
			String password = this.user.getPassword();
			String passwordHash = BCrypt.hashpw(password, BCrypt.gensalt());
			this.user.setPassword(passwordHash);
			this.user.setState("A");
			this.empleado.setUser(user);
			this.user.setEmpleado(empleado);
			this.cS.insert(empleado);

			List<Rol> roles = new ArrayList<Rol>();
			int TIPO_USUARIO = 1;
			Rol r = new Rol();
			r.setId(TIPO_USUARIO);
			roles.add(r);
			rS.assignRolesToUser(user, roles);
			redirect = "Login?faces-redirect=true";
		} catch (Exception e) {

		}

		return redirect;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setCustomer(Empleado empleado) {
		this.empleado = empleado;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
