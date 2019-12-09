import java.util.ArrayList;
import java.util.List;

public class lengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        char [] ch = s.toCharArray();
        if (ch.length == 0){
            return 0;
        }
        int i = 0;
        int lengthoflist = 0;
        List<String> list_1 = new ArrayList<>();

        while (i< ch.length){
            //Character.toString()
            if (list_1.contains(Character.toString(ch[i]))){
                lengthoflist = Math.max(list_1.size(), lengthoflist);
                list_1 = new ArrayList<>();
                list_1.add(Character.toString(ch[i]));
                i += 1;
            }else {
                list_1.add(Character.toString(ch[i]));
                i += 1;
                lengthoflist = Math.max(list_1.size(), lengthoflist);
            }
        }
        return lengthoflist;

    }
}
