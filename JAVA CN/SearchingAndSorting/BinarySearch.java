package SearchingAndSorting;

import java.util.Scanner;

public class BinarySearch {

    public static int search (int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = (start + end)/2;
            if (arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else if(arr[mid] > target){ // we can put just else
                end = mid - 1;
            }
        }
        return -1;
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
        Scanner s = new Scanner (System.in);
        int[] arr = takeInput();
        int target = s.nextInt();
        int ans = search(arr, target);
        System.out.println(ans);
    }
}
