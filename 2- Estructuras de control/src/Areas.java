import java.util.Scanner;

public class Areas {

	public static void main(String[] args) {
Scanner scan = new Scanner (System.in);
		
		int opcion;
		do{
			System.out.println("--------MENU-------");
			System.out.println("1- Area circulo");
			System.out.println("2- Area cuadrado");
			System.out.println("3- Area triangulo");
			System.out.println("4- Salir del programa");
		
		opcion = scan.nextInt();
			
			switch (opcion) {
				
				case 1:
					System.out.println("Introduce radio del ciruclo");
					
					int r = scan.nextInt();
					
					System.out.println(r*r*Math.PI);
					break;
				
				case 2:
					System.out.println("Introduce lado del cuadrado");
					
					int l = scan.nextInt();
					
					System.out.println(l*l);
					break;
				
				case 3:
					System.out.println("Introduce base triangulo");
					
					int b = scan.nextInt();
					
					System.out.println("Introduce altura del triangulo");
					
					int a = scan.nextInt();
					
					System.out.println(a*b/2);
					break;
					
				case 4:
					System.out.println("Cerrando...");
					break;
					
				
					
				default:
					System.out.println("Opcion no reconocida");
			}

			
			
			}while(opcion != 4);
				System.out.println("Fin del programa");
		}





	}


