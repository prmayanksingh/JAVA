package Array;

import java.util.Scanner;

public class SortZeroAndOne {

    public static void sortZeroesAndOne(int[] arr){
        int nextZero = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                int temp = arr[nextZero];
                arr[nextZero] = arr [i];
                arr[i] = temp;
                nextZero += 1;
            }
        }
    }
    public static int[] takeInput(){
        Scanner s = new Scanner (System.in); 
        int size = s.nextInt();
        int input[] = new int[size];
        for (int i = 0; i < size; i++){
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int t = s.nextInt();
        for (int i = 1; i <= t; i++){
            int[] arr = takeInput();
            sortZeroesAndOne(arr);
            for (int p : arr){
                System.out.print(p + " ");
            }
        }
    }
}
