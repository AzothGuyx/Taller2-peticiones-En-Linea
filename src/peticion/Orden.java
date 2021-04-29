package peticion;

import modelos.Usuario;

public class Orden {
	
	private String peticion;

	private Usuario usuario;

	public String getPeticion() {
		return peticion;
	}

	public void setPeticion(String peticion) {
		this.peticion = peticion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Orden(String peticion, Usuario usuario) {
		this.peticion = peticion;
		this.usuario = usuario;
	}
	
}
