import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner s = new Scanner ( System.in);
        int n = s.nextInt();
        int t = 0;
        int i = 2 ;
        while (i <= n-1){
            if (n % i == 0){
               System.out.print(i + " ");
               t = 1;
            }
            i++;
        }
        if (t == 0){
            System.out.println("-1");
        }
    }
}

