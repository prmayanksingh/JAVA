package Strings;

public class PrintAllSubstring {
    public static void printAllSubString(String str){
        for (int len = 1; len <= str.length(); len++){
            // we have to print all strings with length as "len"
            for(int start = 0; start <= str.length() - len ; start++){
                int end = start + len - 1;
                System.out.println(str.substring(start , end + 1) + " ");
            }
        }
        // for (int start = 0; start < str.length(); start++){
            // We will be printing all substring starting with char at index start 
        //     for (int end = start; end < str.length(); end++){
        //         System.out.print(str.substring(start , end+1) + " ");
        //     }
        // }
    }
    public static void main(String[] args) {
        String str = "abcd";
        printAllSubString(str);
    }
}
