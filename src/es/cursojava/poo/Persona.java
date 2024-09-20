package es.cursojava.poo;
//POJO
public class Persona {
	//Variables de instancia
	private String nombre;
	private String apellidos;
	private String dni;
	private int edad;
	private double peso;
	private double altura;
	
	//Constructores
	public Persona() {
		
	}
	
	public Persona (String nombre, String apellidos, String dni) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.dni=dni;
	}
	

	public Persona(String nombre, String apellidos, String dni, int edad, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}

	//Métodos getter y setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
	//Métodos de cada objeto
	public void correr() {
		System.out.print("La persona "+ this.nombre + " está corriendo");
		if (this.edad<20) {
			System.out.println(" muy rápido");
		}else if (edad<40) {
			System.out.println(" rápido");
		}else if (edad<60) {
			System.out.println(" lento");
		}else if (edad<100) {
			System.out.println(" muy lento");
		}
		
		
	}
	
}
