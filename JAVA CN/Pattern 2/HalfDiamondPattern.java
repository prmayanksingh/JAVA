import java.util.Scanner;

public class HalfDiamondPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int i1 = 1;
        System.out.println("*");
        while (i1 <= n){
            int j = 1;
            System.out.print("*");
            while (j <= i1){
                System.out.print(j);
                j++;
            }
            j = 1;
            int p = i1 - 1;
            while (j <= i1 -1){
                System.out.print(p);
                p--;
                j++;
            }
            System.out.print("*");
            System.out.println();
            i1++;
        }
        // now the 2nd part:
        int i2 = n -1;
        while (i2 >= 1){
            int j1 = 1;
            System.out.print("*");
            while (j1 <= i2){
                System.out.print(j1);
                j1++;
            }
            int t = j1 - 1;
            int k = t -1;
            int j2 = 1;
            while (j2 <= t-1){
                System.out.print(k);
                j2++;
                k--;
            }
            System.out.print("*");
            System.out.println();
            i2--;
        }
        System.out.print("*");
    }
}

