package es.cursojava.inicio;

public class ClaseString {

	public static void main(String[] args) {
		
		String texto1 = "hola";
		//String texto2 = texto1;
		String texto2 = "hola";
		String texto3 = new String ("hola");
		
		System.out.println(texto1 == texto2);//true
		System.out.println(texto1 == texto3);//true
		System.out.println(texto1.equals(texto3));//true

		texto1=texto1.toUpperCase();
		System.out.println(texto1);
		System.out.println(texto2);
		
		System.out.println(texto1 + " qué tal?");
		
		
	}

}
