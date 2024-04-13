import java.util.Scanner;

public class relational {
    public static void main (String [] args){
        Scanner s = new Scanner (System.in);
        int i = s.nextInt();
        int j = s.nextInt();

        boolean isEq = (i == j);
        boolean nEq = (i != j);
        boolean isgr = (i > j);
        boolean isgreq = (i >= j);
        boolean isLess = (i < j);
        boolean isLesseq = (i <= j);
        
        System.out.println("Is Equaql " + isEq);
        System.out.println("Is Not Equal " + nEq);
        System.out.println("Is Greater " + isgr);
        System.out.println("Is Greater Equal " + isgreq);
        System.out.println("Is less " + isLess);
        System.out.println("Is Less Equal To " + isLesseq);

    }
}
