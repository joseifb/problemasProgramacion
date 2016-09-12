
package problemas;

import java.util.Scanner;

public class P8 {
    
    public void preguntar(){
        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in);
        entradaTeclado = entradaEscaner.nextLine();
        switch(entradaTeclado.toLowerCase()){
                case "s": System.out.println("OK");
                    break;
                case "n": System.out.println("Osh");
                    break;
                default: System.out.println("Entrada no valida");
                        this.preguntar();
                    break;
            }
        }

    public P8() {
    preguntar();
    }
    
    
    public static void main(String[] args) {
    System.out.println("Ingrese s/n");
    P8 problema = new P8();
    problema.preguntar();
    }
    
}
