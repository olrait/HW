import java.util.Scanner;

public class Main_menu {

	public static void main(String[] args) {
	
		final int COPIAR = 1;
		final int GRABAR = 2;
		final int EXTRAER = 3;
		final int GRABAR2 = 4;
		final int SALIR = 5;
		
		Scanner scan = new Scanner (System.in);
		
		int opcion;
		do{
			System.out.println("--------MENU-------");
			System.out.print(" 1- Grabar CD de audio \n 2- Grabar CD de datos \n 3- Extraer contenido de CD \n 4- Grabar de CD a CD \n 5- Salir del menú \n");
			
		
		opcion = scan.nextInt();
			
			switch (opcion) {
				
				case 1:
					System.out.println("\n Grabando CD de audio...");
					System.out.println("CD grabado");
					break;
				
				case 2:
					System.out.println("\n Grabando CD de datos...");
					System.out.println("CD grabado");
					break;
				
				case 3:
					System.out.println("\n Extrayendo contenido de CD...");
					System.out.println("Contendo extraido");
					break;
					
				case 4:
					System.out.println("Grabando de CD a CD...");
					System.out.println("CD grabado");
					break;
					
				case 5:
					System.out.println("Cerrando...");
					break;
					
				default:
					System.out.println("Opcion no reconocida");
			}

			
			
			}while(opcion != 5);
				System.out.println("Fin del programa");
		}

	}


