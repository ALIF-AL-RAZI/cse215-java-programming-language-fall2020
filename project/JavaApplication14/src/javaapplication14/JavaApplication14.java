
package javaapplication14;
import java.util.*;

public class JavaApplication14 {

    public static void main(String[] args) {
        
        int n;
        
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        
        for(int i=1; i<=10; i++ ){
            
            int r= i*n;
            System.out.println(n+"*"+i+"="+r);
        }
    }
    
}
