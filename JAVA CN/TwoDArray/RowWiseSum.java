package TwoDArray;

import java.util.Scanner;

public class RowWiseSum {

    public static void rowWiseSum(int [][] mat){
        for (int i = 0; i < mat.length; i++){
            int sum = 0;
            for (int j = 0; j < mat[0].length; j++){
                sum += mat [i][j];
            }
            System.out.println(sum + " ");
        }
    }

    public static int[][] input(){
        Scanner s = new Scanner (System.in);
        int rows = s.nextInt();
        int column = s.nextInt();
        int[][] arr = new int[rows][column];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < column; j++){
                arr [i][j] = s.nextInt();
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int t = s.nextInt();
        for (int i = 1; i <= t; i++){
            int [][] arr = input();
            rowWiseSum(arr);
        }        
    }
}
