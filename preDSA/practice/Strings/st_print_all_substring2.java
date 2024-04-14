package practice.Strings;

public class st_print_all_substring2 {
    public static void printsubstring (String str){
        // for (int i = 0; i < str.length(); i++){
        //     int start = 0;
        //     for (int end = i; end < str.length(); end++){
        //         System.out.print(str.substring(start, end+1) + " ");
        //         start++;
        //     }
        // }
        for (int len = 1; len <= str.length(); len++){
            for (int start = 0; start <= str.length() - len; start++){
                int end = start + len - 1;
                System.out.println(str.substring(start, end+1));
            }
        }        
    }
    public static void main(String[] args) {
        String str = "pqrs";
        printsubstring(str);
    }
}