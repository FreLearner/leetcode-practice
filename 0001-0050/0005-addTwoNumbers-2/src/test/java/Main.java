public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);
        Solution s = new Solution();
        ListNode res = s.addTwoNumbers(l1,l2);
        do{
            System.out.println(res.val);
            res = res.next;
        }while(res!=null);
    }
}
