package practice.SerchingAndSorting;

public class sr_selection_sort {
    public static void selection_sort(int arr[]){
        for (int i = 0; i < arr.length-1; i++){
            int min = i;
            int j;
            for (j = i+1; j < arr.length; j++){
                if (arr[j] < arr[min]){
                    min = j; 
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String[] args) {
        int [] arr = {2,6,3,1,5,9,4};
        selection_sort(arr);
        for (int i : arr){
            System.err.print(i + " ");
        }
    }
}
