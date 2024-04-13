import java.util.Scanner;

public class ParallelogramPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner ( System.in);
        int n = s.nextInt();
        int i = 1;
        while (i <= n){
            int space = 1;
            int p = i - 1;
            while (space <= p){
                System.out.print(" ");
                space++;
            }
            int j = 1;
            while (j <= n){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
