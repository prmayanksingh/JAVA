package Recursion_2;

public class Subsequences {

    public static String [] findSustring(String str){
        
        if (str.length() == 0){
            String ans[] = {""};
            return ans;
        }

        String []smallAns = findSustring(str.substring(1));
        String [] ans = new String[2 * smallAns.length];

        for (int i = 0; i < smallAns.length; i++){
            ans[i] = smallAns[i];
        }
        for (int i = 0; i < smallAns.length; i++){
            ans [i + smallAns.length] = str.charAt(0) + smallAns [i];
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "xyz";
        String ans [] = findSustring(str);
        for (int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
