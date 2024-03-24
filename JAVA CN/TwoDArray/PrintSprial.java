package TwoDArray;

import java.util.Scanner;

public class PrintSprial {

    public static void spiralPrint(int matrix[][]){
        int upperRow = 0, lowerRow = matrix.length;
        if (matrix.length == 0){
            return;
        }
        int upperCol = 0, lowerCol = matrix[0].length;
        int totalElem = matrix.length * matrix[0].length;
        int count = 0;
        while (count < totalElem){
            for (int i = upperCol; count < totalElem && i < lowerCol; i++){
                System.out.print(matrix[upperRow][i] + " ");
                count++;
            }
            upperRow++;
            for (int i = upperRow; count <totalElem &&  i < lowerRow; i++){
                System.out.print(matrix[i][lowerCol] + " ");
                count++;
            }
            lowerCol--;
            for (int i = lowerCol; count < totalElem &&  i > upperCol; i--){
                System.out.print(matrix[lowerRow][i] + " ");
                count++;
            }
            lowerRow--;
            for (int i = lowerRow; count < totalElem &&  i > upperRow; i--){
                System.out.print(matrix[i][upperCol] + " ");
                count++;
            }
            upperCol++;
        }
    }

    public static int [][] takeinput(){
        Scanner s = new Scanner (System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        int [][] arr = new int [r][c];
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int [][] arr = takeinput();
        spiralPrint(arr);
    }
}
