package string;

//Louise joined a social networking site to stay in touch with her friends.
// The sign up page required her to input a name and a password. However, the password must be strong.
// The website considers a password to be strong if it satisfies the following criteria:
//
//        Its length is at least .
//        It contains at least one digit.
//        It contains at least one lowercase English character.
//        It contains at least one uppercase English character.
//        It contains at least one special character. The special characters are: !@#$%^&*()-+
//        She typed a random string of length  in the password field but wasn't sure if it was strong.
//        Given the string she typed, can you find the minimum number of characters she must add to make her password strong?

public class Password {



    public static void main(String[] args) {
        String input = "ab1";
        String numbers = "0123456789"; // 48-57
        String lower_case = "abcdefghijklmnopqrstuvwxyz"; //97-123
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //65-90
        String special_characters = "!@#$%^&*()-+"; //33-43 + 64

        for(int i=0; i<100;i++){
            char test = (char) i;
            System.out.println(i +"contains : "+test);
        }
        Boolean isCNum =false;
        Boolean isCLC =false;
        Boolean isCUC =false;
        Boolean isCSC =false;

        char[] inputChar = input.toCharArray();
        if(inputChar.length >=6) {
            for (int i = 0; i < inputChar.length; i++) {
                if(numbers.indexOf(inputChar[i]) >=0)
                    isCNum = true;
                if(lower_case.indexOf(inputChar[i]) >=0)
                    isCLC = true;
                if(upper_case.indexOf(inputChar[i]) >=0)
                    isCUC = true;
                if(special_characters.indexOf(inputChar[i]) >=0)
                    isCSC = true;

            }

        }

    }

}


