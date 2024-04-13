import java.util.Scanner;

public class ALLPrimeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        for (int i = 2 ; i <= n ; i++){
            int d;
            int t = 0;
            for (d = 2 ; d <= i -1 ; d++){
                if (i % d == 0){
                    t = 1;
                    break;
                }
            }
            if (t == 1){
                continue;
            }else {
                System.out.println(i);
            }
        }
        s.close();
    }
}