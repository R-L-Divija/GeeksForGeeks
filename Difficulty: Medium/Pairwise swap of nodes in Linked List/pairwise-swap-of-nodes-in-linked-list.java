class Solution {
    public Node pairwiseSwap(Node head) {

        if(head == null || head.next == null)
            return head;

        Node temp = head;

        while(temp != null && temp.next != null){

            int t = temp.data;
            temp.data = temp.next.data;
            temp.next.data = t;

            temp = temp.next.next;   
        }

        return head;
    }
}
