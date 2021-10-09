public class Main {
    public static void main(String[] args) {
        int[] input1 = {1};
        int[] input2 = {2};
        int[] input3 = {3};
        Node head = new Node();
        head.val = input1[0];
        Node now=head;
        Node prev;
        Node insert1=head;
        Node insert2=head;
        for (int i = 1; i < input1.length; i++) {
            now.next = new Node();
            prev = now;
            now = now.next;
            now.prev = prev;
            now.val = input1[i];
            if(input1[i]==1){
                insert1 = now;
            }
        }
        Node head2 = new Node();
        head2.val = input2[0];
        now = head2;
        for (int i = 1; i < input2.length; i++) {
            now.next = new Node();
            prev = now;
            now = now.next;
            now.prev = prev;
            now.val = input2[i];
            if(input2[i]==2){
                insert2 = now;
            }
        }
        Node head3 = new Node();
        head3.val = input3[0];
        now = head3;
        for (int i = 1; i < input3.length; i++) {
            now.next = new Node();
            prev = now;
            now = now.next;
            now.prev = prev;
            now.val = input3[i];
        }
        insert1.child = head2;
        insert2.child = head3;
        head.child = head2;
        head2.child = head3;
        Solution s = new Solution();
        Node res  = s.flatten(head);
        while(res!=null){
            System.out.print(res.val+"->");
            res = res.next;
        }
    }
}
