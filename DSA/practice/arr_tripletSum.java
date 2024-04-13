package practice;

public class arr_tripletSum {
    public static int findTriplet(int arr[], int x){
        int total = 0;
        for (int i = 0; i < arr.length-2; i ++){
            for (int j = i+1; j < arr.length-1; j++){
                for (int k = j+1; k < arr.length; k++){
                    if (arr[i] + arr[j] + arr[k] == x){
                        total++;
                    }
                }
            }
        }
        return total;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        System.out.println(findTriplet(arr, 12));
    }
}
