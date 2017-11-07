import java.util.Scanner;

public class Main_vuelta_string {

	public static void main(String[] args) {
		String frase;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Escribe una frase");
		
		frase = scan.nextLine();
		
		
		for(int i=  (frase.length()-1); i > -1; i--){	
			System.out.println(frase.charAt(i));
		}

		
		
		
		
	}

}
