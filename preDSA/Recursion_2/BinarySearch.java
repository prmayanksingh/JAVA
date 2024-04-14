package Recursion_2;

public class BinarySearch {

    public static int search(int [] nums,int target){
        return search(nums, target,0,nums.length - 1);
    }

    public static int search(int [] nums,int target,int start, int end){
        if (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return search(nums, target, mid + 1, end);
            } else {
                return search(nums, target, start, mid - 1);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1,3,7,9,11,12,45};
        System.out.println(search(arr, 3));
    }
}
    // public static int search(int[] nums, int target) {
    //     return binarySearch(nums, target, 0, nums.length - 1);
    // }

    // private static int binarySearch(int[] nums, int target, int start, int end) {
    //     if (start <= end) {
    //         int mid = start + (end - start) / 2;

    //         if (nums[mid] == target) {
    //             return mid;
    //         } else if (nums[mid] < target) {
    //             return binarySearch(nums, target, mid + 1, end);
    //         } else {
    //             return binarySearch(nums, target, start, mid - 1);
    //         }
    //     }

    //     return -1;
    // }

    // public static void main(String[] args) {
    //     // Example usage
    //     int[] nums1 = {1, 3, 7, 9, 11, 12, 45};
    //     int target1 = 12;
    //     System.out.println(search(nums1, target1)); // Output: 1

    //     // int[] nums2 = {1, 2, 3, 4, 5, 6, 7};
    //     // int target2 = 9;
    //     // System.out.println(search(nums2, target2)); // Output: -1
    // }
// }
