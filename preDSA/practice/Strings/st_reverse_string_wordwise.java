package practice.Strings;

public class st_reverse_string_wordwise {
    public static String reversestring(String str){
        String reverse = "";
        int end = str.length();
        for (int start = str.length()-1; start >= 0; start--){
            if (str.charAt(start) == ' ' || start == 0){
                reverse += str.substring(start, end);
                end = start+1;
            }
        }
        return reverse;
    }
    public static void main(String[] args) {
        String str = "Welcome to Coding Ninjas";
        System.out.println(reversestring(str));
    }
}
