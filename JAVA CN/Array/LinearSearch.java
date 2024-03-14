package Array;

import java.util.Scanner;

public class LinearSearch {

    public static int[] takeInput(){
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int input[] = new int[n];
        for (int i = 0; i < n; i++){
            input[i] = s.nextInt();
        }
        return input;
    }
    public static void Lsearch(int input[]){
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        for (int i = 0; i < input.length; i++){
            if (input[i] == n){
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int t = s.nextInt();
        for (int i = 1; i <= t; i++){
            int arr [] = takeInput();
            Lsearch(arr);
        }
    }
}
