package SearchingAndSorting.Sort;

public class SortZeroOneTwo {

    public static void sort(int [] arr){
        int i = 0;
        int start = 0;
        int end = arr.length - 1;
        while (i <= end){
            int temp;
            if (arr[i] == 0){
                temp = arr[i];
                arr[i] = arr[start];
                arr[start] = temp;
                start++;
                i++;
            }else if(arr[i] == 2){
                temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
                end--;
            }else if(arr[i] == 1){
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {2,0,2,1,0,0};
        sort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
