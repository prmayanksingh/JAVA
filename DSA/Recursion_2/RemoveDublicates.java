package Recursion_2;

public class RemoveDublicates {

    public static String removeConsecutiveDuplicates(String s){
        if (s.length() <= 1) return s;

        String temp = removeConsecutiveDuplicates(s.substring(1));

        if (s.charAt(0) == temp.charAt(0)) return temp;
        return s.charAt(0) + temp;
    }

    public static void main(String[] args) {
        String str = "aabccdaa";
        System.out.println(removeConsecutiveDuplicates(str));
    }
}