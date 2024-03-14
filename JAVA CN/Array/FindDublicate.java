package Array;

import java.util.Scanner;

public class FindDublicate {

    public static int dublicateNumber(int []arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i == j){
                    continue;
                }else if (arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static int [] takeInput(){
        Scanner s = new Scanner (System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int t = s.nextInt();
        for (int i = 1; i <= t; i++){
            int[] arr = takeInput();
            int ans = dublicateNumber(arr);
            System.out.println(ans);
        }
        s.close();
    }
}
