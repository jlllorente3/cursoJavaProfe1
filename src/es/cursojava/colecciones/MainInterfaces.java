package es.cursojava.colecciones;

public class MainInterfaces {

	public static void main(String[] args) {
		PruebaInterfaz pi = new PruebaInterfaz();
		pi.metodo1();
		
		Interfaz1 pi2 = new PruebaInterfaz();

		pi2.metodo1();
		pi2.metodo2();
	}

}
