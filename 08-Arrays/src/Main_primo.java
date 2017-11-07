
public class Main_primo {

	public static void main(String[] args) {
		//Saber si un numero es primo
		
		int numero = 11;
		boolean es_primo = true;
		
		for(int i = 2; i<numero && !es_primo; i++){
			if(numero%i == 0){
				es_primo = false;
				//break;
			}
		}

		if(es_primo){
			System.out.println(numero + " es primo");
		}else{
			System.out.println(numero + " no es primo");
		}
		
	}

}
