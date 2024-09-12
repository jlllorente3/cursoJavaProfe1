package es.cursojava.inicio.condicionales.ejercicios;


/* Comentario de bloque
 
String mes = "Enero";
si mes enero, feb, marzo --> invierno
si es abr, may, jun --> primavera
si jul, agos, sept --> verano
si oct, nov, dic --> otoño
*/

public class EjercicioCondicionales {

	public static void main(String[] args) {
		
		String mes = "Enero";
		
		if (mes.equals("Enero") ||  mes.equals("Febrero") || mes.equals("Marzo")) {
			System.out.println("Invierno");
		}else if (mes == "Abril" ||  mes == "Mayo" || mes == "Junio")  {
			System.out.println("Primavera");
		}else if (mes == "Julio" ||  mes == "Agosto" || mes == "Septiembre")  {
			System.out.println("Verano");
		}else if (mes == "Octubre" ||  mes == "Noviembre" || mes == "Diciembre")  {
			System.out.println("Invierno");
		}else {
			System.out.println("Mes incorrecto");
		}
		
//		if (mes == "Enero") {
//			System.out.println("Invierno");
//		}else if (mes == "Febrero") {
//			System.out.println("Invierno");
//		}else if (mes == "Marzo") {
//			System.out.println("Invierno");
//		}
		
	}

}
