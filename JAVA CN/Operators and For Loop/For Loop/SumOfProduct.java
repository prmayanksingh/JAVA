import java.util.Scanner;

public class SumOfProduct {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int c = s.nextInt();
        int sum = 0;
        int product = 1;
        for (int i = 1 ; i <= n ; i++){
            sum = sum + i;
        }
        for (int j = 1 ; j <= n ; j++){
            product = product * j;
        }
        if (c == 1){
            System.out.println(sum);
        }else if (c == 2){
            System.out.println(product);
        }else {
            System.out.println("-1");
        }
        s.close();
    }
}
