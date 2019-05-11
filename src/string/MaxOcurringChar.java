package string;

public class MaxOcurringChar {

    public static void main(String[] args) {
        String input = "stessttstuytss";
        System.out.println(charCount(input));
    }

    public static char charCount(String input){
        int maxCount = 0;
        char maxChar = input.charAt(0) ;
        int[] char_arr = new int[256];
        for(int i=0 ;i<input.length(); i++){
            char_arr[input.charAt(i)]++;
            if(char_arr[input.charAt(i)] > maxCount)
                maxCount += 1;
               maxChar = input.charAt(i);
        }
        System.out.println("count"+maxCount);
        return maxChar;
    }
}
