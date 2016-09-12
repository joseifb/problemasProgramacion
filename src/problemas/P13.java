package problemas;

public class P13 {

	public static void main(String[] args) {
		Integer count = 0;
        for (int i = 0; i <= 100; i++) {
    
            
            if(i % 2 == 0){
            	System.out.println(i);
            	count = count + i;
            	
            }
            else if(i % 3 == 0) {
            	System.out.println(i);
            	count = count + i;
            	
            }
        }

        System.out.println("Contador: "+count);

	}

}
