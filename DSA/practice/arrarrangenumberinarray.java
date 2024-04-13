package practice;

public class arrarrangenumberinarray {

    public static int [] populate(int[] arr,int n){
        int point1 = 0, point2 = n-1,element = 1;
        while (point1 < point2){
            arr[point1++] = element++;
            arr[point2--] = element++;
        }
        if ((n & 1) == 1){
            arr[point1] = element;
        }
        return arr;
    }
    public static void main(String[] args) {
        int n = 6;
        int [] arr = new int[n];
        int [] arr1 = populate(arr, n);
        for (int i: arr1){
            System.out.print(i + " ");
        }
    }
}
