package es.cursojava.inicio.funciones;

public class Utilidades {
	public static boolean validarEmail(String email) {
		
		return email.contains("@");
	}
	
	public int suma(int num1, int num2) {
		
		return num1+num2;
	}
	
	public int resta(int num1, int num2) {
		
		return num1-num2;
	}

	public int multiplica(int num1, int num2) {
		
		return num1*num2;
	}

	public int divide(int num1, int num2) {
		int resultado = num1/num2;
		
		return resultado;
	}
}
