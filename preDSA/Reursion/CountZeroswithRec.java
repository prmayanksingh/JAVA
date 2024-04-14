package Reursion;

public class CountZeroswithRec {

    public static int countZerosRec(int input){
        return countZerosRec(input, 0);
    }

	public static int countZerosRec(int input, int n){
        // Base case
        if (input == 0) return 1;
        else if (input < 10 && input != 0) return n;

        // Calculation
        if (input % 10 == 0) n += 1;

        // Smaller Problem
        return countZerosRec(input/10, n);
	}

	public static void main(String[] args) {
		int n = 10001;
		System.out.println(countZerosRec(n));
	}
}
