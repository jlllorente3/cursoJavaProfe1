package es.cursojava.inicio.condicionales;

public class EjemploSwitch {

	public static void main(String[] args) {
		
		String mes = "febrero";
		
		switch(mes.toLowerCase()) { 
			case "enero":
			case "febrero":
			case "marzo":System.out.println("Invierno");break;
			case "abril":
			case "mayo":
			case "junio":System.out.println("Primavera");break;
			case "julio":
			case "agosto":
			case "septiembre":System.out.println("Verano");break;
			case "octubre":
			case "noviembre":
			case "diciembre":System.out.println("OtoÃ±o");break;
			default: System.out.println("Mes incorrecto");
		}

		
		switch(mes.toLowerCase()) { 
			case "enero","febrero","marzo": System.out.println("Invierno");break;
			case "abril","mayo","junio": System.out.println("Primavera");break;
			case "julio","agosto","septiembre":System.out.println("Verano");break;
			case "octubre","noviembre","diciembre":System.out.println("Otoño");break;
		default: System.out.println("Mes incorrecto");
	}
		
	}

}
