package practice.Strings;

public class st_remove_consecutive_dublicates {
    public static String consdub(String str){
        String ans = "";
        int temp = 0;
        for (int end = temp +1; end < str.length(); end ++){
            if (str.charAt(end) != str.charAt(temp)){
                ans += str.charAt(temp);
                temp = end;
            }
        }
        ans += str.charAt(temp);
        return ans;
    }
    public static void main(String[] args) {
        String str = "aabbccaa";
        System.out.println(consdub(str));
    }
}
