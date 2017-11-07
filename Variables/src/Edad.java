import java.util.Scanner;

public class Edad {

	public static void main(String[] args) {
		
		System.out.println("inserta edad");
		
		Scanner lector = new Scanner(System.in);
				
				int a = lector.nextInt();
				
		if (a>=16 && a<=65){
				
			System.out.println("Edad laboral");
		}
		if (a<16){
			
			System.out.println("No es edad para trabajar por ser menor");
		}
		if (a>65){
			
			System.out.println("No es edad para trabajar por estar jubilado");
		}
		}
	}

