package Array;

import java.util.Scanner;

public class PairSum {
    public static int pairSum(int arr[], int x){
        int n = arr.length;
        int t = 0;
        for (int i = 0; i < n-1; i++){
            for (int j = i+1; j < n; j++){
                if (arr[i] + arr[j] == x){
                    t += 1;
                }
            }
        }
        return t;
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
            int x = s.nextInt();
            int ans = pairSum(arr, x);
            System.out.println(ans);
        }
    }
}
