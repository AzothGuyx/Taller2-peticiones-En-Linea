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
	
	public Autenticacion(VerificacionUsuario verificacionUsuario,
						 VerificacionIP verificacionIP,
						 VerificacionDatosCrudos verificacionDatos,
						 VerificacionCache verificacionCache,
						 Usuario usuario) {
		
		this.verificacionUsuario = verificacionUsuario;
		this.verificacionDatos = verificacionDatos;
		this.verificacionIP = verificacionIP;
		this.verificacionCache = verificacionCache;
		this.usuario = usuario;
	}
	
	public Boolean ValidarUsuario() {
		return verificacionUsuario.validar();
	}
	
	public Boolean ValidadCache() {
		return verificacionCache.validar();
	}
 
	public Boolean ValidarDatosCrudos() {
		return verificacionDatos.validar();
	}
	
	public Boolean ValidarIP() {
		return verificacionIP.validar();
	}
	
	public String obtenerRolesUsuario(){
		return verificacionUsuario.validarRoles();
	}
}
