package es.cursojava.poo.ejercicios;

public class Aula {

	public static void main(String[] args) {
		
		for (String arg : args) {
			System.out.println(arg);
		}
		
		String moneda = args[1];
		
		Alumno alumno1 = new Alumno();
		alumno1.setNombre("N1");
		alumno1.setDni("111A");
		alumno1.setNota(4);
		alumno1.setMayorEdad(true);
		
		Alumno alumno2 = new Alumno("N2","222B");
		alumno2.setNota(9);
		alumno2.setMayorEdad(true);
		
		Alumno alumno3 = new Alumno("N3","333C",7,true);
		
//		alumno1.verNota();
//		alumno2.verNota();
//		alumno3.verNota();
		
		Alumno[] alumnos = {alumno1, alumno2, alumno3};
		
		Aula aula = new Aula();
		aula.verDatosAlumnos(alumno1, alumno2, alumno3);
		
		
		alumno1.contador = 10;
		System.out.println(alumno2.contador);
		alumno3.contador = 12;
		System.out.println(alumno2.contador);
		Alumno.contador = 7;
		System.out.println(alumno2.contador);
		
	}
	
	//VARARGS
	private void verDatosAlumnos (Alumno... alumnos) {
		for ( Alumno alumno   : alumnos ) {
			if (alumno.getNota()>=5) {
				//System.out.println(alumno);
				System.out.println(alumno.getDni() + " " + alumno.getNombre() + " " + alumno.getNota());
				//alumno.verNota();
			}
		}
	}

	
}
