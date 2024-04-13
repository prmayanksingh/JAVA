package practice.SerchingAndSorting;

public class sr_merge2sortedarray {
    public static int [] merge(int [] arr1, int [] arr2){
        int []ans = new int[arr1.length + arr2.length];
        int i = 0, j = 0, idx = 0;
        while (i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[j]){
                ans [idx] = arr1[i];
                i++;
                idx++;
            }else {
                ans [idx] = arr2[j];
                j++;
                idx++;
            }
        }
        while (i < arr1.length){
            ans [idx] = arr1[i];
            i++;
            idx++;
        }
        while (j < arr2.length){
            ans [idx] = arr2[j];
            j++;
            idx++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr1[] = {1,3,5,7,9};
        int arr2[] = {2,4,6,8};
        int ans[] = merge(arr1, arr2);
        for (int i : ans){
            System.out.print(i + " ");
        }
    }
}
