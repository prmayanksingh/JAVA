import java.util.Scanner;

public class InterestingAlphabates {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int i = 1;
        while (i <= n){
            int j = 1;
            char c = (char)('A' + n - i);
            while (j <= i){
                System.out.print(c);
                c++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
