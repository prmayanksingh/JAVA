package Test1;

import java.util.Scanner;

public class NumberStarPattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int t = n;
        int p = n;
        int i = 1;
        while (i <= n){
            int j = 1;
            while (j <= n){
                if (j == p){
                    System.out.print("*");
                }else{
                System.out.print(t);
                }
                t--;
                j++;
            }
            System.out.println();
            t = n;
            p--;
            i++;
        }
    }
}
