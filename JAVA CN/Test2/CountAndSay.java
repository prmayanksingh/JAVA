package Test2;

public class CountAndSay {

    public static String writeAsYouSpeak(int n){
        String str = "";
        if (n < 1){
            return str;
        }

        for (int i = 1; i <= n; i++){
            String temp = "";
            int t = str.charAt(0);
            int count = 0;
            int j;
            for (j = 0; j < str.length(); j++){
                if (str.charAt(j) == t){
                    count++;
                }else{
                    break;
                    // temp += count + str.charAt(j);
                    // t = str.charAt(j);
                }
            }
            if (count == 0){
                temp += str.charAt(j);
                t = str.charAt(j);
            }else{
                temp += count + str.charAt(j);
                t = str.charAt(j);
            }
            str = temp;
        }
        return str;
    }
    public static void main(String[] args) {
        System.out.println(writeAsYouSpeak(2));
    }
}
