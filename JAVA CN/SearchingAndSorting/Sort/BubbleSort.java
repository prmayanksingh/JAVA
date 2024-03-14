package SearchingAndSorting.Sort;

import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(int [] arr){
        for (int i = 0; i < 5-1; i++){
            for (int j = 0; j < 4; j++){
                    if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
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
        int[] arr = {4,5,3,2,1};
        bubbleSort(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
