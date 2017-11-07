
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
				
		/*
		 El programa pide dos numeros y los compara 
		 */
	System.out.println("introduce un numero");
			
		//Creación objeto para leer teclado
			Scanner lector = new Scanner(System.in);
			
			int a = lector.nextInt();
			
	System.out.println("introduce otro numero");
			
			int b = lector.nextInt();
	
		if (a>b){
		
			System.out.println(a+" es mayor que "+b);
		}
		
		else{
			if (a==b){
			
				System.out.println(a+" y "+b+" son iguales");
			}
			
			else{
				
				System.out.println(a+" es menor que "+b);
			}
		}
	}

}
