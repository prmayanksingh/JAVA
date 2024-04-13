package practice;

public class arrfindunique {
    public static int findunique(int arr[]){
        for (int i = 0; i < arr.length; i++){
            int j;
            for (j = 0; j < arr.length; j++){
                if (j == i) continue;
                else if (arr[j] == arr [i]) break;         
            }
            if (j == arr.length){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {2,3,1,6,3,6,2};
        System.out.println(findunique(arr));
    }
}
