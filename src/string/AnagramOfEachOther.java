package string;

public class AnagramOfEachOther {

    public static void main(String[] args) {
        String s1 = "APPLE";
        String s2 = "PPALYE";
        AnagramOfEachOther anagram = new AnagramOfEachOther();
        System.out.println(anagram.isAnagram(s1,s2));
    }

    public Boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        int[] c1Ascii = new int[26];
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        for(int i =0; i< c1.length; i++){
            int ascii = (int) c1[i] - 'A';
            if(c1Ascii[ascii] >0)
                c1Ascii[ascii] = c1Ascii[ascii]+1;
            else
                c1Ascii[ascii] = 1;
        }
        for(int i =0; i< c2.length; i++){
            int ascii = (int) c2[i] - 'A';
            if(c1Ascii[ascii] == 0)
                return false;
            if(c1Ascii[ascii] >0)
                c1Ascii[ascii] = c1Ascii[ascii]-1;
        }
        return true;

    }
}
