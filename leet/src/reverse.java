//import org.graalvm.compiler.core.common.type.ArithmeticOpTable;

import java.util.ArrayList;
import java.util.List;
import java.math.*;
import java.lang.Math;
class reverse {
    public static int reverse(int x) {

        int[] reverseint = new int[]{};

        List<Integer> reverseint_1 = new ArrayList<>();
        while (x/10 > 0){
            int a = x%10;
            reverseint_1.add(a);
            x = x/10;
        }
        reverseint_1.add(x);
        int intused = 0;
        for(int i = 0; i < reverseint_1.size(); i++){
            int xused = reverseint_1.size()-1-i;
            int xused_1 = 1;
            for(int j =1; j<=xused; j++){
              xused_1 = xused_1 *10;
            }
            //int xused_1 = Math.pow((int)10, xused);

            System.out.println(reverseint_1.get(i));
            int xused_2 = reverseint_1.get(i);
            System.out.println(xused_2);
            intused += (xused_2*xused_1);
        }
        return intused;
    }

}
