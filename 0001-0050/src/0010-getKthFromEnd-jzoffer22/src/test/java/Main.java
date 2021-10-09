public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] input = {1,2,3,4,5};
        int k = 2;
        ListNode inputNode = new ListNode(input[0]);
        ListNode currentNode = inputNode;
        for (int i = 1; i < input.length; i++) {
            currentNode.next = new ListNode(input[i]);
            currentNode = currentNode.next;
        }
        currentNode = inputNode;
        for (int i = 0; i < input.length; i++) {
            System.out.print(currentNode.val+"-->");
            currentNode = currentNode.next;
        }
        ListNode res =  s.getKthFromEnd(inputNode,k);
        System.out.println("---");
        for (int i = 0; i < k; i++) {
            System.out.print(res.val+"-->");
            res = res.next;
        }
    }
}
