import java.util.Scanner;

public class ASCIIvalue {
    public static void main (String []args){
        Scanner s = new Scanner (System.in);
        char c = s.next().charAt(0);
        int i = (int) c;

        System.out.println(i);
    }
    
}
