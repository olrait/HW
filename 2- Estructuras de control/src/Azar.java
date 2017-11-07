import java.util.Scanner;

public class Azar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Adivina el numero de 0 al 9");
		
		Scanner lector = new Scanner(System.in);
		
		double decimal = Math.random();
		int numero = (int) (decimal *10);
		
		int intento = 1;
		
		int numero2 = lector.nextInt();
		
		
		while (numero!=numero2){
		
			System.out.println("Fallaste!	Adivina el numero de 0 al 9");
		
			 numero2 = lector.nextInt();
			 
			 intento = intento +1;
			 
		}
			
			
		System.out.print("Has acertado en el intento " + intento); 
		}
			
		
		
	
		}
	
	
	
	




