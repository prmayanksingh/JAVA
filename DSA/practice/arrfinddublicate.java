package practice;

public class arrfinddublicate {
    public static int dublicate (int [] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (i == j){
                    continue;
                }else if (arr [i] == arr [j]){
                    return arr[j];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {0,7,2,5,4,7,1,3,6};
        System.out.println(dublicate(arr));
    }
}
