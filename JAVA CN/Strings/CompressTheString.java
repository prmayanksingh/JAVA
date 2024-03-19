package Strings;

public class CompressTheString {

    public static String getCompressedString(String str){
        String ans = "";
        int count = 1;
        for (int i = 1; i < str.length(); i++){
            if (str.charAt(i) == str.charAt(i - 1)){
                count++;
            }else{
                ans += str.charAt(i - 1);
                if (count > 1){
                    ans += count;
                }
                count = 1;
            }
        }
        ans += str.charAt(str.length() - 1);
        if (count > 1){
            ans += count;
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "aaabbcdsa";
        System.out.println(getCompressedString(str));
    }
}
