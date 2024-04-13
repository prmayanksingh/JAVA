package practice.recursion;

public class rec_last_index {
    public static int lastindex (int input[], int x){
        return lastindex(input, x, input.length)
    }
   
    public static int lastindex (int input [], int x, int lastindex){
        if (lastindex < 1){
            return -1;
        }
        if (input[lastindex] == x){
            return lastindex;
        }
        return lastindex(input, x, --lastindex);
    }
    public static void main(String[] args) {
        int arr [] = {9,8,10,8};
        System.out.println(lastindex(arr, 0));
    }
}
