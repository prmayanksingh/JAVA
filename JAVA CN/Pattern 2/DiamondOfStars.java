import java.util.Scanner;

public class DiamondOfStars {
    public static void main(String[] args) {
        Scanner s = new Scanner ( System.in);
        int n = s.nextInt();
        int n1 = (n+1)/2;
        int n2 = n/2;
        int i1 = 1;
        while (i1 <= n1){
            int space = 1;
            while (space <= n1 - i1){
                System.out.print(" ");
                space++;
            }
            int j = 1;
            while (j <= 2*i1 -1){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i1++;
        }
        int i2 = n2;
        while (i2 >= 1){
            int space = 1;
            while (space <= n2 - i2 +1){
                System.out.print(" ");
                space++;
            }
            int j = 1;
            while (j <= 2*i2 -1){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i2--;
        }
    }
}
