package TwoDArray;

import java.util.Scanner;

public class TransposeOfaMatrix {

    public static int [][] transpose(int m,int n, int [][] mat){
        int [][] ans = new int[n][m];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                ans [j][i] = mat[i][j];
            }
        }
        return ans;
    }

    public static int [][] takeinput(int m,int n){
        Scanner s = new Scanner (System.in);
        int [][] arr = new int [m][n];
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
        int [][] arr = takeinput(m, n);
        int [][] ans = transpose(m, n, arr);
        System.out.println("Transpose Matrix is");
        for (int[] i : ans){
            for (int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }    
}
