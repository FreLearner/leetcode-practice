public class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode first = head;
        ListNode last = head;
        for (int i = 0; i < k-1; i++) {
            last = last.next;
        }
        while(last.next!=null){
            first = first.next;
            last = last.next;
        }
        return  first;
    }
}




