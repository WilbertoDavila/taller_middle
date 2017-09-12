package middleTaller;

import java.util.HashMap;
import java.util.Vector;

public class AppMain {

	public static void main(String[] args) {
		
		//Caluladora:
		System.out.println("Punto 1: calculadora");
		Calculadora cal = new Calculadora();
		System.out.println("Suma: "+cal.suma(2, 3));
		System.out.println("Resta: "+cal.resta(2, 3));
		System.out.println("Multiplica: "+cal.multiplicacion(2, 3));
		System.out.println("División: "+cal.division(2, 3));
		System.out.println("División 0:");
		try{
			System.out.println(cal.division(2, 0));
		}catch(Exception e){
			System.out.println("\n"+e.getMessage());
		}
		
		
		//Nomina
		System.out.println("\n\nPunto 2: nomina");
		Nomina nomina = new Nomina();
		
		
		
		//Lista
		System.out.println("\n\nPunto 3: lista de numeros");
		
		Vector<Integer> lista = new Vector();
		MathHelper myMathHelper = new MathHelper();
		myMathHelper.add(lista, 3);
		myMathHelper.add(lista, 2);
		myMathHelper.add(lista, 1);
		myMathHelper.mostrarLista(lista);
		System.out.println("\nAdicionar elemento lista:");
		myMathHelper.add(lista, 0);
		myMathHelper.mostrarLista(lista);
		System.out.println("\nEliminar elemento:");
		try{
			myMathHelper.remove(lista, 2);
		}catch(Exception e){
			System.out.println("\n"+e.getMessage());
		}
		myMathHelper.mostrarLista(lista);
		System.out.println("\nEliminar elemento fuera de rango:");
		try{
			myMathHelper.remove(lista, 5);
		}catch(Exception e){
			System.out.println("\n"+e.getMessage());
		}
		
		
		//Dibujar letras
		System.out.println("\n\nPunto 4: dibujar cosa");
		CaracterHelper myCaracterHelper = new CaracterHelper();
		myCaracterHelper.dibujar("x cosA x");
		
		
	}

}
