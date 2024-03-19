package Strings;

public class HigestOccuringChar {

    public static char higestOurringChar(String str){
        int [] arr = new int[256];
        for (int i = 0; i < str.length(); i++){
            arr[str.charAt(i)] += 1;
        }
        int max = 0;
        char c = 0;
        for (int check = 0; check < str.length(); check++){
            if (arr[str.charAt(check)] > max){
                c = str.charAt(check);
                max = arr[str.charAt(check)];
            } 
        }
        return c;
    }
    public static void main(String[] args) {
        String str = "abcabasa";
        System.out.println(higestOurringChar(str));
    }
}
