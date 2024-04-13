package practice.Strings;

public class st_check_permulation {
    public static boolean isPermutation(String str1, String str2){
        int [] arr = new int[256];
        for (int i = 0; i < str1.length(); i++){
            arr[str1.charAt(i)] += 1;
        }
        for (int j = 0; j < str2.length(); j++){
            arr[str1.charAt(j)] -= 1;
        }
        for (int check = 0; check < arr.length; check++){
            if (arr[check] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "sinrtg";
        String str2 = "string";
        System.out.println(isPermutation(str1, str2));
    }
}
