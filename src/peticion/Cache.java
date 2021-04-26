package peticion;

import java.util.ArrayList;
import java.util.List;

import usuario.Usuario;

public class Cache {
	
	private List<Orden> cachePeticiones;

	public List<Orden> getCachePeticiones() {
		return cachePeticiones;
	}

	public void setCachePeticiones(List<Orden> cachePeticiones) {
		this.cachePeticiones = cachePeticiones;
	}

	public Cache() {
		this.cachePeticiones = new ArrayList<>();
	}
	
	
	public static List<Orden> ordenesCacheadas(){
		List<Orden> ordenesCacheadas = new ArrayList<>();
		ordenesCacheadas.add(new Orden("Crear", new Usuario(1,"Sara","Ayudame","sara@socorrojesus.com","noestaencriptado")));
		ordenesCacheadas.add(new Orden("Borrar", new Usuario(1,"Sara","Ayudame","sara@socorrojesus.com","noestaencriptado")));
		
		return ordenesCacheadas;
	}
	
	
	

}
