package Reursion;

public class AllIndex {

    public static int[] allIndexes(int input[], int x){
        return allIndexes(input, x, 0);
    }

    public static int[] allIndexes(int input[], int x,int startIndex){
        // Base Case
        if (startIndex == input.length){
            return new int[0];
        }

        // Smaller Problem
        int smallans[] = allIndexes(input, x, startIndex + 1);

        // Calculation
        if (input[startIndex] == x){
            int []ans = new int[smallans.length + 1];
            // ans [0] = startIndex;
            for (int i = 0; i < ans.length; i++){
                if (i == 0) ans [0] = startIndex;
                else ans[i] = smallans[i - 1];
            }
            return ans;
        }
        return smallans;
    }

    public static void main(String[] args) {
        int []arr = {1,2,4,2,3,2};
        int []ans = allIndexes(arr, 2);
        for (int i : ans){
            System.out.print(i + " ");
        }
    }
}
