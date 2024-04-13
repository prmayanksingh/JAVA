import java.util.Scanner;

public class CharPattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int i = 1;
        while (i <= n){
            char StartingPoint = (char) ('A' + i -1) ;
            int j = 1;
            while (j <= n){
                System.out.print(StartingPoint);
                StartingPoint++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
