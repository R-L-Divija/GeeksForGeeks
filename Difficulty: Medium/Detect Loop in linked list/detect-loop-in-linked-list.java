/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public boolean detectLoop(Node head) {
        // code here
        Node l=head;
        Node r=head;
        
        while(r!=null && r.next!=null){
            l=l.next;
            r=r.next.next;
            if(l==r)return true;
        }
        return false;
    }
}