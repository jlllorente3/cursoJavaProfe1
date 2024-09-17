package es.cursojava.inicio.funciones;

public class EjemploFunciones {

	final static int NUMERO=3;
	
	public static void main(String[] args) {
		
		int numero = 2;
		//Paso por valor (tipos primitivos)
		funcion1(numero);
		System.out.println("numero: "+numero);
		
		int[] numeros = {1,2,3};
		//Paso por referencia
		funcion1(numeros);
		System.out.println(numeros[0]);//5
		
		int anioNacimiento =  calculaAnioNacimiento(28);
		System.out.println(anioNacimiento);
	}
	
	//Sobrecarga de la funcion funcion1
	public static void funcion1 () {
		System.out.println("Funcion1 llamada");
	}
		
	public static void funcion1 (int numero) {
		numero +=2;
		System.out.println("Funcion1 llamada "+numero);
	}
	
	private static void funcion1 (int[] numerosArray) {
		numerosArray[0]=5;
		System.out.println("Funcion1 llamada "+numerosArray[0]);//5
	}
	
	
	static int calculaAnioNacimiento(int edad) {
		int anioNacimiento=0;
		
		anioNacimiento = 2024-edad;
		
		return anioNacimiento;
	}
	
	
	
}
