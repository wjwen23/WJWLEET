import java.util.ArrayList;
import java.util.List;

public class longestPalindrome {
    public static String longestPalindrome(String s) {

        if(s == "" || s == " "){
            return null;
        }
        char[] ch;
        //List<Character> ch = new ArrayList<>();
        ch = s.toCharArray();
        if(ch.length == 1){
            return s;
        }
        else{
            String B = s.substring(0,s.length()-1);
            String C = longestPalindrome(B);
            int length = C.length();
            char[] ch_1;
            String tobeadd = Character.toString(ch[ch.length-1]);
            C = C + tobeadd;
            ch_1 = C.toCharArray();

            int i = 0;
            int j = ch_1.length-1;
            while(i < j){
                if(ch_1[i] == ch_1[j]){
                    i += 1;
                    j -= 1;
                }
                else return C;
            }
            return C + tobeadd;

        }

    }
}
