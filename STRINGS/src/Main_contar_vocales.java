import java.util.Scanner;

public class Main_contar_vocales {
	

	public static void main(String[] args) {
		
		String frase;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Escribe una frase");
		
		frase = scan.nextLine();

		
		int vocales = 0;
		
		for(int i=0; i<frase.length(); i++){	
			if (frase.charAt(i)=='a'){
				vocales = vocales + 1;
			}
			else if (frase.charAt(i)=='e'){
				vocales++;
				}
			else if (frase.charAt(i)=='i'){
				vocales++;
			}

			else if (frase.charAt(i)=='o'){
				vocales++;
			}
			
			else if (frase.charAt(i)=='u'){
				vocales++;
			}
			
		}	
		
		System.out.println("Hay " + vocales + " vocales");
		}
}
