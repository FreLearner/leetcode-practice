public class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] res = new ListNode[k];
        res[0] = head;
        ListNode now = head;
        int len = 0;
        while(now!=null){
            len++;
            now = now.next;
        }
        if(len==0){
            return res;
        }
        int partlen = len/k;
        int extra = len%k;
        ListNode temp;
        now = head;
        if(partlen>0){
            for (int i = 0; i < k; i++) {
                res[i] = now;
                for (int j = 0; j < partlen-1; j++) {
                    now =  now.next;
                }
                if(extra>0){
                    now = now.next;
                    extra--;
                }
                temp = now.next;
                now.next = null;
                now = temp;
            }
        }
        else {
            for (int i = 0; i < k; i++) {
                res[i] = now;
                temp = now.next;
                now.next = null;
                now = temp;
                if(now==null){
                    return res;
                }
            }
        }
       return res;
    }

}
