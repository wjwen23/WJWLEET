import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombination {
    //private static char[] digitss

    public static List<String> letterCombinations(String digits) {
        List<String> toprint = new ArrayList<>();
        Map<Character, char []> tele = new HashMap<Character, char[]>();
        tele.put('2', new char[] {'a','b','c'});
        tele.put('3', new char[] {'d','e','f'});
        tele.put('4', new char[] {'g','h','i'});
        tele.put('5', new char[] {'j','k','l'});
        tele.put('6', new char[] {'m','n','o'});
        tele.put('7', new char[] {'p','q','r','s'});
        tele.put('8', new char[] {'t','u','v'});
        tele.put('9', new char[] {'w','x','y','z'});
        char [] digitss = digits.toCharArray();
        char[][] llist = new char[digits.length()][];
        for(int i = 0;i < digitss.length;i ++){
            if (!tele.containsKey(digitss[i])){
                return null;
            }else{
                llist[i] = tele.get(digitss[i]);
            }
        }

        for (int j = 0; j < llist.length;j++){
            for(int k = j + 1;k < llist.length;k ++){
                for(int x = 0;x < llist[j].length;x ++){
                    for(int y = 0;y < llist[k].length;y ++){
                        String a = llist[j][x] +""+ llist[k][y];
                        toprint.add(a);
                    }
                }
            }
        }
        return toprint;

    }
}
