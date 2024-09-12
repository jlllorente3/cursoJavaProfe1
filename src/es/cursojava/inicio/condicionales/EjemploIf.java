package es.cursojava.inicio.condicionales;

public class EjemploIf {

	public static void main(String[] args) {
		
		int numero  = 2;
		int nota = 4;
		
		if ( numero%2!=0) {
			System.out.println("El numero es impar");
		}else {
			System.out.println("El numero es par");
		}
		
		if (nota<5) {
			System.out.println("Suspenso");
		}else if (nota<7) {
			System.out.println("Aprobado");
		}else if (nota<9) {
			System.out.println("Notable");
		}else {
			System.out.println("Sobresaliente");
		}
		
		//++ aumenta en el valor de un entero
		System.out.println(nota++);//6 el valor pasa 7
		System.out.println(++nota);//8
		
		System.out.println(nota+=3);//11
		nota = nota + 3;
		System.out.println(nota);//14
		
		System.out.println("Fin");
		

	}

}
