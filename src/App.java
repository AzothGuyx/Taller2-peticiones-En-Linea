import java.util.ArrayList;
import java.util.List;

import modelos.Rol;
import modelos.Usuario;
import peticion.Autenticacion;
import peticion.Orden;
import utilidades.RolesBD;
import verificacion.login.VerificacionIP;
import verificacion.login.VerificacionUsuario;
import verificacion.peticiones.VerificacionCache;
import verificacion.peticiones.VerificacionDatosCrudos;

public class App {

	public static void main(String[] args) {
		Rol empleado = RolesBD.empleado;
		Rol administrador = RolesBD.administrador;
		
		List<Rol> roles = new ArrayList<>();
		roles.add(empleado);
		roles.add(administrador);
		
		Usuario usuarioValido = new Usuario(2,"Camilo","Ayudame","camilo@socorrojesus.com","noestaencriptadox2", roles);
		
		Orden ordenValida = new Orden("GET USERS", usuarioValido);
		
		
		Autenticacion autenticacion = new Autenticacion(new VerificacionUsuario(usuarioValido), 
														new VerificacionIP(), 
														new VerificacionDatosCrudos(ordenValida), 
														new VerificacionCache(ordenValida), 
														usuarioValido);
		
		Boolean usuarioCorrecto = autenticacion.ValidarUsuario();
		
		if(usuarioCorrecto) {
			System.out.println("Es un usuario válido");
			System.out.println(autenticacion.obtenerRolesUsuario());
			
			Boolean IpValida = autenticacion.ValidarIP();
			if(IpValida) {
				System.out.println("La IP es válida");
				
				Boolean ordenCacheada = autenticacion.ValidadCache();
				if(ordenCacheada) {
					System.out.println("Orden procesada");
				}else {
					Boolean datosCrudos = autenticacion.ValidarDatosCrudos();
					if(datosCrudos) {
						System.out.println("No se puede procesar su solicitud");
					}else {
						System.out.println("Solicitud válida");
					}
				}
			}
		}else {
			System.out.println("Usuario no válido, bye");
		}

	}

}
