import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("introduce un numero");
		
		int contador = 0;
		
		int numero =  lector.nextInt();
		
		
				while(contador < numero){
					
					contador = contador +1;
					System.out.println("contador: "+ contador);
				  
				}
		
	}

}
