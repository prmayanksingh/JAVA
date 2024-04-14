package practice.twoDarray;

public class td_printlikeawave {
    public static void printwave(int [][] mat){
        int count = 0;
        int col = 0;
        if (mat.length == 0){
            return; 
        }
        while (count < mat[0].length * mat.length){
            for (int i = 0; i < mat.length; i++){
                System.out.print(mat[i][col] + " ");
                count++;
            }
            col++;
            for (int row = mat.length-1; row >= 0 && col < mat[0].length; row--){
                System.out.print(mat[row][col] + " ");
                count++;
            }
            col++;        
        }
    }
    public static void main(String[] args) {
        int [][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        printwave(mat);
    }
}
