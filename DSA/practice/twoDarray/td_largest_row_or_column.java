package practice.twoDarray;

public class td_largest_row_or_column {
    public static void findlargest (int mat [][]){
        int row = Integer.MIN_VALUE;
        int rowidx = 0;
        int column = Integer.MIN_VALUE;
        int columnidx = 0;
        // row wise traversal
        for (int i = 0; i < mat.length; i++){
            int sum = 0;
            for (int j = 0; j < mat[0].length; j++){
                sum += mat[i][j];
            }
            if (sum > row){
                row = sum;
                rowidx = i;
            }
        }
        // column wise traversal
        for (int i = 0; i < mat[0].length; i++){
            int sum = 0;
            for (int j = 0; j < mat.length; j++){
                sum += mat[j][i];
            }
            if (sum > column){
                column = sum;
                columnidx = i;
            }
        }      
        if (row > column){
            System.out.println("row " + rowidx + " " + row);
        }else{
            System.out.println("column " + columnidx + " " + column);
        }
    }
    public static void main(String[] args) {
        int [][] mat = {{6,9},{8,5},{9,2}};
        findlargest(mat);
    }
}
