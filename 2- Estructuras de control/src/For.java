import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		int num_acertar = (int)(Math.random()+10);
		int num_usuario;
		Scanner scan;
		
		do{
			System.out.println("introduce un numero");
			Scanner scan = new Scanner(System.in);
			int num_usuario = scan.nextInt();
			
			}while(num_usuario != num_acertar);
		
	}
	}
}
