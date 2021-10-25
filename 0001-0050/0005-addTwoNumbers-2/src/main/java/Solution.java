
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int extra = 0;
        int resAdd = 0;
        ListNode temp = l1;
        while(true){
        resAdd = temp.val + l2.val + extra;
        temp.val = resAdd % 10;
        extra = resAdd / 10;
        if(temp.next==null || l2.next==null){
            break;
        }
            temp = temp.next;
            l2 = l2.next;
        }
        if(l2.next!=null){
            l2 = l2.next;
            resAdd = l2.val + extra;
            l2.val = resAdd %10;
            extra = resAdd/10;
            temp.next = new ListNode(l2.val,l2.next);
            while (l2.next!=null){
                l2 = l2.next;
                resAdd = l2.val + extra;
                l2.val = resAdd %10;
                extra = resAdd/10;
            }
            if(extra!=0){
                l2.next = new ListNode(1);
                if(temp.next.next==null){
                    temp.next.next = l2.next;
                }
            }
            return l1;
        }
        if(temp.next!=null){
            temp = temp.next;
            resAdd = temp.val + extra;
            temp.val = resAdd %10;
            extra = resAdd/10;
            while (temp.next!=null){
                temp = temp.next;
                resAdd = temp.val + extra;
                temp.val = resAdd %10;
                extra = resAdd/10;
            }
            if(extra!=0){
                temp.next = new ListNode(1);
            }
            return l1;
        }
        if(extra!=0){
            temp.next = new ListNode(1);
        }
        return l1;
    }
}