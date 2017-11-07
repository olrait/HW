
public class Ejercicios2 {

	public static void main(String[] args) {
	
		
// rellenar un array con números pares entre 1 y 100.
		
		
		int[] pares = new int[50];
		int indice = 0;
	
		for(int numero=1; numero<=100; numero++ )
			if(numero%2 == 0){
				//numero es par
				//guardarlo en array
				pares[indice] = numero;
				indice++;
			}
		
	
		for (int i=0; i<pares.length; i++)
		System.out.println(pares[i]);
	
	

}
}
