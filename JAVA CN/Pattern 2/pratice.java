public class pratice {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        System.out.println("*");
        while (i <= n){
            int t = 1;
            int j = 1;
            while (j <= i){
                if (j == 1){
                    System.err.print("*");
                }
                System.out.print(t);
                t++;
                j++;
            }
            while (t > 1){
                if (t-2 == 0){
                    break;
                }
                System.out.print(t-2);
                t--;
            }
            System.out.print("*");
            System.out.println();
            i++;
        }
        int i2 = n - 1;
        while (i2 >= 1){
            int j = 1;
            while (j <= i2){
                if (j == 1){
                    System.out.print("*");
                }
                System.out.print(j);
                j++;
            }
            while (j - 2 >= 1){
                System.out.print(j-2);
                j--;
            }
            System.out.print("*");            
            System.out.println();
            i2--;
        }
        System.out.print("*");
    }
}
