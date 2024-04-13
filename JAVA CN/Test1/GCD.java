package Test1;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int i = 1;
        while (i <= n){
            int x = s.nextInt();
            int y = s.nextInt();
            int g = 0;
            int j = 1;
            while (j <= x){
                if (x % j == 0 && y % j == 0){
                    g = j;
                }
                j++;
            }
            System.out.println(g);
            i++;
        }
    }
}
