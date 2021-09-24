public class Solution {
    public Node flatten(Node head) {
        if(head==null){
            return null;
        }
        Node res[] = findHeadTail(head);
        return res[0];
    }
    public Node[] findHeadTail(Node head){

        Node tail = head;
        while(tail.next!=null){
            if(tail.child!=null){
                Node toInsert[] = findHeadTail(tail.child);
                tail.child=null;
                Node next = tail.next;
                tail.next = toInsert[0];
                toInsert[0].prev = tail;
                toInsert[1].next = next;
                next.prev = toInsert[1];
                tail = toInsert[1];
            }
            tail = tail.next;
        }
        if(tail.child!=null){
            Node toInsert[] = findHeadTail(tail.child);
            tail.child=null;
            Node next = tail.next;
            tail.next = toInsert[0];
            toInsert[0].prev = tail;
            toInsert[1].next = next;
            tail = toInsert[1];
        }
        Node res[] = {head,tail};
        return res;
    }
}
