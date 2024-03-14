package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SwapAlternate {

    public static void swapAlternate(int[] arr){
        for (int i = 0; i < arr.length-1; i += 2){
            if (i+1 < arr.length){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        // for (int i : arr){
        //     System.out.print(i + " ");
        // }
        System.out.println(Arrays.toString(arr));
    }

    public static int [] takeInput(){
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int [] input = new int[n];
        for (int i = 0; i < n; i++){
            input [i] = s.nextInt();
        }
        return input;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int t = s.nextInt();
        for (int i = 1; i <= t; i++){
           int [] arr = takeInput();
           swapAlternate(arr);
        }
    }
}
