package misc;

public class ThreeAndFiveFactor {

    public static void main(String[] args) {
        int low = 1;
        int high = 10;
        int len =0;
        System.out.println((6%3));

        for(int i=low ; i<=high ;i++){
            if(i == 1)
                len++;
            else if(i%3==0)
                len++;
            else if(i%5 ==0)
                len++;

            else{
                if(i%3 ==0 && i%5 ==0) {
                    System.out.println("i"+i);
                    len++;
                }
            }
        }
        System.out.println(len);
    }
}
