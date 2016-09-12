package problemas;

import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
	     System.out.println("Ingrese un numero");
	        String entradaTeclado = "";
	        Scanner entradaScanner = new Scanner(System.in);
	        entradaTeclado = entradaScanner.nextLine();
	        Integer valor = Integer.parseInt(entradaTeclado);
	        for (int i = 1; i <= valor; i++) {
	            if(i % 3 == 0){
	                System.out.println(i);
	            } 
	        }

	}

}
