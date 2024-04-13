import java.util.Scanner;

public class CheckNumSequence {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int prev = s.nextInt();
        boolean isD = true;
        for (int i = 1 ; i < n ; i++){
            int curr = s.nextInt();
            if (prev == curr){
                System.out.println("false");
                return;
            }else if (prev < curr){
                isD = false;
            }else {
                if (isD == false){
                    System.out.println("false");
                    return;
                }
            }
        }
        System.out.println("true");
    }
}
