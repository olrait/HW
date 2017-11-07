import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("Escribe tu nombre");
	
	//Creación objeto para leer teclado
	Scanner lector = new Scanner(System.in);
	
	//lectura de teclado
	String nombre = lector.nextLine();
	
	System.out.println("Escribe tu primer apellido");
	
	String apellido1 = lector.nextLine();
	
	System.out.println("Escribe tu segundo apellido");
	
	String apellido2 = lector.nextLine();
	
	System.out.println("Hola " + apellido1 + " " + apellido2 + ", " + nombre);
	
	System.out.println("Cuantos años tienes?");
	
	int edad = lector.nextInt();
	
	if(edad<18){ 
		System.out.println(nombre +" eres menor");
	
	}else{ 
		System.out.println("eres mayor de edad");
	}
		
	}
}
