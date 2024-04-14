package practice;

public class arr_pairsum {
    public static int pairsum(int arr[], int x){
        int total = 0;
        for (int i = 0; i < arr.length-1; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] + arr[j] == x){
                    total++;
                }
            }
        }
        return total;
    }
    public static void main (String [] args){
        int [] arr = {1,3,6,2,5,4,3,2,4};
        System.out.println(pairsum(arr, 3));
    }
}
