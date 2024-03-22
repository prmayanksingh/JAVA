package TwoDArray;

import java.util.Scanner;

public class LargestRowOrColumn {

    public static void findLargest(int [] [] mat){
        int max = Integer.MIN_VALUE;
        boolean isRow = true;
        int index = 0;
        if (mat.length == 0){
            System.out.println("row " + index + " " + max);
            return;
        }

        // Row wise traversal
        for (int i = 0; i < mat.length; i++){
            int sum = 0;
            for (int j = 0; j < mat[0].length; j++){
                sum += mat[i][j];
            }
            if (sum > max){
                max = sum;
                index = i;
            }
        }
        // Column wise traversal 
        for (int i = 0; i < mat[0].length; i++){
            int sum = 0;
            for (int j = 0; j < mat.length; j++){
                sum += mat[j][i];
            }
            if (sum > max){
                max = sum;
                index = i;
                isRow = false;
            }
        }
        if (isRow){
            System.out.println("row " + index + " " + max);
        }else{
            System.out.println("column " + index + " " + max);
        }
    }

    public static int [] [] input(){
        Scanner s = new Scanner (System.in); 
        int m = s.nextInt();
        int n = s.nextInt();
        int [][] arr = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int [][] arr = input();
        findLargest(arr);
    }
}
