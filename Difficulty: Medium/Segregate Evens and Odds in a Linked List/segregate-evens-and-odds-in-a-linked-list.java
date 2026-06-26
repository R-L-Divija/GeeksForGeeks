/* Structure of a link list node
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
    Node divide(Node head) {
        // code here
        Node odd=new Node(-1);
        Node even=new Node(-1);
        Node t1=even;
        Node t2=odd;
        Node temp=head;
    while(temp!=null){
        int x=temp.data;
        if((x&1)==0){
            t1.next=temp;
            t1=t1.next;
        }else{
            t2.next=temp;
            t2=t2.next;
        }temp=temp.next;
    }
    t1.next=odd.next;
    t2.next=null;
    return even.next;
    }
}