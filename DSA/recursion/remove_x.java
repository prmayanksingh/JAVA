package recursion;

public class remove_x {
    public static String removex (String str){
        // base case
        if (str.length() == 0) return "";
        
        // smaller problem 
        String ans = removex(str.substring(1));

        // calculation
        if (str.charAt(0) == 'x'){
            return ans;
        }
        return str.charAt(0) + ans;
    }
    public static void main(String[] args) {
        String str = "xaxbx";
        System.out.println(removex(str));
    }
}
