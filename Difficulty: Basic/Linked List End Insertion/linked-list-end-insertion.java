/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node temp=new Node(x);
        
        if(head==null){
            head=temp;
            return head;
        }
       if(head.next==null){
           head.next=temp;
           return head;
       }
       
        Node q=head;
        while(q.next!=null){
            q=q.next;
        }
        q.next=temp;
        return head;
    }
}