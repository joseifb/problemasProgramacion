
package problemas;

import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        String entradaTeclado = "";
        System.out.println("Introduce un numero");
        Scanner entradaScanner = new Scanner(System.in);
        entradaTeclado = entradaScanner.nextLine();
        Integer valor = Integer.parseInt(entradaTeclado);
        if (valor == 0) {
            System.out.println("Es Cero");
        } else {
            if(valor > 0){
                System.out.println("Es positivo");
            } else {
                System.out.println("Es negativo");
            }
        }
    }
    
}
