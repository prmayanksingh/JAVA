import java.util.Scanner;

public class MultiplationTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1 ;
        while (i <= 10){
            int m = n * i ;
            System.out.println(m);
            i += 1;
        }
    }
}
