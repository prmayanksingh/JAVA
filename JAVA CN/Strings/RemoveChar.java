package Strings;

import java.util.Scanner;

public class RemoveChar {

    public static String removeAllOccurrencesOfChar(String str, char ch){
        String ans = "";
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != ch){
                ans += str.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        String str = s.nextLine();
        char c = s.next().charAt(0);
        System.out.println(removeAllOccurrencesOfChar(str, c));
        s.close();
    }
}
