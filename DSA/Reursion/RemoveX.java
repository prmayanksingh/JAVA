package Reursion;

public class RemoveX {

    public static String removeX(String input){
        // Base Case
        if (input.length() <= 0) return "";

        // Smaller Problem
        String temp = removeX(input.substring(1));

        // Calculation
        if (input.charAt(0) == 'x') return temp;
        return (input.charAt(0) + temp);
    }

    public static void main(String[] args) {
        String str = "xaxbx";
        System.out.println(removeX(str));   
    }
}
