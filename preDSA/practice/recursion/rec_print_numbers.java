package practice.recursion;

public class rec_print_numbers {
    public static void print (int n){
        if (n <= 0){
            return;
        }
        print (n -1);
        System.out.print(n + " ");
        return;
    }
    public static void main(String[] args) {
        print(4);
    }
}
