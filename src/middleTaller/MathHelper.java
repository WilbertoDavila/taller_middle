package middleTaller;

import java.security.InvalidParameterException;
import java.util.Vector;

public class MathHelper {
	
	
	public void add(Vector<Integer> lista, int p){	
		lista.addElement(p);
		ordenar(lista);
	}	
	
	public void remove(Vector<Integer> lista, int indice){
		if(lista.size() <= indice){
			throw new InvalidParameterException("Posición no existe en la lista");
		}
		else{
			lista.removeElementAt(indice);
			ordenar(lista);
		}
	}
	
	private void ordenar(Vector<Integer> lista){
		int i, j, aux;
        for(i=0;i<lista.size()-1;i++){
             for(j=0;j<lista.size()-i-1;j++){
                  if(lista.elementAt(j+1) < lista.elementAt(j)){
                     aux=lista.elementAt(j+1);
                     lista.setElementAt(lista.elementAt(j), j+1);
                     lista.setElementAt(aux, j);
                  }
			}
		}
	}
	
	public void mostrarLista(Vector<Integer> lista){
		for(int i=0; i<lista.size(); i++){
            System.out.print(lista.elementAt(i)+"\t");
        }
	}
}
