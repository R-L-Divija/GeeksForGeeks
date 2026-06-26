/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node deleteMid(Node head) {
        if(head==null||head.next==null)return null;
        // code here
        Node l=head;
        Node r=head;
        Node p=null;
        while(r!=null &&r.next!=null){
            p=l;
            l=l.next;
            r=r.next.next;
        }
        
       p.next=l.next;
        return head;
    }
}