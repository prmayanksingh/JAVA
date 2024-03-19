package TwoDArray;

import java.util.Scanner;

public class SquareMatrix {

    public static String squmat(int [][] arr,int m,int n){
        String str = "";
        if (m == n){
            System.out.println("YES");
        }else {
            System.out.println("NO");
            return str;
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                if (i == j){
                    str += arr[i][j] + " ";
                }
            }
        }
        return str;
    }

    public static int [] [] input(int m , int n){
        Scanner s = new Scanner (System.in); 
        int [][] arr = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int arr [] [] = input(m, n);
        System.out.println(squmat(arr, m, n));
    }
}
