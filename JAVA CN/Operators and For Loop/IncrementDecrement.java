public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++);
        a++; // post increment
        ++a; // pre increment
        System.out.println(a);
        int b = ++a;
        System.out.println(b);
        System.out.println(a);

        a = 4;
        a *= 2;
        System.out.println(a);

        a ^= 2;
        System.out.println(a);
    }    
}
