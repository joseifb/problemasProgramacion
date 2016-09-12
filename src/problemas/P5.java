package problemas;

public class P5 {
    
    public static void main(String[] args) {
        Integer c = 0;
        for (int i = 0; i <= 100; i++) {
            if(i % 2 != 0){
                System.out.println(i);
                c++;
            }
        }
        System.out.println("El numero de impares es " + c);
    }
}
