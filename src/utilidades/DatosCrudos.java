package utilidades;

import java.util.ArrayList;
import java.util.List;

public class DatosCrudos {

	public static List<String> DatosCrudosProhibidos(){
		List<String> datosProhibidos = new ArrayList<String>();
		
		datosProhibidos.add("DELETE");
		datosProhibidos.add("INSERT");
		datosProhibidos.add("UPDATE");
		datosProhibidos.add("SELECT");
		
		return datosProhibidos;
	}
	
	
}
