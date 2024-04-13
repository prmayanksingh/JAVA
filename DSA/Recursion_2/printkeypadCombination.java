package Recursion_2;

public class printkeypadCombination {

    public static String []singleDigit(int n){
        if (n == 0){
            String output[] = {""};
            return output;
        }else if (n == 1){
            String output[] = {""};
            return output;
        }else if (n == 2){
            String output[] = {"a","b","c"};
            return output;
        }else if (n == 3){
            String output[] = {"d","e","f"};
            return output;
        }else if (n == 4){
            String output[] = {"g","h","i"};
            return output;
        }else if (n == 5){
            String output[] = {"j","k","l"};
            return output;
        }else if (n == 6){
            String output[] = {"m","n","o"};
            return output;
        }else if (n == 7){
            String output[] = {"p","q","r","s"};
            return output;
        }else if (n == 8){
            String output[] = {"t","u","v"};
            return output;
        }else{
            String output[] = {"w","x","y","z"};
            return output;
        }
    }    

    public static String [] printKeypadH(int input){
        if (input == 0){
            String output[] = {""};
            return output;
        }
        String [] smallans = printKeypadH(input/10);
        String [] singleNum = singleDigit(input%10);
        String [] output = new String[smallans.length * singleNum.length]; 
        int k = 0;
        for (int i = 0; i < smallans.length; i++){
            for (int j = 0; j < singleNum.length; j++){
                output [k] = smallans[i] + singleNum[j];
                k++;
            }
        }
        return output;
    }

    public static void printKeypad(int input){
        String []ans = printKeypadH(23);
        for (int i = 0; i < ans.length; i++){
            System.out.println(ans[i]);
        }          
    }

    public static void main(String[] args) {
        printKeypad(23);
    }
}
