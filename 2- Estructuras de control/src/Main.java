import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 
		
		Scanner lector = new Scanner(System.in);
		
	System.out.print(" A- Grabar CD Audio \n B- Grabar CD Datos \n C- Guardar CD en DD \n D- Copiar CD a CD \n");

	String opcion = lector.nextLine() ;
	
	switch (opcion) {
		
		case "a":
			System.out.println("\n Grabando CD de audio...");
			break;
		
		case "b":
			System.out.println("\n Grabando CD de datos...");
			break;
		
		case "c":
			System.out.println("\n Guardando CD en DD...");
			break;
			
		case "d":
			System.out.println("\n Copiando CD a CD...");
			break;
	}

}
}