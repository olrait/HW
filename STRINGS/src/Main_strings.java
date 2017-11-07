
public class Main_strings {

	public static void main(String[] args) {
		
		
		
		String cadena = "hola mundo";
		
		String cadena1 = "zubiri";
		String cadena2 = "manteo";
		
		System.out.println(cadena);
		System.out.println("hola mundo");
		
		System.out.println("la cadena\"" + cadena + "\" tiene " + cadena.length() + " caracteres");
		
		System.out.println("El segundo caracter de \"" + cadena + "\" es '" + cadena.charAt(6) +"'");
		
		System.out.println(cadena.substring(0,4));
		System.out.println(cadena.substring(5,cadena.length()));
		
		if(cadena.equals(cadena2)){
			System.out.println("son inguales");
		}else{
			System.out.println("son diferentes");
		}
	
		System.out.println("\n" + cadena.indexOf("a"));
		
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		int comparacion= cadena1.compareTo(cadena2);
		
		System.out.println("Comparacion de " + cadena1 + " con " + cadena2 + " es: " + comparacion);
		
		
		if(cadena2.equals(cadena1)){
			System.out.println("son iguales");
		}
		
		if(cadena2.compareTo(cadena2) == 0 ){;
			System.out.println("son iguales");
		}
	
		System.out.println("La ultima aparicion de o en " + cadena + " es: " + cadena.lastIndexOf("o"));		

	}
}
	
