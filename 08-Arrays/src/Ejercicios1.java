
public class Ejercicios1 {

	public static void main(String[] args) {

		
//crear un array de 15 con numeros aleatorios entre 0 y 10
		
		int[] array_aleatorio = new int[15];
			for (int i = 0; i < array_aleatorio.length; i++)
				array_aleatorio[i] = (int)(Math.random()*10) ;
			
//sacar por pantalla todos los valores de una misma linea separados por una coma
		
		for (int i = 0; i < array_aleatorio.length; i++)
			System.out.print(array_aleatorio[i] + ", ");
		
//sacar la suma de todos los valores por pantalla
			
		int suma_array = 0;	
		for (int i = 0; i < array_aleatorio.length; i++)
				
			suma_array = suma_array + array_aleatorio[i];
			System.out.println("");
			System.out.println("\n Suma = " + suma_array);
			
//sacar la media de todos los valores			

			int media = 0;
			
			media = suma_array / array_aleatorio.length;
			
			System.out.println("\n Media del array = " + media);
			
//sacar el valor máximo del array
			int maximo = 0;
			
			for (int i = 0; i < array_aleatorio.length; i++)
				if(array_aleatorio[i] > maximo)
				maximo = array_aleatorio[i] ;
				System.out.println("\n Numero maximo del array = " + maximo);
			
			
			
	}

}
