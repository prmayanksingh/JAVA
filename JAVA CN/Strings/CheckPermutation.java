package Strings;

import java.util.Scanner;

public class CheckPermutation {
    public static boolean isPermutation(String str1, String str2){
        // for (int i = 0; i < str1.length(); i++){
        //     for (int j = 0; j < str2.length(); j++){
        //         if (str1.charAt(i) == str2.charAt(j) ){ 
        //             break;
        //         }else if (j == str2.length()-1){
        //             return false;
        //         }
        //     }
        // }
        // return true;

        // Above code is wrong for str1 = aba; and str2 = bab;  
        int [] arr = new int [256];  
        for (int i = 0; i < str1.length(); i++){
            arr [str1.charAt(i)] += 1;
        }
        for (int j = 0; j < str2.length(); j++){
            arr [str2.charAt(j)] -= 1;
        }
        for (int check = 0; check < arr.length; check++){
            if (arr[check] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        String str1 = s.next();
        String str2 = s.next();
        System.out.println(isPermutation(str1, str2));
    }
}
