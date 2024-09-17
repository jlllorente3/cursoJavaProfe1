package es.cursojava.poo;

public class Cine {

	public static void main(String[] args) {
		
		Persona persona0 = new Persona("Raúl","A1","111A");
		persona0.setEdad(36);
		persona0.correr();
		System.out.println(persona0.getNombre());
		
		Persona persona = new Persona("N2","A2","222B",18,70,1.80);
		persona.correr();
		
		Persona persona1 = new Persona();
		persona1.correr();
		
		
		System.out.println(persona1.getNombre());
		persona1.setNombre("Juan");
		System.out.println(persona1.getNombre());
		System.out.println(persona1.getApellidos());
		System.out.println(persona1.getEdad());
		//persona1.setDni("");
		System.out.println(persona1.getDni());
		
		Persona persona2 = new Persona();
		persona2.setNombre("Eva");
		
		
		Persona persona3 = new Persona();
		persona3.setNombre("Laura");
		
		
		Persona persona4 = persona3;
		persona4.setNombre("Edu");
		System.out.println(persona3.getNombre() );
		System.out.println(persona4.getNombre() );
		
	}

}
