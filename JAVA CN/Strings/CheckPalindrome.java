package Strings;

import java.util.Scanner;

public class CheckPalindrome {
    public static boolean checkPalindrome(String str){
        boolean palindrome = true;
        int i = 0;
        int j = str.length()-1;
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
        Scanner s = new Scanner (System.in);
        String str = s.nextLine();
        System.out.println(checkPalindrome(str));
    }
}
