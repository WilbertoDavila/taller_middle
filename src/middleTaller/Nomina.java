package middleTaller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Nomina {
	private int id;
	private Date fecha;
	private HashMap<String, Object> nominaHash = new HashMap<String, Object>();
	
	
	public Nomina(int id, String fecha){
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
               
		this.id = id;
		try {
			this.fecha = formato.parse(fecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
	}
	
	public void add(String nombre, Cargo cargo){
		GenerarID idUnico = new GenerarID();
		Empleado empleado = new Empleado(nombre, idUnico.crearUUID(), cargo);
		this.nominaHash.put(empleado.getDocumento(), empleado);
		
	}
	
	public void calcularNomina(){
		System.out.println("idNomina: " + this.id + " Fecha: " + this.fecha.toString());
		Iterator<Entry<String, Object>> it = this.nominaHash.entrySet().iterator();
		while(it.hasNext()){
			//Recuperar el elemento del HashMap
			Entry <String, Object> e = (Entry<String, Object>) it.next();
			System.out.println("Empleado: " + e.getKey() + ", " + ((Empleado) e.getValue()).getNombre()
					+ ". Cargo: " + ((Empleado) e.getValue()).getCargo().getDescripcion() 
					+ ". Salario: " + ((Empleado) e.getValue()).getCargo().getSalario());	
			}
	}
	
}
