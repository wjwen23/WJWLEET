import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class twoSum2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //int list_1 = 0;
        //int list_2 = 0;
        ListNode toreturn = new ListNode(0);

        ListNode abc = toreturn;
        //abc = toreturn.next;
        int temp = 0;
        int temp_j = 0;
        while(l1 != null || l2 !=null){
            int aaa = (l1 != null) ? l1.val : 0;
            int bbb = (l2 != null) ? l2.val : 0;
            temp = aaa + bbb + temp_j;
            ListNode nottoreturn = new ListNode(0);
            if(temp < 10) {
                temp_j = 0;
                nottoreturn.val = temp;
            }else{
                temp_j = 1;
                nottoreturn.val = temp - 10;
            }
            abc.next = nottoreturn;
            ListNode temptemp = abc.next;
            abc = temptemp;

            //toreturn = toreturn.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            //l1 = l1.next;
            //l2 = l2.next;
        }
        if(temp_j > 0){
            abc.next = new ListNode(temp_j);

        }
        return toreturn.next;
    }
}
