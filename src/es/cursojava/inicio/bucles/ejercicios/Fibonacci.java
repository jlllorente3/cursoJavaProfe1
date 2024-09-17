package es.cursojava.inicio.bucles.ejercicios;

public class Fibonacci {
	//Mostrar los 10 primeros números de la Serie de Fibonacci
	//1,1,2,3,5,8,13
	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1+", ");
		System.out.print(num2+", ");
		
		for (int i=0; i<18 ; i++) {
			int suma = num1 + num2;
			System.out.print(suma + ", ");
			num1=num2;
			num2=suma;
		}
		
		
		

	}

}
