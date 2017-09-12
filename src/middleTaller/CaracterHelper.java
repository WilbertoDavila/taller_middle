package middleTaller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class CaracterHelper {

	private HashMap<String, CaracterDibujable> letras = new HashMap<String, CaracterDibujable>();
	
	public CaracterHelper(){
		//Crear hashMap con las letras y los objetos de las clases para dinujar cada letra
		this.letras.put("a", new LetraA());
		this.letras.put("o", new LetraO());
		this.letras.put("c", new LetraC());
		this.letras.put("s", new LetraS());
	}
	
	public void dibujar(String palabra){
		//recorre el string y dibujar solo las letras que esten en el HashMap
		for (int x=0;x<palabra.length();x++){
			Iterator it = letras.entrySet().iterator();
			while(it.hasNext()){
				//Recuperar el elemnto del HashMap
				Entry<String, CaracterDibujable> e = (Entry<String, CaracterDibujable>) it.next();
				
				if(e.getKey().equals(String.valueOf(palabra.charAt(x)).toLowerCase())){
					//Usar el metodo dibujar
					e.getValue().dibujar();
				}
			}
		}
	}
}
