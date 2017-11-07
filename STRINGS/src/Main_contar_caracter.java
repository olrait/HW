import java.util.Scanner;

public class Main_contar_caracter {

	public static void main(String[] args) {
		
		String frase;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Escribe una frase");
		
		frase = scan.nextLine();

		
		int cantidad_letra = 0;
		
		System.out.println("escribe el caracter que deseas contar");
		
		char letra = scan.nextLine().charAt(0);
		
		
		for(int i=0; i<frase.length(); i++){	
			if (frase.charAt(i)==letra){
				cantidad_letra++;
			}
		}
		System.out.println("el caracter " + letra + " aparece " + cantidad_letra + " veces");

	}}
