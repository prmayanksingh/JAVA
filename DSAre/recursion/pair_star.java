package recursion;

public class pair_star {
    public static String pairstar (String str){
        // base case
        if (str.length() == 1) return str;

        // smaller problem 
        String ans = pairstar(str.substring(1));

        //calculation
        if (str.charAt(0) == str.charAt(1)){
            return str.charAt(0) + "*" + ans;
        }
        return str.charAt(0) + ans;
    }
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(pairstar(str));
    }
}
