package Array;

import java.util.*;

public class ReturnArraySum {

    public static int[] takeInput(){
        Scanner sn = new Scanner (System.in);
        int size = sn.nextInt();
        int input[] = new int [size];
        for (int i = 0; i < size; i++){
            input[i] = sn.nextInt();
        }
        return input;
    }

	public static int sum(int[] input) {
		int sum = 0;
        for (int i = 0; i < input.length; i++){
            sum += input[i];
        }
        return sum;
	}
	public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int arr[] = takeInput();
            int sum = sum(arr);
            System.out.println(sum);
        } 
    }
}
