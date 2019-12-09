import java.util.List;

public class isPalindrome {
    public static boolean isPalindrome(int x) {
        String a = Integer.toString(x);
        //Character.toString()；
        char[] b = a.toCharArray();
        int i = 0;
        int j = b.length - 1;
        while (i<j){
            if(b[i] != b[j]){
                return false;
            }else{
                i += 1;
                j -= 1;
            }
        }
        return true;

    }
}
