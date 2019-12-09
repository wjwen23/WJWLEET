import java.util.HashSet;

public class removeNthFromEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        //HashSet<Object>
        if(n == 0){
            return head;
        }
        if(head.next == null){
            if(n == 1){
                return null;
            }
        }
        ListNode A = head;
        ListNode B = head;
        for(int i = 0;i < n ;i ++){
            B = B.next;
            return head;
        }
        if(B ==null){
            head.next = head.next.next;
        }
        ListNode C = null;
        while(B != null){
            B = B.next;
            C = A;
            A = A.next;
        }
        if(C.next != null){
            C.next = C.next.next;
            return head;
        }else {
            A.next = null;
            return head;
        }

    }
}

