package Test2;

public class practice {
    public static void pra(int[] input){
        if (input.length < 1){
            return;
        }
        for (int i = 0; i < input.length; i++){
            int j;
            for (j = i+1; j < input.length; j++){
                if (input[j] > input[i]){
                    break;
                }
            }
            if (j == input.length){
                System.out.print(input[i]);
            }
        }
    }
}
