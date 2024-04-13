public class OddSquare {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        while (i <= n){
            int t = 2 * i -1;
            int j = 1;
            while (j <= n){
                System.out.print(t);
                t = t + 2;

                int maxvalue = (2 * n) -1;
                if (t > maxvalue){
                    t = 1;
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
