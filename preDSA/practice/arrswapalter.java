package practice;

public class arrswapalter {
    public static void swapalternate(int []arr){
        for (int i = 0; i < arr.length-1; i+=2){
            int temp = arr [i];
            arr [i] = arr [i+1];
            arr [i+1] = temp;
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        swapalternate(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
