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

public class Cliente {

	public static void main(String[] args) {
		Rol empleado = RolesBD.empleado;
		Rol administrador = RolesBD.administrador;
		
		List<Rol> roles = new ArrayList<>();
		roles.add(empleado);
		roles.add(administrador);
		
		Usuario usuarioValido = new Usuario(2,"Camilo","Ayudame","camilo@socorrojesus.com","", roles);
		
		Orden ordenValida = new Orden("GET USERS", usuarioValido);
		
		
		Autenticacion autenticacion = new Autenticacion(new VerificacionUsuario(usuarioValido), 
														new VerificacionIP(), 
														new VerificacionDatosCrudos(ordenValida), 
														new VerificacionCache(ordenValida), 
														usuarioValido);
		
		autenticacion.verificarInformacion();
		
		

	}

}
