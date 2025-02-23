package Reursion;

public class Palindrome {
    
    public static boolean isPalindrome(String str){
        return isPalindrome(str, 0, str.length()-1);
    }

    public static boolean isPalindrome(String str,int i, int j){
        if (i >= j) return true;

        if (str.charAt(i) != str.charAt(j)) return false;

        return isPalindrome(str, i +1, j -1);
    }
    public static void main(String[] args) {
        String str = "aabbaa";
        System.out.println(isPalindrome(str));
    }
}
