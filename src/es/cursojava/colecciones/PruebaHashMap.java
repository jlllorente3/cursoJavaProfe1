package es.cursojava.colecciones;

import java.util.HashMap;

import es.cursojava.poo.ejercicios.Alumno;

public class PruebaHashMap {

	public static void main(String[] args) {
		
		HashMap<String, Alumno> alumnos = new HashMap<>();

		alumnos.put("1A", new Alumno("N1","1A"));
		alumnos.put("2B", new Alumno("N2","2B"));
		alumnos.put("3C", new Alumno("N3","3C"));
		alumnos.put("4D", new Alumno("N4","4D"));
		
		System.out.println(alumnos.get("3C").getNombre());
	}

}
