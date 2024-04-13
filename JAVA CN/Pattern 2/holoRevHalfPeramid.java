public class holoRevHalfPeramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++){
            for (int space = 1; space <= n - i; space++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                if (j == 1 || j == i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        int t = 1;
        for (int i = n - 1; i >= 1; i--){
            for (int space = 1; space <= t; space++){
                System.out.print(" ");
            }
            t++;
            for (int j = 1; j <= i; j++){
                if (j == 1 || j == i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
