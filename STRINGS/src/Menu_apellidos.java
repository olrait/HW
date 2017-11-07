import java.util.Scanner;

public class Menu_apellidos {

	public static void main(String[] args) {
		/*
		 * Hacer un menu con las siguientes opciones
		 * 1 Pedir dos apellidos y decir cual es el mas largo
		 * 2 Ordenar dos apellidos alfabeticamente
		 * 3 Extraer del Nombre Apellido el apellido
		 */
		
		final int LARGO = 1;
		final int ALFABETICO = 2;
		final int NOMBREAPELLIDO = 3;
		final int CERRAR = 4;
		
		Scanner scan = new Scanner(System.in);
		int opcion;
		String apellido1, apellido2, nombre, nombreapellido;
		
		do {
			System.out.println("------MENU------");
			System.out.println(LARGO + " Calcula el apellido mas largo");
			System.out.println(ALFABETICO + " Ordena alfabeticamente dos apellidos");
			System.out.println(NOMBREAPELLIDO + " Saca el apellido al introducir nombre y apellido");
			System.out.println(CERRAR + " Cerrar el programa");
			
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case LARGO:
				System.out.println("Escribe tus dos apellidos");
				apellido1 = scan.nextLine();
				apellido2 = scan.nextLine();
				
				if (apellido1.length()<apellido2.length()) {
					System.out.println(apellido2 + " es mas largo");
				
				} else if (apellido1.length()>apellido2.length()) {
					System.out.println(apellido1 + " es mas largo");
			   
				} else { 
			    	System.out.println("los dos apellidos son igual de largos");
				}
				break;
				
			
			case ALFABETICO:
				System.out.println("Escribe tus dos apellidos");
				apellido1 = scan.nextLine();
				apellido2 = scan.nextLine();
				if (apellido1.compareTo(apellido2)<0)
					System.out.println(apellido1 + " , " + apellido2);
				else
					System.out.println(apellido2 + " , " + apellido1);
				break;
				
				
			case NOMBREAPELLIDO:
				System.out.println("Escribe tu nombre y apellido");
				nombreapellido = scan.nextLine();
				
				int beginIndex = nombreapellido.indexOf(" ") ;
				;
				
				System.out.println("el apellido es" + nombreapellido.substring(beginIndex));
				break;
			
				
			default:
				System.out.println("Opcion no reconocida");
			}
			
				
			}while(opcion != CERRAR);
			System.out.println("Fin del programa");
					
					
		}
		
		
	}


