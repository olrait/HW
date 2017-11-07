
public class Variables {

	public static void main(String[] args)
	{
		/*
		 Declaracion de la variable -a-
		 -a- Es un identificador de usuario
		 */
		
	byte a   = 127;			//variable entera de 8 bits
	short b  = 32767;		//Entero corto de 16 bits
	int c    = -2000000000;	//Entero de 32 bits
	long d   = 16L;			//Entero de 64 bits
	
	float e  = 3.15f;		//Variable de coma flotante de 32 bits
	double f = 3.1416;		//Variable de coma flotante de 64 bits
	
	boolean g = true;		//Variable booleana da true o false
	char h    = '\n';		//Variable de 16 bits
    String i  = "Este es une jemplo de cadena";		//variable de cadena
	
	System.out.println("Suma de a + b es: "+ (a+b));
	System.out.println("Resta de a -b es: "+ (a-b));
	System.out.println("Multiplicacion de a * b es: "+ (a*b));
	System.out.println("Division de a / b es: "+ ((double)a/b));				//
	System.out.println("Resto de la de visión entera: "+ ((double)a%b));
	}
}
