package peticion;

import modelos.Usuario;
import verificacion.login.VerificacionIP;
import verificacion.login.VerificacionUsuario;
import verificacion.peticiones.VerificacionCache;
import verificacion.peticiones.VerificacionDatosCrudos;

public class Autenticacion {

	VerificacionUsuario verificacionUsuario;
	VerificacionIP verificacionIP;
	VerificacionDatosCrudos verificacionDatos;
	VerificacionCache verificacionCache;

	Usuario usuario;

	public Autenticacion(VerificacionUsuario verificacionUsuario, VerificacionIP verificacionIP,
			VerificacionDatosCrudos verificacionDatos, VerificacionCache verificacionCache, Usuario usuario) {

		this.verificacionUsuario = verificacionUsuario;
		this.verificacionDatos = verificacionDatos;
		this.verificacionIP = verificacionIP;
		this.verificacionCache = verificacionCache;
		this.usuario = usuario;
	}

	private  Boolean ValidarUsuario() {
		return verificacionUsuario.validar();
	}

	private Boolean ValidadCache() {
		return verificacionCache.validar();
	}

	private Boolean ValidarDatosCrudos() {
		return verificacionDatos.validar();
	}

	private Boolean ValidarIP() {
		return verificacionIP.validar();
	}

	private String obtenerRolesUsuario() {
		return verificacionUsuario.validarRoles();
	}

	
	public void verificarInformacion() {
		Boolean usuarioCorrecto = ValidarUsuario();

		if (usuarioCorrecto) {
			System.out.println("Es un usuario válido");
			System.out.println(obtenerRolesUsuario());

			Boolean IpValida = ValidarIP();
			if (IpValida) {
				System.out.println("La IP es válida");

				Boolean ordenCacheada = ValidadCache();
				if (ordenCacheada) {
					System.out.println("Orden procesada");
				} else {
					Boolean datosCrudos = ValidarDatosCrudos();
					if (datosCrudos) {
						System.out.println("No se puede procesar su solicitud");
					} else {
						System.out.println("Solicitud válida");
					}
				}
			}
		} else {
			System.out.println("Usuario no válido, bye");
		}
	}

}
