package es.cursojava.poo.herencia;

public class Zoologico {

	public static void main(String[] args) {
		
		Leon leon1 = new Leon("1","Leon1","123123",250.6);
		Vaca vaca1 = new Vaca("1","V1","123123",250.6);
		Serpiente serpiente = new Serpiente("1","V1","123123",250.6,true);
		
		//Animal animal1 = new Animal("1","V1","123123",250.6);
		//No se puede crear porque la clase es abstracta
		
		leon1.beber();
		vaca1.beber();

		leon1.comer();
		vaca1.comer();
		System.out.println(vaca1.toString());
		
		Animal[] animales = {leon1, vaca1, serpiente};
		
		for (Animal animal : animales) {
			animal.comer();
		}
		
	}

}
