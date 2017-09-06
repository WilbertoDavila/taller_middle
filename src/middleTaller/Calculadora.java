package middleTaller;

import java.security.InvalidParameterException;

public class Calculadora {

	public Calculadora() {
		// TODO Auto-generated constructor stub
	}

	public double suma (double valor1, double valor2){
		return valor1 + valor2;
	}
	
	public double resta (double valor1, double valor2){
		return valor1 - valor2;
	}

	public double multiplicacion (double valor1, double valor2){
		return valor1 * valor2;
	}
	
	public double division (double valor1, double valor2){
		if(valor2 != 0){
			return valor1 / valor2;
		}
		else{
			throw new InvalidParameterException("El divisor no puede ser cero");
		}	
	}
}
