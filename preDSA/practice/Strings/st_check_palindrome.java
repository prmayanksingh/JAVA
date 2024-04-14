package practice.Strings;

public class st_check_palindrome {
    public static boolean isPalindrome(String str){
        boolean palindrome = true;
        int i = 0, j = str.length() -1;
        while (i < j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return palindrome;
    }
    public static void main(String[] args) {
        String str = "abccba";
        System.out.println(isPalindrome(str));
    }
}
