package es.cursojava.inicio;

public class Variables {
	//Variables de instancia
	static int numero2;
	public static void main(String[] args) {
		//Variables locales
		
		//Tipos primitivos
		//Enteros
		byte num1 = 100;//-128 a 128
		short num2 = 2;//-32,768 a 32,767
		int num3 = 7;//-2,147,483,648 a 2,147,483,647
		long num4 = 123123;//-9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
		
		int numero;//Siempre tienen que estar inicializadas antes de usarse
		//System.out.println(numero);
		System.out.println(numero2);//Las variables de instancia se inicializan por defecto
		
		//Decimales
		double decimal = 7.5;
		float decimal1 = 5.6f;
		
		char caracter = 'H';
		
		boolean esMayorEdad = true;
		
		//Tipo objeto
		String mensaje = "Hola Mundo ";
		int [] numeros = {1,2,3};//Array
		
		System.out.println(mensaje + (num3 + 3) + 6 );
		
	}

}
