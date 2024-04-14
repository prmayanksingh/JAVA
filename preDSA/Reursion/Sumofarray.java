package Reursion;

public class Sumofarray {

    public static int sum(int []input){
        if(input.length == 1){
            return input[0];
        }

        int [] smallinput = new int [input.length - 1];
        for (int i = 1; i < input.length; i++){
            smallinput[i - 1] = input[i];
        }
        int sum = input[0] + sum(smallinput);
        return sum;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.err.println(sum(arr));
    }
}