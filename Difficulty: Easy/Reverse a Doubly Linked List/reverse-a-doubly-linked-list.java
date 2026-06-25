/* Structure of doubly linked list node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {

Node p=head;
Node q=null ;

while(p!=null){
    q=p;
    p=p.next;
    q.next=q.prev;
    q.prev=p;
}
return q;
    }
}