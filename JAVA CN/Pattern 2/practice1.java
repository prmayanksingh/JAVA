import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int i = 1;
        while (i <= n){
            int space = 1;
            while (space <= i - 1){
                System.out.print(" ");
                space++;
            }
            int j = i;
            while (j <= n){
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
            i++; 
        }
        int i2 = 1;
        int k = n;
        int t = n - 1;
        while (i2 <= n-1){
            int space = k-2;
            while (space >= 1){
                System.out.print(" ");
                space--;
            }
            int j = 1;
            int p = t;
            while (j <= i2+1){
                System.out.print(p + " ");
                p++;
                j++;
            }
            System.out.println();
            t--;
            k--;
            i2++;
        }
    }
}
