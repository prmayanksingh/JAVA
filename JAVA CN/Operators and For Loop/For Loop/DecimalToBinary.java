import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int rem = 1;
        int num = 0;
        for (int i = 1 , t ; n > 0 ; i++){
            t = n % 2;
            n = n/2;
            rem = rem * 10 + t;
        }
        for (int j = 1 , t; rem > 1 ; j++){
            t = rem % 10;
            rem = rem/10;
            num = num * 10 + t;
        }
        System.out.println(num);
        s.close(); 
    }
}
