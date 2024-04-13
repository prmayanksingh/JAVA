public class Pattern2b {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        while (i <= n){
            int j = 1;
            while (j <= i - 1){
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= n - i + 1){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
