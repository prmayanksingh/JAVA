package practice.Strings;

public class st_reverse_string {
    public static String reverseString(String str){
        String reverseString = "";
        for (int i = str.length() - 1; i >= 0; i--){
            reverseString += str.charAt(i);
        }
        return reverseString;
    }
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(reverseString(str));
    }
}
