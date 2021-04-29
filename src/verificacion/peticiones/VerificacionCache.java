package verificacion.peticiones;

import java.util.List;
import peticion.Orden;
import utilidades.OrdenCache;
import verificacion.IVerificacion;

public class VerificacionCache implements IVerificacion {

	private Orden orden;
	
	public VerificacionCache(Orden orden) {
		this.orden = orden;
	}
	
	@Override
	public Boolean validar() {
		System.out.println("Validando cache....");
		return obtenerOrdenCache();
	}
	
	private Boolean obtenerOrdenCache() {
		String peticion = orden.getPeticion();
		List<Orden> ordenes = OrdenCache.VerificarCache();
		
		for (Orden orden : ordenes) {
			if(peticion.equals(orden.getPeticion())) {
				System.out.println("Orden con cache encontrado");
				return true;
			}
		}
		return false;
	}
}
