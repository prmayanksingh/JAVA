package Array;

import java.util.Scanner;

public class IntersectionOfTwoArray {

    public static void intersections(int arr1[], int arr2[]){
            int n1 = arr1.length;
            int n2 = arr2.length;
        for (int i = 0; i < n1; i++){
            for (int j = 0; j < n2; j++){
                if (arr1[i] == arr2[j]){
                    System.out.print(arr1[i] + " "); 
                    arr2[j] = Integer.MIN_VALUE;   
                    break;
                }
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
            int[] arr1 = takeInput();
            int[] arr2 = takeInput();
            intersections(arr1,arr2);
        }
    }
}
