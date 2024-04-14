package Reursion;

public class LastIndex_2 {
    public static int startindex(int input[], int x){
        return startindex(input, x, 0);
    }

    public static int startindex(int input[], int x,int startindex){
        if (startindex == input.length){
            return -1;
        }
        int ans = startindex(input, x, startindex + 1);
        if (ans != -1){
            return ans;
        }
        if (input[startindex] == x){
            return startindex;
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        System.out.println(startindex(arr, 2));
    }
}
