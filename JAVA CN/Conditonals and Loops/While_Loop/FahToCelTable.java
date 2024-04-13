import java.util.Scanner;

public class FahToCelTable {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int S = s.nextInt(); // Start Fahrenheit
        int E = s.nextInt(); // End Fahrenheit
        int W = s.nextInt(); // Step Size

        while (S <= E){
            int C = (int)((5.0/9)*(S - 32));
            System.out.println(S + " " + C );
            S += W;
        }
    }
}
