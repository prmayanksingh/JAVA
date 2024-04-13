import java.util.Scanner;

public class shrPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int t = 1;

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(t);
                if (j != i){
                    System.out.print("*");
                }
                t++;
            }
            System.out.println();
        }
        int k = t - (n);
        int b = n - 1;
        for (int i = n; i >= 1; i--){
            int a = k;
            for (int j = 1; j <= i; j++){
                System.out.print(a);
                if (j != i){
                    System.out.print("*");
                }
                a++;
            }
            k -= b;
            b--;
            System.out.println();
        }
    }
}
