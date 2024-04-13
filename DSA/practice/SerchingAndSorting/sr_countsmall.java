package practice.SerchingAndSorting;

public class sr_countsmall {
    public static int [] countsmall(int arr1[], int arr2[]){
        int ans[] = new int [arr1.length];
        for (int i = 0; i < arr1.length; i++){
            int t = 0;
            for (int j = 0; j < arr2.length; j++){
                if (arr1[i] >= arr2[j]){
                    t++;
                }
            }
            ans[i] = t;
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr1 = {0,2,3};
        int [] arr2 = {1,5};
        int [] ans = countsmall(arr1, arr2);
        for (int i : ans){
            System.out.print(i + " ");
        }
    }
}
