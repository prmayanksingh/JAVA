package practice.twoDarray;

public class td_spiral {
    public static void sprialPrint(int matrix [][]){
        if(matrix.length == 0){
            return;
        }
        int total = matrix.length * matrix [0].length;
        int count = 0;
        int upperRow = 0,lowerRow = matrix.length - 1;
        int upperCol = 0, lowerCol = matrix[0].length - 1;

        while (count <= total){
            for (int i = upperCol; i <= lowerCol; i++){
                System.out.print(matrix[upperRow][i] + " ");
                count++;
            }
            upperRow++;

            for (int i = upperRow; i <= lowerRow; i++){
                System.out.print(matrix[i][lowerCol] + " ");
                count++;
            }
            lowerCol--;

            for (int i = lowerCol; i >= upperCol; i--){
                System.out.print(matrix[lowerRow][i] + " ");
                count++;
            }
            lowerRow--;

            for (int i = lowerRow; i >= upperRow; i--){
                System.out.print(matrix[i][upperCol] + " ");
                count++;
            }
            upperCol++;
        }
    }
    public static void main(String[] args) {
        int arr [][] = {{1,2,3,4},{14,16,16,5},{13,20,17,6},{12,19,18,7},{11,10,9,8}};
        sprialPrint(arr);
    }
}
