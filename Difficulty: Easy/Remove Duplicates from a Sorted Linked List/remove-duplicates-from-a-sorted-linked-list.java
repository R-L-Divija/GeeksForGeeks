/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    // Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head) {
        // Your code here
        if(head==null)return null;
        Node temp=head;
        while(temp.next!=null&&temp!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
                }
                else{
                     temp=temp.next;
                }
            }
           
        
        return head;
    }
}