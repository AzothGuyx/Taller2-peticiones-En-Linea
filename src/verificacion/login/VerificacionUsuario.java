package verificacion.login;

import java.util.List;

import usuario.Rol;
import usuario.Usuario;
import utilidades.UsuariosBD;
import verificacion.IVerificacion;

public class VerificacionUsuario implements IVerificacion {

	private Usuario usuario;

	public VerificacionUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	private Usuario usuarioLogueado;

	private Boolean validarUsuarioContrsenia(List<Usuario> usuariosBD) {

		for (Usuario usuario : usuariosBD) {
			if (usuario.getCorreo().equals(this.usuario.getCorreo())
					&& usuario.getContrasenia().equals(this.usuario.getContrasenia())) {
				this.usuarioLogueado = usuario;
				return true;
			}

		}

		return false;
	}

	public List<Rol> validarRoles() {

		return usuarioLogueado.getRoles();
	}

	@Override
	public Boolean validar() {
		return validarUsuarioContrsenia(UsuariosBD.listaUsuarios());
	}

}
