package practice.recursion;

public class rec_check_num_in_array {
    public static boolean checkNum (int input[], int x){
        if (input.length == 1){
            if (input[0] == x){
                return true;
            }else{
                return false;
            }
        }
        if (input [0] == x){
            return true;
        }
        int smallinput[] = new int [input.length - 1];
        for (int i = 1; i < input.length; i ++){
            smallinput[i-1] = input[i];
        }
        boolean present = checkNum(smallinput, x);
        return present;
    }
    public static void main(String[] args) {
        int [] arr = {9,8,10};
        System.out.println(checkNum(arr, 8));
    }
}
