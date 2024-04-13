package practice;

public class sr_pair_sum {
    public static int pairsum(int [] arr1, int [] arr2){
        sort(arr1);
        sort(arr2);
        int i = 0 , j = 0, mindiff = arr1[0] - arr2[0];
        while (i < arr1.length && j < arr2.length){
            mindiff = Math.min(mindiff, Math.abs(arr1[i] - arr2[j]));
            if (arr1[i] < arr2[j]){
                i++;
            }else{
                j++;
            }
        }
        return mindiff;
    }
    public static void sort (int arr[]){
        for (int i = 1; i < arr.length; i++){
            int j = i-1;
            int temp = arr[i];
            while (j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
    public static void main(String[] args) {
        int arr1[] = {12,7,5};
        int arr2[] = {4,4,6};
        System.out.println(pairsum(arr1, arr2));
    }
}
