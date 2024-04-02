package Reursion;

public class FirstIndex {

    public static int firstIndex(int input[], int x){
        return firstIndex(input, x , 0);
    }

    public static int firstIndex(int input[], int x,int startIndex){
        if (startIndex == input.length){
            return -1;
        }
        if (input[startIndex] == x){
            return startIndex;
        }
        return firstIndex(input, x, startIndex + 1);
        // return firstIndex;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,2,3};
        int x = 2;
        System.out.println(firstIndex(arr, x));
    }
}
