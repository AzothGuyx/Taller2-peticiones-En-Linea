package usuario;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private Integer id;
	private String nombre;
	private String apellido;
	private String correo;
	private String contrasenia;
	private List<Rol> roles;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public List<Rol> getRoles() {
		return roles;
	}
	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}
	
	public Usuario() {
		this.roles = new ArrayList<>();
	}
	
	public void addRole(Rol rol) {
		this.roles.add(rol);
	}
	
	public void quitRole(Rol rol) {
		this.roles.remove(rol);
	}
	public Usuario(Integer id, String nombre, String apellido, String correo, String contrasenia) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.roles.add(new Rol(1,"usuario","usuario"));
	}
	
	
	
	
	
}
