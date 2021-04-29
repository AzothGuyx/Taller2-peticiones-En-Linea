package utilidades;

import java.util.ArrayList;
import java.util.List;

import modelos.Rol;
import modelos.Usuario;

public class UsuariosBD {
	public static List<Rol> Roles1 = new ArrayList<>();
	
	public static List<Usuario> listaUsuarios(){
		Roles1.add(RolesBD.empleado); 
		Roles1.add(RolesBD.administrador);
		
		List<Usuario> usuarios = new ArrayList<>();
		
		usuarios.add(new Usuario(1,"Sara","Ayudame","sara@socorrojesus.com","noestaencriptado", Roles1));
		usuarios.add(new Usuario(2,"Camilo","Ayudame","camilo@socorrojesus.com","noestaencriptadox2", Roles1));
		usuarios.add(new Usuario(3,"Cristian","Ayudame","cristian@socorrojesus.com","noestaencriptadox3", Roles1));
		
		
		return usuarios;
	}
	
	
	
	

	
}
