import java.util.Scanner;

public class Print1toN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;

       while (i <= n) {
         System.out.println(i);
        i = i + 1;
       }

    }
}