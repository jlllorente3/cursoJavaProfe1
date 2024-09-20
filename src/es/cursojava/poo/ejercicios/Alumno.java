package es.cursojava.poo.ejercicios;

public class Alumno {
	private String nombre;
	private String  dni;
	private int nota;
	private boolean mayorEdad;
	
	static int contador;
	
	public Alumno() {
		super();
	}

	public Alumno(String nombre, String dni, int nota, boolean mayorEdad) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.nota = nota;
		this.mayorEdad = mayorEdad;
	}

	public Alumno(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public boolean isMayorEdad() {
		return mayorEdad;
	}

	public void setMayorEdad(boolean mayorEdad) {
		this.mayorEdad = mayorEdad;
	}
	
	public void verNota() {
		if(mayorEdad) {
			if (nota==0) {
				System.out.println(nombre + " no ha estudidado nada");
			}else if (nota<5) {
				System.out.println(nombre + " ha estudidado poco");
			}else if (nota<9) {
				System.out.println(nombre + " ha estudidado mucho");
			}else if (nota<10) {
				System.out.println(nombre + " es un genio");
			}
		}else {
			System.out.println("Sin permisos");
		}
		
	}

	
}
