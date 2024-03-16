package SearchingAndSorting.Sort;

import java.util.Scanner;

public class CountSmall {

    public static int [] countS(int[] a, int[] b){
        int [] arr = new int[a.length];
        for (int i = 0; i < a.length; i++){
            int t = 0;
            for (int j = 0; j < b.length; j++){
                if (a[i] >= b[j]){
                    t++;
                }
            }
            arr[i] = t;
        }
        return arr;
    }

    public static int[] takeInput(){
        Scanner s = new Scanner (System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
            for (int i = 0; i < size; i++){
                arr [i] = s.nextInt(); 
            }
            return arr; 
        }    
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int t = s.nextInt();
        for (int i = 1; i <= t; i++){
            int[] a = takeInput();
            int[] b = takeInput();
            int[] ans = countS(a, b);
            for (int j : ans){
                System.out.print(j + " ");
            }
        }
    }
}
