package Strings;

import java.util.Scanner;

public class CountWords {

    public static int countWords(String str){
        int count = 1;
        for (int i = 0; i < str.length(); i++){ // for (char c : sentence.toCharArray())
            if (str.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        String str = s.nextLine();
        int ans = countWords(str);
        System.out.println(ans);
    }
}
