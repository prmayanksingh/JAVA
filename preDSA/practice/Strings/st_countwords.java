package practice.Strings;

public class st_countwords {
    public static int countwords(String str){
        int count = 1;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "coding ninjas!";
        System.out.println(countwords(str));
    }
}
