import java.util.Scanner;

public class TermsOfAP {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        for (int i = 1 , k = 1 , t , j ; i <= n ; i++,k = j + 1){
            for (j = k;;j++){
                t = 3*j + 2;
                if (t % 4 == 0){
                    continue;
                }else{
                    System.out.print(t +" ");
                    break;
                }
            }
        }
    } 
}
