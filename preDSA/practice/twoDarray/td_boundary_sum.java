package practice.twoDarray;

public class td_boundary_sum {
    public static void boundarySum(int [][] mat){
        if (mat.length == 0){
            return;
        }
        int sum = 0;
        int upperRow = 0, lowerRow = mat.length - 1;
        int upperCol = 0, lowerCol = mat[0].length - 1;
        
        for (int i = upperCol; i <= lowerCol; i++){
            sum += mat [upperRow][i];
        }
        upperRow++;

        for (int i = upperRow; i <= lowerRow; i++){
            sum += mat[i][lowerCol];
        }
        lowerCol--;

        for (int i = lowerCol; i >= upperCol; i--){
            sum += mat[lowerRow][i];
        }
        lowerRow--;

        for (int i = lowerRow; i >= upperRow; i--){
            sum += mat[i][upperCol];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int arr [][] = {{1,2,3},{4,5,6},{7,8,9}};
        boundarySum(arr);
    }
}
