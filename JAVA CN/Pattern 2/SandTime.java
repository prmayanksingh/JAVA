import java.util.Scanner;

public class SandTime {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int t = n;
        for (int i = 1; i <= n/2 + 1; i++){
            for (int space = 1; space <= i-1; space++){
                System.out.print(" ");
            }
            for (int j = 1; j <= t; j++){
                if (i == 1){
                    System.out.print("*");
                }else if(j == 1 || j == t){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            t -= 2;
            System.out.println();
        }
        int k = n/2;
        for (int i = 1; i <= n/2; i++){
            for (int space = 1; space <= n/2 - i; space++){
                System.out.print(" ");
            }
            for (int j = 1; j <= k; j++){
                if (j == 1 || j == k){
                    System.out.print("*");
                }else if (i == n/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            k += 2;
            System.out.println();
        }
    }
}
