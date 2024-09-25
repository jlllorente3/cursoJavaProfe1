package es.cursojava.colecciones;

import java.util.ArrayList;

import es.cursojava.poo.ejercicios.Alumno;

public class PruebaListas {

	public static void main(String[] args) {
		
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
				
		alumnos.add(new Alumno("N1","1A"));
		alumnos.add(new Alumno("N2","2B"));
		alumnos.add(new Alumno("N3","3C"));
		alumnos.add(new Alumno("N4","4D"));
		
		System.out.println(alumnos.size());
		
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getNombre());
		}
		
		Alumno a = new Alumno("N5","5E");
		System.out.println(alumnos.contains(a));
		alumnos.add(0, a);
		alumnos.add(0, a);
		System.out.println("============================");
		
		String dniABuscar = "3C";
		
		for(int i= alumnos.size()-1 ; i>=0; i--) {
			System.out.println(alumnos.get(i).getNombre());
		}
		
		
		for (Alumno alumno : alumnos) {
			if (alumno.getDni().equals(dniABuscar)) {
				System.out.println(alumno.getNombre() + " " + alumno.getDni());
				break;
			}
		}
		
		System.out.println(alumnos.contains(a));
		
		
	}

}

