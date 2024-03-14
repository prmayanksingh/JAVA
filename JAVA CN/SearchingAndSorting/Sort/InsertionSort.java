package SearchingAndSorting.Sort;

import java.util.Scanner;

public class InsertionSort {

    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    public static int[] takeInput(){
    Scanner s = new Scanner (System.in);
    int size = s.nextInt();
    int [] arr = new int[size];
        for (int i = 0; i < size; i++){
            arr [i] = s.nextInt(); 
        }
        return arr; 
    }
    public static void main(String[] args) {
        int[] arr = takeInput();
        insertionSort(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
