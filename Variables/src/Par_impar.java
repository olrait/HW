import java.io.InputStream;
import java.util.Scanner;

public class Par_impar {
	
//El programa pedira un numero, y nos dira si el numero es par o impar
	
	public static void main(String[] args) {
		
	System.out.println("inserta un numero");
	
	Scanner lector = new Scanner(System.in);
			
			int a = lector.nextInt();
			
	if ((double)a%2 == 0){
		
		System.out.println("el número es par");
		}
	else{
		
		System.out.println("el número es impar");
		
		
	}
	
	}

}
