import java.util.Scanner;

public class InvertedNumberPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner ( System.in);
        int n = s.nextInt();
        int i = 1;
        int t = n;
        while (i <= n){
            int j = 1;
            while (j <= n - i + 1){
                System.out.print(t);
                j++;
            }
            System.out.println();
            t--;
            i++;
        }
    }
}

