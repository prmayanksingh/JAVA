package Array;

import java.util.Scanner;

public class LargestInArray {

    public static int[] takeInput(){
        Scanner s = new Scanner (System.in);
        int size = s.nextInt();
        int input[] = new int[size];
        for (int i = 0; i < size; i++){
            input[i] = s.nextInt();
        }
        s.close();
        return input;
    }

    public static int largestInArray(int input[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < input.length;i++){
            if (input[i] > max){
                max = input[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = takeInput();
        int largest = largestInArray(arr);
        System.out.println("Largest" + largest);
    }
}
