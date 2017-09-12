package middleTaller;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Nomina {
	private int id;
	private Date fecha;
	private HashMap<String, Object> nominaHash = new HashMap<String, Object>();
	
	public Nomina(){
		Cargo analista1 = new Cargo(1, "Analista1", 4000000);
		Cargo analista2 = new Cargo(2, "Analista2", 3500000);
		Cargo jefe = new Cargo(3, "Jefe", 5000000);
		
		GenerarID idUnico = new GenerarID();
		
		Empleado empleado1 = new Empleado("Juan", idUnico.crearUUID(), analista1.getId());
		Empleado empleado2 = new Empleado("Pedro", idUnico.crearUUID(), analista1.getId());
		Empleado empleado3 = new Empleado("Carlos", idUnico.crearUUID(), analista2.getId());
		Empleado empleado4 = new Empleado("Andrea", idUnico.crearUUID(), analista2.getId());
		Empleado empleado5 = new Empleado("Jose", idUnico.crearUUID(), jefe.getId());
		
		nominaHash.put(empleado1.getDocumento(), empleado1);
		nominaHash.put(empleado2.getDocumento(), empleado2);
		nominaHash.put(empleado3.getDocumento(), empleado3);
		nominaHash.put(empleado4.getDocumento(), empleado4);
		nominaHash.put(empleado5.getDocumento(), empleado5);
		
	}
	
	public void calcularNomina(){
		Iterator it = nominaHash.entrySet().iterator();
		while(it.hasNext()){
			//Recuperar el elemnto del HashMap
			Entry <String, Object> e = (Entry<String, Object>) it.next();
				System.out.println("Empleado: " + e.getKey() + " " + ((Empleado) e.getValue()).getNombre() + " Salario: " );	
			}
	}
	
}
