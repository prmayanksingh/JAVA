package practice.recursion;

public class rec_number_of_digits {
    public static int print_digit (int n){
        if (n <= 0){
            return 0;
        }
        return 1 + print_digit(n/10);
    }
    public static void main(String[] args) {
        System.out.println(print_digit(121));
    }
}
