package verificacion.peticiones;

import java.util.List;

import peticion.Orden;
import utilidades.DatosCrudos;
import verificacion.IVerificacion;

public class VerificacionDatosCrudos implements IVerificacion{

	private Orden orden;
	
	public VerificacionDatosCrudos(Orden orden) {
		this.orden = orden;
	}
	
	@Override
	public Boolean validar() {
		String peticion = this.orden.getPeticion();
		List<String> palabrasProhibido = DatosCrudos.DatosCrudosProhibidos();
		
		for (String palabraProhibida : palabrasProhibido) {
			if(peticion.contains(palabraProhibida)) {
				return true;
			}
		}
		
		return false;
	}

}
