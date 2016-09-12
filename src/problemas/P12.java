package problemas;

public class P12 {

	public static void main(String[] args) {
		Integer pares = 0;
		Integer impares = 0;
        for (int i = 0; i <= 100; i++) {
    
            System.out.println(i);
            if(i % 2 == 0){
            	pares = pares + i;
            	
            }
            else {
            	impares = impares + i;
            	
            }
        }
        System.out.println("Suma Pares: "+pares);
        System.out.println("Suma Impares: "+impares);

	}

}
