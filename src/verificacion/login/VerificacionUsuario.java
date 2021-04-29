package verificacion.login;

import java.util.List;

import modelos.Rol;
import modelos.Usuario;
import utilidades.UsuariosBD;
import verificacion.IVerificacion;

public class VerificacionUsuario implements IVerificacion {

	private Usuario usuario;

	public VerificacionUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	private Boolean validarUsuarioContrsenia(List<Usuario> usuariosBD) {
		for (Usuario usuario : usuariosBD) {
			if (usuario.getCorreo().equals(this.usuario.getCorreo())
					&& usuario.getContrasenia().equals(this.usuario.getContrasenia())) {
				return true;
			}
		}
		return false;
	}

	public String validarRoles() {
		List<Rol> roles = usuario.getRoles();
		String rolesx2 = "";
		for (Rol rol : roles) {
			rolesx2 += " - " + rol.getNombre();
		}
		return rolesx2;
	}
	
	@Override
	public Boolean validar() {
		return validarUsuarioContrsenia(UsuariosBD.listaUsuarios());
	}

}
