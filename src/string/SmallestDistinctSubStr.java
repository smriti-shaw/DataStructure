package string;

public class SmallestDistinctSubStr {

    public static void main(String[] args) {
        String input = "facdedb";
        String pattern = "abd";
        System.out.println(findSubString(input, pattern));

    }

    static String findSubString(String str, String pat)
    {
        int strLen= str.length();
        int patLen = pat.length();
        int[] str_count = new int[256];
        int[] ptr_count = new int[256];
        int start=0, start_index=-1, count =0, min_win_len = Integer.MAX_VALUE;
        for(int i=0; i<patLen; i++){
            ptr_count[pat.charAt(i)]++;
        }
        for(int i=0; i<strLen; i++){
            str_count[str.charAt(i)]++;

            if(ptr_count[str.charAt(i)]!=0 && str_count[str.charAt(i)] <= ptr_count[str.charAt(i)]){
                count++;
            }

            if(patLen == count){
                while(str_count[str.charAt(start)] > ptr_count[str.charAt(start) ] ||
                ptr_count[str.charAt(start)] == 0){
                    if(ptr_count[str.charAt(start)] > str_count[str.charAt(start)])
                        str_count[str.charAt(start) ]--;
                    start++;
                }
                int current_min_win = i-start+1;
                if(current_min_win < min_win_len){
                    min_win_len = current_min_win;
                    start_index = start;
                }

            }
        }
        return str.substring(start_index, start_index + min_win_len);
    }
}
