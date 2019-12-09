/*
import java.util.Map;
import java.util.HashMap;
public class longestValidParentheses {
    public int longestValidParentheses(String s) {
        String a = s;
        while (s != null){
            s.substring(1);
        }


    }
    protected boolean isValid(String s) {
        char[] ch = s.toCharArray();
        Map<String, String> map = new HashMap<>();
        map.put("(", ")");
        //map.put("[", "]");
        //map.put("{", "}");
        int j = ch.length - 1;
        int i =0;
        while (i < j){
            String a = Character.toString(ch[i]);
            String b = map.get(a);
            String c = Character.toString(ch[j]);

            if (c.equals(b)){
                i += 1;
                j -= 1;
            }else{
                return false;
            }
        }
        return true;

    }
}


 */