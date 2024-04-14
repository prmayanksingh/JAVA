package practice.twoDarray;

public class td_row_wise_sum {
    public static void rowWiseSum(int [][] mat){
        int n = mat.length;
        if (n == 0) return;
        int m = mat[0].length;
        for (int i = 0; i < n; i++){
            int sum = 0;
            for (int j = 0; j < m; j++){
                sum += mat[i][j];
            }
            System.out.println(sum + " ");
        }
    }
    public static void main(String[] args) {
        int arr [][] = {{1,2},{3,4},{5,6},{7,8}};
        rowWiseSum(arr);
    }
}
