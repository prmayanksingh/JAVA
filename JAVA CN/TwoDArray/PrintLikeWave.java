package TwoDArray;

import java.util.Scanner;

public class PrintLikeWave {
    
    public static void wavePrint(int mat[][]){
        int count = 1;
        int col = 0;
        if (mat.length == 0){
            return;
        }
        int startrow = 0, endrow = mat.length - 1;
        while (count <= (mat.length * mat[0].length)){
            for (int i = startrow; i <= endrow; i++){
                System.out.print(mat[i][col] + " ");
                count++;
            }
            col++;
            for (int i = endrow; i >= startrow && col < mat[0].length; i--){
                System.out.print(mat[i][col] + " ");
                count++;
            }
            col++;
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
        int [][] arr = input();
        wavePrint(arr);
    }
}
