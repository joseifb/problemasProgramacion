package problemas;

import java.util.Arrays;
import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		
		System.out.println("Ingrese los 5 numeros");
		
		 String entradaTeclado = "";
	     Scanner entradaScanner = new Scanner(System.in);
		
		int array[] = new int[5];
	
		 
		 for (int i = 0; i <= array.length; i++) {
			 System.out.println("Ingrese "+i+" numero");
			        array[i] = Integer.parseInt(entradaScanner.nextLine());
			        
			      
			}
		 
		 Arrays.sort(array);  
		 System.out.println(array[0]);

		 System.out.println("Minimo = " + array[0]);  
		 System.out.println("Maximum = " + array[array.length-1]); 
		 

	}

}
