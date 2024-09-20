package es.cursojava.poo.herencia;

public class Leon extends Animal{

	public Leon(String id, String nombre, String fechaNacimiento, double peso) {
		super(id, nombre, fechaNacimiento, peso);
		
	}

	@Override
	public void comer() {
		System.out.println("El leon "+ getNombre() + " está mordiendo");
	}

	@Override
	public void beber() {
		System.out.println("El león "+ getNombre() + " está bebiendo poco");
	}
	
}
