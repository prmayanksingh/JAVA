package SearchingAndSorting.Sort;

import java.util.Scanner;

public class SmallestDiff {

    public static int smallestDifferencePair(int []arr1, int m, int[] arr2, int n){
        sort(arr1);
        sort(arr2);
        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        while (i < m && j < n){
            min = Math.min(min , Math.abs(arr1[i]-arr2[j]));
            if (arr1[i] < arr2[j]){
                i++;
            }else{
                j++;
            }
        }
        return min;
    }

    public static void sort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && arr[j] > temp){
                arr [j+1] = arr[j];
                j--;
            }
            arr [j+1] = temp; 
        }
    }

    public static int [] takeInput(int n){
        Scanner s = new Scanner (System.in);
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int t = s.nextInt();
        for (int i = 1; i <= t; i++){
            int m = s.nextInt();
            int n = s.nextInt();
            int [] arr1 = takeInput(m);
            int [] arr2 = takeInput(n);
            int ans = smallestDifferencePair(arr1, m, arr2, n);
            System.out.println(ans);
        }
    }
}
