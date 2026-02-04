/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    
    public Node rotate(Node head, int k) {
        if(head==null || head.next==null||k==0)return head;
        Node temp=head;
        int c=1;
        while(temp.next!=null){
        
            temp=temp.next;
            c++;
        }
        k=k%c;
        if(k==0)return head;
        temp.next=head;
     
        Node p=head;
        for(int i=1;i<k;i++){
            p=p.next;
        }
        Node q=p.next;
        p.next=null;
        return q;
    }
}