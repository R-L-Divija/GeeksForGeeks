/*
class Node {
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
};
*/

class Solution {
    public int cycleStart(Node head) {
        Node l=head;
        Node r=head;
        boolean f=false;
        while(r!=null &&r.next!=null){
            l=l.next;
            r=r.next.next;
            if(l==r){
                f=true;
                break;
            }
        }
        if(!f)return -1;
        l=head;
        while(l!=r){
            l=l.next;
            r=r.next;
        }
        return l.data;
    }
}