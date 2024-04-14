package practice.Strings;

public class st_compress_the_string {
    public static String getCompressedString (String str){
        String ans = "";
        int i,count = 1;
        for (i = 1; i < str.length(); i++){
            // count = 1;
            if (str.charAt(i) == str.charAt(i - 1)){
                count ++;
            }else {
                ans += str.charAt(i-1);
                if (count > 1){
                    ans += count;
                }
                count = 1;
            }
        }
        ans += str.charAt(i - 1);
        if (count > 1){
            ans += count;
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "aaaabbbbcca";
        System.out.println(getCompressedString(str));
    }
}
