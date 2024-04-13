package practice.twoDarray;

public class td_square_matrix {
    public static String sqrmat(int [][] mat){
        String str = "";
        if (mat.length == mat[0].length){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[0].length; j++){
                if (i == j){
                    str += mat[i][j];
                }
            }
        }
        return str;
    }
    public static void main(String[] args) {
        int arr [][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sqrmat(arr) + " ");        
    }
}
