package Test1;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        boolean isArm = false; 
        int num = n;
        int k = n;
        int dig = 0;
        while (num != 0){
            dig = dig + 1;
            num = num/10;
        }
        int t = 0;
        int sum = 0;
        while (k != 0){
            t = k % 10;
            k = k / 10;
            sum = sum + (int)Math.pow(t,dig);
        }
        if (n == sum){
            isArm = true;
        }
        System.out.println(isArm);
    }
}
