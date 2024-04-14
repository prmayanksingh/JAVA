package Reursion;

public class ReplacePi {

    public static String replace(String input){
        // Base Case
        if (input.length() <= 1) return input;

        // Smaller Problem
        String temp = replace(input.substring(1));

        // Calculation
        if (input.charAt(0) == 'p' && temp.charAt(0) == 'i'){
            temp = "3.14" + temp.substring(1);
            return temp;
        }
        return (input.charAt(0) + temp); 
    }

    public static void main(String[] args) {
        String str = "xpixpix";
        System.out.println(replace(str));
    }
}
