package recursion;

public class all_index {
    public static int [] allindex (int input[],int x){
        return allindex(input, x, 0);
    }
    public static int [] allindex (int input[], int x, int startindex){
        // base case
        if (startindex == input.length){
            return new int[0];
        }

        // smallerproblem 
        int [] ans = allindex(input, x, startindex+1);

        // calculation
        if (input[startindex] != x){
            return ans;
        }else{
            int arr [] = new int [ans.length +1];
            arr[0] = startindex;
            for (int i = 1; i < arr.length; i++){
                arr[i] = ans[i-1]; 
            }
            return arr;
        }
    }
    public static void main(String[] args) {
        int []arr = {9,8,10,8,8};
        int [] ans = allindex(arr, 8);
        for (int i : ans){
            System.out.print(i + " ");
        }
    }
}
