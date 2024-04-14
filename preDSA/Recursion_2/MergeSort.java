package Recursion_2;

public class MergeSort {

    public static void mergeSort(int[] arr, int i, int r){
        if (i >= r) return;

        int mid = (i + r)/2;
        // Part 1
        mergeSort(arr, i, mid);
        // Part 2
        mergeSort(arr, mid + 1, r);
        merge(arr, i, r);
    }

    private static void merge(int[] input, int sI, int eI){
        int mid = (sI + eI) / 2;

        int [] arr = new int [eI - sI + 1];
        int i = sI;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= eI){
            if (input[i] < input [j]){
                arr [k] = input[i];
                i++;
                k++;
            }else{
                arr [k] = input [j];
                k++;
                j++;
            }
        }
        while (i <= mid){
            arr [k] = input[i];
            i++;
            k++;
        }
        while (j <= eI){
            arr [k] = input[j];
            j++;
            k++;
        }
        for (int index = 0; index < arr.length; index++){
            input[sI + index] = arr [index];
        }        
    }

    public static void main(String[] args) {
        int [] arr = {1,2,4,6,5,7,3,9};
        mergeSort(arr, 0, 7);
        for (int i : arr){
            System.out.print(i);
        }
    }
}
