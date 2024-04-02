package Reursion;

public class checknumber {

    public static boolean checkNumber(int input[], int x){
        if (input.length == 1){
            if (input[0] == x){
                return true;
            }else{
                return false;
            }
        }
        int [] smallinput = new int [input.length - 1];
        for (int i = 1; i < input.length; i++){
            smallinput[i - 1] = input[i];
        }

        boolean smallans = checkNumber(smallinput, x);
        if (smallans){
            return smallans;
        }else{
            if (input[0] == x){
                    return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int x = 2;
        System.out.println(checkNumber(arr, x));
    }
}