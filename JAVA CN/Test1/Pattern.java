package Test1;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int p = 1;
        while (p <= n){
            int k = s.nextInt();
            int t = k;
            int i = 1;
             while (i <= k){
               int space = 1;
               while (space <= i - 1){
                 System.out.print(" ");
                 space++;
                }
                int j = 1;
                  while (j <= t){
                System.out.print("*");
                j++;
                }
               System.out.println();
               i++;
               t--;
            }
            p++;
        }
    }

}

