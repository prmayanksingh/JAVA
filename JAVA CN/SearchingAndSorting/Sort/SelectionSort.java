package SearchingAndSorting.Sort;

import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(int [] arr){
        for (int i = 0; i < arr.length-1; i++){
            int min = arr[i];
            int minindex = i;
            for (int j = i+1; j < arr.length; j++){
                if (arr[j] < min){
                    min = arr[j];
                    minindex = j;
                    
                }
            }
            if (minindex != i){
                arr[minindex] = arr[i];
                arr[i] = min;
            }
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
      selectionSort(arr);
      for (int i : arr){
        System.out.print(i + " ");
      }
    }
}
