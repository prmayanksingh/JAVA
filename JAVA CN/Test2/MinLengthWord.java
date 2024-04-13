package Test2;

public class MinLengthWord {
    public static String minLengthWord(String input){
        String ans = "";
        int count = Integer.MAX_VALUE;
        String temp = "";
        int temcount = 0;
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) != ' '){
                temp += input.charAt(i);
                temcount++;
            }else{
                if (temcount < count){
                    ans = temp;
                    count = temcount;    
                }
				temp = "";
                temcount = 0;
            }
            if (i == input.length() - 1){
                if (temcount < count){
                    ans = temp;
                    count = temcount;
                    temp = "";
                    temcount = 0;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "this is test string a";
        String ans = minLengthWord(str);
        for (int i = 0; i < ans.length(); i++){
            System.out.print(ans.charAt(i));
        }
    }
}
