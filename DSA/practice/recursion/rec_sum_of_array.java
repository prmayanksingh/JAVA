package practice.recursion;

public class rec_sum_of_array {
    public static int sum (int [] arr){
        if (arr.length == 1){
           return arr[0]; 
        }
        int smallinput[] = new int [arr.length - 1];
        for (int i = 1; i < arr.length; i ++){
            smallinput[i-1] = arr[i];
        }
        return arr[0] + sum(smallinput);
    }
    public static void main(String[] args) {
        int [] arr = {9,8,9};
        System.out.println(sum(arr));
    }
}
