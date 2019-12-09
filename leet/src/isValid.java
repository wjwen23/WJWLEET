import java.util.HashMap;
import java.util.Map;

public class isValid {
    public static boolean isValid(String s) {
        char[] ch = s.toCharArray();

        Map<String, String> map = new HashMap<>();
        map.put("(", ")");
        map.put("[", "]");
        map.put("{", "}");
        //int j = ch.length - 1;
        int i =0;
        while(i < ch.length){
            char firstchar = s.charAt(0);
            String firststring = Character.toString(firstchar);
            String tofind = map.get(firststring);
            s = s.substring(1);
            if(!s.contains(tofind)){
                return false;
            }else{

            }

        }
        return true;

    }
}
