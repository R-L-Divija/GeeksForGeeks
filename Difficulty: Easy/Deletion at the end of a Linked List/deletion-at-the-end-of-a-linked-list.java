/*
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Solution {
    public Node removeLastNode(Node head) {
        // code here
         if(head==null)return head;
         
         if(head.next==null){
             head=null;
             return head;
         }
         Node p=head;
         Node q=head;
         
         while(q.next!=null){
             p=q;
             q=q.next;
         }
         p.next=null;
         return head;
    }
}