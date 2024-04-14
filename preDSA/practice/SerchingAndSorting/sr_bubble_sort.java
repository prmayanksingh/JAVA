package practice.SerchingAndSorting;

public class sr_bubble_sort {
    public static void bubble_sort(int arr[]){
        for (int i = arr.length-1; i > 0; i--){
            for (int j = 0; j <= i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr [] = {4,2,1,5,7,8,9,6,3};
        bubble_sort(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
