
public class Main_array {

	public static void main(String[] args) {
		int[] numeros; //se define el array
		numeros = new int[8]; //se crea el array

		//Asignar valores al array
		numeros[0] = 3;
		numeros[1] = 34;
		numeros[5] = 9;
		numeros[7] = (int) (Math.random()*10);
		numeros[6] = 26;
		
		System.out.println(numeros[7]);
		System.out.println(numeros[6]);

		int[] notas =new int[25];
		notas[0] = 0;
		notas[1] = 9;
		int suma_de_notas;
		suma_de_notas = notas[0] + notas[1] + notas[3];
		
		System.out.println("la suma de notas es " + suma_de_notas);
		
		
		
		int numero_de_alumnos = 24;
		int[] notas1 = new int[numero_de_alumnos];
		
		//rellenar el array notas con 0s
		for(int i =0; i<numero_de_alumnos; i++)
			notas1[i] = 0;
		
		
		//Sacar por pantalla todos los dias de la semana
		
		String[] semana = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
				
			for (int i =0; i<semana.length; i++)
				System.out.println(semana[i]);
				
	}			

}
