import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int i = 1;
        int t = i;
        while (i <= n){
            int j = 1;
            while (j <= i){
                System.out.print(t);
                j++;
            }
            System.out.println();
            i++;
        }
    }
} 
