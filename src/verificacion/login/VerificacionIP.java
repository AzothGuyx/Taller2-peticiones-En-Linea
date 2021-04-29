package verificacion.login;

import java.util.List;

import utilidades.ClienteData;
import verificacion.IVerificacion;

public class VerificacionIP implements IVerificacion {

	private List<String> ListaIP;
	
	public VerificacionIP() { }
	
	@Override
	public Boolean validar() {
		System.out.println("Validando IPs....");
		return true;
	}
	
	private void PoblarIP() {
		for (int i = 0; i < 10; i++) {
			ListaIP.add(ClienteData.IP1);
		}
	}

}
