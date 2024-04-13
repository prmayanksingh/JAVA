package Array;

import java.util.Scanner;

public class SwapAlternateWithoutVoid {

    public static void print(int[] n){
        for (int i : n){
            System.out.print(i + " ");
        }
    }

    public static int[] swap (int[] n){
        int [] swap = new int[n.length];
        int pointA = 0, pointB = 1;
        while (pointB < n.length){
            swap[pointA] = n[pointB];
            swap[pointB] = n[pointA];
            pointA += 2;
            pointB += 2;
        }
        if (pointA < n.length){
            swap[pointA] = n[pointA];
        }
        return swap;
    }

    public static int [] takeInput(){
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int [] input = new int[n];
        for (int i = 0; i < n; i++){
            input [i] = s.nextInt();
        }
        return input;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int t = s.nextInt();
        for (int i = 1; i <= t; i++){
           int [] arr = takeInput();
           int str[] = swap(arr);
           print(str);
        }
    }
}
