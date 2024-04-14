package recursion;

public class replace_pi {
    public static String replacePi (String str){
        // base case
        if (str.length() == 0) return "";

        // smaller problem
        String ans = replacePi(str.substring(1, str.length()));

        // calculation
        if (str.charAt(0) == 'p' && str.charAt(1) == 'i'){
            return ans = 3.14 + ans.substring(1);
        }
        return str.charAt(0) + ans;
    }
    public static void main(String[] args) {
        String str = "xpix";
        System.out.println(replacePi(str));
    }
}
