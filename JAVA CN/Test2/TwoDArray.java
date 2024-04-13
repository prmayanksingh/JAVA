package Test2;

public class TwoDArray {
    public static void print2DArray(int input[][]){
        int t = input.length;
        for (int outer = 0; outer < t; outer++){
            for (int k = 1; k <= t - outer; k++){
                for (int i = 0; i < input[0].length; i++){
                    System.out.print(input[outer][i] + " ");
                }
                System.out.println();
            }
        }
    }
}
