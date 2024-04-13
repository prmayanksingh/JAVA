package practice.twoDarray;

public class td_row_wise_traversal {
    public static int [] traversal (int arr[][]){
        int ans [] = new int[arr.length * arr[0].length];
        int put = 0;
        for (int i = 0; i < arr[0].length; i++){
            for (int j = 0; j < arr.length; j++){
                ans[put] = arr[j][i];
                put++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [][]arr = {{1,2,3,4},{5,6,7,8}};
        int [] ans = traversal(arr);
        for (int i: ans){
            System.out.print(i + " ");
        }
    }
}
