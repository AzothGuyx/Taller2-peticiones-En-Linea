package verificacion.login;


import verificacion.IVerificacion;

public class VerificacionIP implements IVerificacion {

	
	
	@Override
	public Boolean validar() {
		System.out.println("Validando IPs....");
		return true;
	}
	

}
