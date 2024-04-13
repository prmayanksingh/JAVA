import java.util.Scanner;

public class Arrow {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++){
            for (int space = 1; space <= n - i; space++){
                if (space == i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <= i; j++){
                if (j == 1 || j == i){
                    System.out.print("*");
                }else if (i == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
