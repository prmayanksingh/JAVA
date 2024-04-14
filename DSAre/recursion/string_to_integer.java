package recursion;

public class string_to_integer {
    public static int strTOint (String str) {
        // base case
        if (str.length() == 0) return 0;

        // smaller problem 
        int ans = strTOint(str.substring(1));

        // calculation
        return (str.charAt(0) - '0') * (int)Math.pow(10, str.length()-1) + ans;
    }
    public static void main(String[] args) {
        String str = "1234";
        System.out.println(strTOint(str));
    }
}
