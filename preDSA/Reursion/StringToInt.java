package Reursion;

public class StringToInt {

    public static int convertStringToInt(String input){
        if (input.length() <= 1) return (input.charAt(0) - '0');

        int temp = convertStringToInt(input.substring(1));

        return (((input.charAt(0) - '0') * (int)Math.pow(10, input.length() -1)) + temp);
    }

    public static void main(String[] args) {
        String str = "0012349";
        System.out.println(convertStringToInt(str));
    }
}
