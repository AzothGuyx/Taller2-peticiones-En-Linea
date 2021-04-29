package utilidades;

import java.util.ArrayList;
import java.util.List;

import peticion.Orden;

public class OrdenCache {

	public static List<Orden> VerificarCache() {
		Orden orden1 = new Orden("GET", null);
		Orden orden2 = new Orden("GET USERS", null);
		Orden orden3 = new Orden("EXIST USER", null);
		
		List<Orden> listaCacheOrden = new ArrayList<>();
		
		listaCacheOrden.add(orden1);
		listaCacheOrden.add(orden2);
		listaCacheOrden.add(orden3);
		
		return listaCacheOrden;
	}
	
}
