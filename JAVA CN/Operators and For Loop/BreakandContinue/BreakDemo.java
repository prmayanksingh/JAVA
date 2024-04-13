package BreakandContinue;
import java.util.*;

public class BreakDemo {
    public static void main(String[] args) {
        
    Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        boolean divided = false;

        for (int d = 2;d < n;d++){
            if (n % d == 0){
                divided = true;
                break;
            }
        }
        if (divided){
            System.out.println("Not Prime");
        }else {
          System.out.println("Prime");
        }  
    }
}
