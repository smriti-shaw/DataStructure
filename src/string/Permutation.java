package string;

public class Permutation {

    public static void main(String[] args) {
        String input = "ABCD";
        permute(0,3,input);

    }
    public static void permute(int i, int j, String str){
        if(i == j)
            System.out.println(str);
        else{
            for(int k=0 ;k<str.length();k++){
                str = swap(i,k,str);
                permute(i+1,j,str);
                str  = swap(k,i,str);
            }
        }
    }

    public static String swap(int i, int j, String str){
        char[] c1 = str.toCharArray();
        char temp = c1[i];
        c1[i] = c1[j];
        c1[j] = temp;
        return String.valueOf(c1);
    }
}
