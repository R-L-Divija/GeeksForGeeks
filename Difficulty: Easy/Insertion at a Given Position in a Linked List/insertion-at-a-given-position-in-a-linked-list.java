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
    public Node insertPos(Node head, int pos, int x) {
    
    Node temp=new Node(x);
    if(head==null &&pos==1){
        head=temp;
        return head;
    }
    if(pos==1){
        temp.next=head;
        head=temp;
        return head;
    }
    int i=1;
    Node p=head;
    Node q=head;
    while(i<pos && q!=null){
        p=q;
        q=q.next;
        i++;
    }
    temp.next=p.next;
    p.next=temp;
    return head;
        
    }
}