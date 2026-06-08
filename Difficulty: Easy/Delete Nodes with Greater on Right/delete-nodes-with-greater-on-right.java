/* Structure of linked list node
class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/
class Solution {
    int m=Integer.MIN_VALUE;
    Node func(Node head){
       if(head==null)return null; 
       
       Node q=func(head.next);
       if(head.data<m)return q;
       m=head.data;
       head.next=q;
       
       return head;
    }
    Node compute(Node head) {
    
    return func(head);
    
    }
}