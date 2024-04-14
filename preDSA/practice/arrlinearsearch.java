package practice;

import java.util.Scanner;

public class arrlinearsearch {
    public static int linearsearch(int []arr , int x){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    public static int[] insertelement (){
        Scanner s = new Scanner  (System.in);
        int n = s.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }
        return arr;
    }
    public static void main (String[]args){
        Scanner s = new Scanner (System.in);
        int t = s.nextInt();
        for (int i = 1; i <= t; i++){
            int arr[] = insertelement();
            int l = s.nextInt();
            System.out.println(linearsearch(arr, l));
        }
        s.close();
    }
}
