package practice.Strings;

public class st_reverse_each_word {
    public static String reverse (String str){
        String ans = "";
        int start = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' '){
                int end = i - 1;
                String reverse = "";
                for (start = 0; start <= end; start++){
                    reverse = str.charAt(start) + reverse;
                }
                ans += reverse +' ';
                start = i +1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "Welcome to Coding Ninjas";
        System.out.print(reverse(str));
    }
}
