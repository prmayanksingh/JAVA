import java.util.Scanner;

public class SumTillN {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        
        /* int i = 1;
        int sum = 0;
        while (i <= n){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
        */

        int sum = 0;
        for (int i = 1;i <= n;i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
