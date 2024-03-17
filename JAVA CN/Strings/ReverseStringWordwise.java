package Strings;

public class ReverseStringWordwise {
    public static String reverseWordwise(String input){
        String ans = "";
        // int start = 0;
        // int i = 0;
        // for (; i < input.length(); i++){
        //     if (input.charAt(i) == ' '){
        //         int end = i - 1;
        //         String temp = "";
        //         for (int j = start; j <= end; j++){
        //             temp += input.charAt(j);
        //         }
        //         ans = temp + ' ' + ans;
        //         start = i+1;
        //     }
        // }
        // int end = i - 1;
        //         String temp = "";
        //         for (int j = start; j <= end; j++){
        //             temp += input.charAt(j);
        //         }
        //         ans = temp + ' ' + ans;
        // return ans;
        int endWord = input.length()-1;
        for (int i = input.length()-1; i >= 0; i--){
            if (input.charAt(i) == ' '){
                int startWord = i + 1;
                String temp = "";
                for (int j = startWord; j <= endWord; j++){
                    temp += input.charAt(j);
                }
                ans +=temp + ' ';
                endWord = i - 1;
            }
        }
        int startWord = 0;
            String temp = "";
            for (int j = startWord; j <= endWord; j++){
                temp += input.charAt(j);
            }
            ans += temp;
        return ans;
    }
    public static void main(String[] args) {
        String str = "Welcome to Coding Ninjas";
        System.out.println(reverseWordwise(str));
    }
}
