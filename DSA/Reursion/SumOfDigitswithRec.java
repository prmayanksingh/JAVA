package Reursion;

public class SumOfDigitswithRec {
    
    public static int SumOfDigits(int input){
        if (input == 1 || input == 0) return input;
        return (SumOfDigits(input/10) + (input % 10));
    }
    public static void main(String[] args) {
        int n = 122345;
        System.out.println(SumOfDigits(n));
    }
}