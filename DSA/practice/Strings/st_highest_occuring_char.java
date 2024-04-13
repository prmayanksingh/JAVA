package practice.Strings;

public class st_highest_occuring_char {
    public static char highestOccChar(String str){
        int [] arr = new int[256];
        for (int i = 0; i < str.length(); i++){
            arr [str.charAt(i)] += 1;
        }
        int max = 0;
        char c = 0;
        for (int check = 0; check < str.length(); check++){
            if (arr[str.charAt(check)] > max){
                max = arr[str.charAt(check)];
                c = str.charAt(check);
            }
        }
        return c;
    }
    public static void main(String[] args) {
        String str = "ababca";
        System.out.println(highestOccChar(str));
    }
}
