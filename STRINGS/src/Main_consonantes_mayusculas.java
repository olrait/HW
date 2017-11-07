import java.util.Scanner;

public class Main_consonantes_mayusculas {

	public static void main(String[] args) {
		
		String frase;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Escribe una frase");
		
		frase = scan.nextLine();

	
		
		
		for(int i=0; i<frase.length(); i++){	
			if (frase.charAt(i)!='a' && frase.charAt(i)!='e' && frase.charAt(i)!='i' && frase.charAt(i)!='o' && frase.charAt(i)!='u'){
				System.out.print(String.valueOf(frase.charAt(i)).toUpperCase());
			}
			
				else {
					System.out.print(frase.charAt(i));
			}
			
		}	
		}
		

	

}

