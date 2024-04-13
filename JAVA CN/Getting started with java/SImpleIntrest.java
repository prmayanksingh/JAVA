import java.util.Scanner;

public class SImpleIntrest {
    public static void main(String [] args){
        Scanner s = new Scanner (System.in);
        int principle = s.nextInt();
        double rate = s.nextDouble();
        int time = s.nextInt();

        int si = (int)((principle * rate * time)/100);

        System.out.println(si);
    }
}
