import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * leer un fichero y sacarlo por pantalla
 */
public class main_ejemplo {
	public static void main(String[] args) throws FileNotFoundException{
		File fichero = new File("D:/mifichero.txt");
		Scanner scan = new Scanner(fichero);
		
		String linea = scan.nextLine();
		
		String[] numeros_string = linea.split(" ");
		
		for(int i = 0; i < numeros_string.length; i++ ){
			if(es_multiplo_de_tres(Integer.parseInt(numeros_string[i]))){
				System.out.println(numeros_string[i] + " es multiplo de tres");
		}
		
		/*String nombres = "juan aitor mikel josu iñigo eneko maria aintzane";
		String [] array_nombres = nombres.split(" ");
		System.out.println("asdf");
		*/		
	
	
	}
}

	static boolean es_multiplo_de_tres(int num){
		if(num % 3 == 0){
			return true;
		}else{
			return false;
		}
	}
}