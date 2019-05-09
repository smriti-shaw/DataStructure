package misc;

import java.util.HashSet;
import java.util.Set;

public class ThreeAndFiveFactor {

    public static void main(String[] args) {
        int low = 1;
        int high = 10;
        int len =0;
        Set<Integer> set = new HashSet<>();

        for(int i=low ; i<=high ;i++){
            if(i == 1)
                len++;
            else if(i%3==0)
                len++;
            else if(i%5 ==0)
                len++;
            else if(i%15==0)
                len++;
        }
        System.out.println(len);
    }
}
