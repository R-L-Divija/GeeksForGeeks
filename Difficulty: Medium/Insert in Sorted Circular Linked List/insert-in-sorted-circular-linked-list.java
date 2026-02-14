/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node sortedInsert(Node head, int data) {
        Node temp=new Node(data);
        if(head==null){
            temp.next=temp;
            return temp;
        }
        else if(head.data>=temp.data){
             Node p=head;
             while(p.next!=head){
                 p=p.next;
                 }
                p.next=temp;
                temp.next=head;
                head=temp;
                return head;
        }
        else{
            Node p=head;
            Node q=head;
        while(p.next!=head&&p.next.data<temp.data){
        
            p=p.next;
        }
        temp.next=p.next;
        p.next=temp;
        }
        return head;
    }
}