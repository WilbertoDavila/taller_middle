package middleTaller;

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
		Cargo analista1 = new Cargo(1, "Analista1", 4000);;
		Cargo analista2 = new Cargo(2, "Analista2", 3500);;
		Cargo jefe = new Cargo(3, "Jefe", 5000);;
		
		Nomina nomina = new Nomina(001, "13/09/2017");
		nomina.add("Luis", analista1);
		nomina.add("Andres", analista2);
		nomina.add("Wil", analista1);
		nomina.add("Ana", jefe);
		nomina.add("Sara", analista2);
		nomina.calcularNomina();
		
		
		//Lista
		System.out.println("\n\nPunto 3: lista de numeros");
		
		Vector<Integer> lista = new Vector<Integer>();
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
