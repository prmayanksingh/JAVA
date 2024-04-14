package practice.SerchingAndSorting;

public class sr_insertion_sort {
    public static void insertion_sort (int [] arr){
        for (int i = 0; i < arr.length  ; i++){
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int arr[] = {8,1,9,3,7,2};
        insertion_sort(arr);
        for (int i : arr){
            System.err.print(i + " ");
        }
    }
}
