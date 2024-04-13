package practice.twoDarray;

public class td_transpose_of_matrix {
    public static int [][] transpose (int [][] matrix){
        int [][] arr = new int[matrix.length][matrix[0].length];
        for (int j = 0; j < matrix[0].length; j++){
            for (int i = 0; i < matrix.length; i++){
                arr[j][i] = matrix[i][j];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int [][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] ans = transpose(mat);
        for (int i = 0; i < ans.length; i++){
            for (int j = 0; j < ans[0].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
