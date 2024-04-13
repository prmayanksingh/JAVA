package Strings;

public class RemConsecutiveDublicates {

    public static String removeConsecutiveDublicates(String str){
        String ans = "";
        char c = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != c){
                ans += str.charAt(i);
                c = str.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "xxyyzxx";
        System.out.println(removeConsecutiveDublicates(str));
    }
}
