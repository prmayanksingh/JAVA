package TwoDArray;

import java.util.Scanner;

public class QuaryAndMatrix {
    public static int []query (int [][] mat, int m, int n,String[] Q){
        int [] ans = new int[Q.length];
        int index = 0;
        for (int q = 0; q < Q.length; q++){
            if (Q[q].charAt(0) == '1'){
                if (Q[q].charAt(1) == 'R'){
                    for (int i = 0; i < n; i++){
                        int temp = mat[i][Q[q].charAt(2) - '0'];
                        if (temp == 0){
                            mat[Q[q].charAt(2)][i] = 1;
                        }else if (temp == 1){
                            mat[Q[q].charAt(2)][i] = 0;
                        } 
                    }
                }else if(Q[q].charAt(1) == 'C'){
                    for (int i = 0; i < m; i++){
                        int temp = mat[Q[q].charAt(2) - '0'][i];
                        if (temp == 0){
                            mat[i][Q[q].charAt(2)] = 1;
                        }else if (temp == 1){
                            mat[i][Q[q].charAt(2)] = 0;
                        } 
                    } 
                }
            }else if (Q[q].charAt(0) == '2'){
                int total = 0;
                if (Q[q].charAt(1) == 'R'){
                    for (int i = 0; i < n; i++){
                        if (mat[i][Q[q].charAt(2)] == 0){
                            total++;
                        }
                    }
                }else if(Q[q].charAt(1) == 'C'){
                    for (int i = 0; i < m; i++){
                        if (mat[Q[q].charAt(2)][i] == 0){
                            total++;
                        }
                    }                    
                }
                ans [index] = total;
                index++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int t = s.nextInt();
        for (int i = 1; i <= t; i++){
        int m = s.nextInt();
        int n = s.nextInt();
        int [] [] arr = new int[m][n];
        int q = s.nextInt();
        String [] Q = new String[q];
        for (int j = 0; j < q; j++){
            Q [j] = s.next();   
        }
        int [] ans = query(arr, m, n, Q);
        for (int j : ans){
            System.out.println(j + " ");
        }
        }
    }
}
