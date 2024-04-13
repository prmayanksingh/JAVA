import java.util.Scanner;

public class SandTimeOpp {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n/2 + 1; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for (int space = 1; space <= n - i * 2; space++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
