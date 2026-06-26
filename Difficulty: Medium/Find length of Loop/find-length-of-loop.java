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
    public int lengthOfLoop(Node head) {
        
        Node l=head;
        Node r=head;
        boolean f=false;
        while(r!=null && r.next!=null){
            l=l.next;
            r=r.next.next;
            if(l==r){
                f=true;
                break;
            }
        }
        if(!f)return 0;
        int c=1;
        r=r.next;
        while(l!=r){
           
            r=r.next; c++;
            
        }return c;
    }
}