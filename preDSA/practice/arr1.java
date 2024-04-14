package practice;

public class arr1 {
    public static void main (String [] args){
        int sum = 0;
        int [] arr = {1,2,3,4};
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}