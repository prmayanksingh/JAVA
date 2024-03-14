package Array;

import java.util.Scanner;

public class ArrangeNumArray {
    public static void Arrange (int arr[],int n){
        int pointA = 0, pointB = n - 1, element = 1;
        while (pointA < pointB){
            arr[pointA++] = element++;
            arr[pointB--] = element++;
        }
        if ((n & 1) == 1){
            arr[pointA] = element;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        Arrange(arr,n);

        for (int i : arr){
            System.out.print(i + " ");
        }

        // for (int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }
        System.out.println(arr);
    }
}
