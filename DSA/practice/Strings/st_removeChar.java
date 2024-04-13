package practice.Strings;

public class st_removeChar {
    public static String removeChar (String str, char ch){
        String ans = "";
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != ch){
                ans += str.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "aabccbaa";
        System.out.println(removeChar(str, 'a'));
    }
}
