public class holoDiaomand {
    public static void main(String[] args) {
        int n = 5;
        int t = 1;
        for (int i = n; i >= 1; i--){
            for (int j = i; j >= 1; j--){
                System.out.print("*");
            }
            for (int space = 1; space <= 2*t - 2; space++){
                System.out.print(" ");
            }
            t++;
            for (int j = i; j >= 1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        int a = 2*n;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for (int space = 1; space <= a-i-1; space++){
                System.out.print(" ");
            }
            a -= 1;
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
