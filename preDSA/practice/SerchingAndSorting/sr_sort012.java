package practice.SerchingAndSorting;

public class sr_sort012 {
    public static void sort012(int [] arr){
        int i = 0;
        int start = 0, end = arr.length -1;
        while (i <= end){
            int temp;
            if (arr[i] == 0){
                temp = arr[i];
                arr[i] = arr[start];
                arr[start] = temp;
                start++;
                i++;
            }else if (arr[i] == 2){
                temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
                end--;// i ++ is not here cause it is double checking
            }else {
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,0,1,2,0,1,0};
        sort012(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
