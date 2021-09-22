public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode head;
        ListNode now;
        int k = 3;
        int[] input = {};
        head = new ListNode(input[0]);
        now = head;
        for (int i = 1; i < input.length; i++) {
            now.next = new ListNode(input[i]);
            now = now.next;
        }
        ListNode[] res =  s.splitListToParts(head,k);
        for (ListNode temp:
             res) {
            while(temp!=null){
                System.out.print(temp.val+"->");
                temp = temp.next;
            }
            System.out.println("");
        }
    }
}
