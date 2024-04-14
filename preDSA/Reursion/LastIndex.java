package Reursion;

public class LastIndex {

    public static int lastIndex(int input[], int x){
        return lastIndex(input, x, input.length - 1);
    }

    public static int lastIndex(int input[], int x,int lastIndex){
        if (lastIndex < 0){
            return -1;
        }
        if (input[lastIndex] == x){
            return lastIndex;
        }
        return lastIndex(input, x, lastIndex - 1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        System.out.println(lastIndex(arr, 2));
    }
}
