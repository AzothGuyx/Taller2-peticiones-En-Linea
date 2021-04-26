package utilidades;

import java.util.ArrayList;
import java.util.List;

import usuario.Usuario;

public class UsuariosBD {
	
	
	public static List<Usuario> listaUsuarios(){
		List<Usuario> usuarios = new ArrayList<>();
		
		usuarios.add(new Usuario(1,"Sara","Ayudame","sara@socorrojesus.com","noestaencriptado"));
		usuarios.add(new Usuario(2,"Camilo","Ayudame","camilo@socorrojesus.com","noestaencriptadox2"));
		usuarios.add(new Usuario(3,"Cristian","Ayudame","cristian@socorrojesus.com","noestaencriptadox3"));
		
		
		return usuarios;
	}
	
	
	
	

	
}
