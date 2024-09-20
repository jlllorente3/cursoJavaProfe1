package es.cursojava.excepciones;

import es.cursojava.poo.ejercicios.Alumno;

public class PruebaExcepciones {

	public static void main(String[] args) {
		int [] numeros = {1,2,3};
		Alumno alumno1=new Alumno("N1","1A");
		
		try {
			System.out.println(numeros[2]);
			System.out.println(alumno1.getDni());
			int resultado = 7/0;
		}catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("Se ha producido un error al acceder a una posición del array");
		}catch(NullPointerException npe) {
			System.out.println("Se ha producido un error al acceder a un objeto sin referencia");
		}catch(Exception e) {
			System.out.println("Se ha producido un error general: " + e.getMessage());
		}finally {
			//Cierro conexion
			System.out.println("Esto se ejecuta siempre");
		}
		
		try {
			if (alumno1.getNota()<5) {
				MiExcepcion miExcepcion = new MiExcepcion("Error creado por mi");
				throw miExcepcion;
			}
		}
		catch(MiExcepcion me) {
			System.out.println(me.getMessage());
			me.printStackTrace();
		}
		
		System.out.println("Fin");
	}

}
