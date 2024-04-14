package recursion;

public class count_zeros {
    public static int countzeros (int input){
        // base case
        if (input == 0) return 1;
        else if (input < 10 && input != 0) return 0;

        // calculation
        if (input % 10 == 0){
            return 1 + countzeros(input/10);
        }else{
            return 0 + countzeros(input/10);
        }
    }
    public static void main(String[] args) {
        int num = 10204;
        System.out.println(countzeros(num));
    }
}
