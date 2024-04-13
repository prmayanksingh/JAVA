package Test1;

import java.util.Scanner;

public class ZerosAndStarsPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int i = 1;
        int t = 1;
        int p = 2*n+1;
        while (i <= n){
            int j = 1;
            while (j <= 2*n+1){
                if (j == t){
                    System.out.print("*");
                }else if (j == p){
                    System.out.print("*");
                }else if(j == n+1){
                    System.out.print("*");
                }
                else {
                    System.out.print("0");
                }
                j++;
            }
            System.out.println();
            t++;
            p--;
            i++;
        }
    }
}
