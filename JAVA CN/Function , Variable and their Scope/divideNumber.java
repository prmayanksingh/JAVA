public class divideNumber {

    public static int divideNumber(int num , int den){                                                         
        if (den == 0){
            return Integer.MIN_VALUE;
        }
        System.out.println("Instide division function");
        return num / den;
    }
    public static void printDivisionResult(int num , int den){
        if (den == 0){
            // exit the function
            System.out.println("Division by Zero is not allowed");
            return;
        }
        System.out.println(num / den);
    }
    public static void main(String[] args) {
        int num = 8;
        int den = 0;
        printDivisionResult(num, den);
        // int result = divideNumber(num,den);
        // System.out.println(result);
    }
}
