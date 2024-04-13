import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        // int t = (int)java.lang.Math.sqrt(n);
        // System.out.println(t);
        int p = 0;
        for (int i = 1,t = 0; i*i <= n ; i++){
            t = i*i;
            if (t == n){
                System.out.print(i);
                return;
            }
            p = i;
        }
        System.out.println(p);
    }
}
