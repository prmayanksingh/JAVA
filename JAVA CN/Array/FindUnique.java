package Array;

import java.util.Scanner;

public class FindUnique {
    public static int findUnique (int [] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            int j;
            for (j = 0; j < n; j++){
                if (j == i){
                    continue;
                }else if (arr[i] == arr[j]){
                    break;
                }
            }
            if (j == n){
            return arr [i];
            }
        }
        return -1;
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
            int ans = findUnique(arr);
            System.out.println(ans);
        }
    }
}
