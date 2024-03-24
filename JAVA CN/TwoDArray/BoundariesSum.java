package TwoDArray;

import java.util.Scanner;

public class BoundariesSum {

    public static void totolSum(int [][] mat){
        int Sum = 0;
        int n = mat.length;

        // Boundary Sum
        for (int i = 0; i < n; i++){
            Sum += mat[0][i];
            Sum += mat[n - 1][i];
        }
        for (int i = 1; i < n - 1; i++){
            Sum += mat[i][0];
            Sum += mat[i][n - 1];
        }

         // Diagonal Sum
        for (int i = 1; i < n - 1; i++){
            Sum += mat[i][i];
            Sum += mat[i][n - 1 - i];
        }
        if (n % 2 != 0){
            Sum -= mat[n/2][n/2];
        }
        System.out.println(Sum);
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
        int [][] arr = input();
        totolSum(arr);
    }
}
