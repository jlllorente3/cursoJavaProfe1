package es.cursojava.colecciones;

import java.util.HashSet;

import es.cursojava.poo.ejercicios.Alumno;

public class PruebaSet {

	public static void main(String[] args) {
		HashSet<Alumno> alumnos = new HashSet();

		alumnos.add(new Alumno("N1","1A"));
		alumnos.add(new Alumno("N2","2B"));
		alumnos.add(new Alumno("N3","3C"));
		alumnos.add(new Alumno("N4","4D"));
		
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getNombre());
		}
		
		Alumno a = new Alumno("N5","5E");
		System.out.println(alumnos.contains(a));
		alumnos.add(a);
		alumnos.add(a);
		System.out.println("============================");
		
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getNombre());
		}

	}

}
