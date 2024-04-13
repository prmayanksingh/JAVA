package practice.recursion;

public class rec_first_index {
    public static int firstindex (int input [], int x){
        return firstindex(input, x, 0);
    }

    private static int firstindex(int input[], int x, int startindex){
        if (startindex == input.length){
            return -1;
        }
        if (input[startindex] == x){
            return startindex;
        }
        return firstindex(input, x, ++startindex);
    }
    public static void main(String[] args) {
        int [] arr = {9,8,10,8};
        System.out.println(firstindex(arr, 8)); 
    }
}
