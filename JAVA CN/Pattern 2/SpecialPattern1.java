import java.util.Scanner;

public class SpecialPattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int i = 1;
        int p = 2;
        while (i <= n){
            int j1 = 1;
            while (j1 <= i){
                System.out.print("*");
                j1++;
            }
            int space = 1;
            int t = 2 * n - p;
            while (space <= t){
                System.out.print(" ");
                space++;
            }
            p += 2;
            int j2 = 1;
            while (j2 <= i){
                System.out.print("*");
                j2++;
            }
            System.out.println();
            i++;
        }
        i = 1;
        int t = 0;
        int k = n;
        while (i <= n){
            int j3 = 1;
            while (j3 <= k){
                System.out.print("*");
                j3++;
            }
            int space = 1;
            while (space <= t){
                System.out.print(" ");
                space++;
            }
            t += 2;
            int j4 = 1;
            while (j4 <= k){
                System.out.print("*");
                j4++;
            }
            System.out.println();
            k = k - 1;
            i++;
        }
    }
}
