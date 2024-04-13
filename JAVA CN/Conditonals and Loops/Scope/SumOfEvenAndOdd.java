import java.util.Scanner;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int sum_e = 0;
        int sum_o = 0;
        while (n != 0 ){
            int d = n % 10;
            n = n / 10 ;
            if (d % 2 == 0){
                sum_e = sum_e + d; 
            }
            else{
                sum_o = sum_o + d;
            }
        }
       System.out.println("Sum of Even ->" + " " + sum_e);
       System.out.println("Sum of Odd ->" + " " + sum_o);
    }
}
