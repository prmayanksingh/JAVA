package practice;

public class arr_sort01 {
    public static void sort01 (int arr[]){
        int nextzero = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[nextzero];
                arr[nextzero] = temp;
                nextzero++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,1,1,0,1,0,1};
        sort01(arr);
        for (int i:arr){
            System.out.print(i + " ");
        }
    }
}
