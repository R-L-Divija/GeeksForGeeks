/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {

    public Node reverseKGroup(Node head, int k) {
        if(head==null)return null;
      Node p=null;
        Node q=null;
        Node temp=head;
        int c=k;
        while(temp!=null && c!=0){
            q=temp.next;
            temp.next=p;
            p=temp;
            temp=q;
            c--;
            
        }
        head.next=reverseKGroup(temp,k);
        return p;
        
    }
}