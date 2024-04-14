package practice.SerchingAndSorting;

public class srcodebinarysearch {
    public static int binarysearch (int [] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = (start + end)/2;
            if (arr[mid] == target){
                return mid;
            }else if (arr[mid] < target){
                start = mid + 1;
            }else if (arr[mid] > target){
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,7,9,11,12,45};
        System.out.println(binarysearch(arr, 3));
    }
}
