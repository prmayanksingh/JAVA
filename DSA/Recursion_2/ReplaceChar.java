package Recursion_2;

public class ReplaceChar {

    public static String replaceCharacter(String input, char c1, char c2){
        if (input.length() == 0) return "";

        String temp = replaceCharacter(input.substring(1), c1, c2);

        if (input.charAt(0) == c1) return (c2 + temp);
        return (input.charAt(0)+temp);
    }

    public static void main(String[] args) {
        String str = "abcada";
        char c1 = 'a';
        char c2 = 'x';
        System.out.println(replaceCharacter(str, c1, c2));
    }
}