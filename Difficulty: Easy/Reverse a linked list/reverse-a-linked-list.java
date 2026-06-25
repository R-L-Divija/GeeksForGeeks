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
    Node reverseList(Node head) {
         Node q=head;
         Node p=null;
         while(q!=null){
             Node t=q.next;
             q.next=p;
             p=q;
             q=t;
         }
        return p;
    }
}