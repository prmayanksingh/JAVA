package TwoDArray;

import java.util.Scanner;

public class RowWiseTraversal {

    public static int [] printRowWise(int [][]a) {
        int[] ans = new int [a.length * a[0].length];
        int put = 0; 
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                ans [put] = a[i][j];
                put++;
            }
        }
        return ans;
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
            int [] ans = printRowWise(arr);
            for (int j : ans){
                System.out.print(j + " ");
            }
        }
    }
}
