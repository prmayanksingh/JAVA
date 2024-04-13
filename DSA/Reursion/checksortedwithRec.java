package Reursion;

public class checksortedwithRec {

    public static boolean checksorted(int []input){
        if (input.length <= 1){
            return true;
        }

        int [] smallinput = new int [input.length - 1];
        for (int i = 1; i < input.length; i++){
            smallinput[i - 1] = input[i];
        }
        boolean sorted = checksorted(smallinput);
        if (!sorted){
            return false;
        }
        if (input [0] < input[1]){
            return true;
        }else{
            return false;
        }
    }

    public static boolean checksorted_2(int []input){
        if (input.length <= 1){
            return true;
        }

        if (input[0] > input[1]){
            return false;
        }

        int [] smallinput = new int [input.length - 1];
        for (int i = 1; i < input.length; i++){
            smallinput[i - 1] = input[i];
        }
        boolean smallans = checksorted(smallinput);
        return smallans;
        // if (smallans){
        //     return true;
        // }else{
        //     return false;
        // }
    }

    // This function checls if the array is sorted from startIndex to end
    public static boolean checkSortedBetter(int input[],int startIndex){
        if (startIndex >= input.length - 1){
            return true;
        }
        if (input[startIndex] > input[startIndex + 1]){
            return false;
        }
        boolean smallans = checkSortedBetter(input, startIndex + 1);
        return smallans;
    }

    public static void main(String[] args) {
        int [] arr = {2,1,3,4,5,6};
        System.out.println(checkSortedBetter(arr, 0));
        // System.out.println(checksorted_2(arr));
        
     }
}
