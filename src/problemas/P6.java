
package problemas;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero: ");
        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in);
        entradaTeclado = entradaEscaner.nextLine();
        Integer l = Integer.parseInt(entradaTeclado);
        for (int i = 0; i <= l; i++) {
            System.out.println(i);
        }
    }
}
