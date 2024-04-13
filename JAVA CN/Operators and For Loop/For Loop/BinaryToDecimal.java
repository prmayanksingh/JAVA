import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int num = 0;
        for (int i = 1 , t ; n > 0 ; i*=2){
            t = n % 10;
            n = n/10;
            num = i * t + num;
        }
        System.out.println(num);
    }
}
