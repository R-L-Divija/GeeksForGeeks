/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = this.prev = null;
    }
}
*/

// Complete the function
class Solution {
    public static Node deleteHead(Node head) {
        // your code here
        if(head==null)return head;
        if(head.next==null){
            head=null;
            return head;
        }
        Node temp=head.next;
        temp.prev=null;
        head.next=null;
        
        head=temp;
        return head;
        
    }
}