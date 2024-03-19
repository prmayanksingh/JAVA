package Strings;

public class ReverseEachWord {
    public static String reverseEachWord(String str){
        String ans = "";
        int startWord = 0;
        int i = 0;
        for (;i < str.length(); i++){
            if (str.charAt(i) == ' '){
                // Reverse current Word
                int endWord = i - 1;
                String reverse = "";
                for (int j = startWord; j <= endWord; j++){
                    reverse = str.charAt(j) + reverse;
                }
                // Add it to final
                ans += reverse + ' ';
                startWord = i + 1;
            }
        }
        int endWord = i - 1;
            String reverse = "";
                for (int j = startWord; j <= endWord; j++){
                    reverse = str.charAt(j) + reverse;
                }
                // Add it to final
                ans += reverse;
        return ans;
    }
    public static void main(String[] args) {
        String str = "abc def ghi";
        System.out.println(reverseEachWord(str));
    }
}
