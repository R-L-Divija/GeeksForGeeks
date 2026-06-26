/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node intersectPoint(Node h1, Node h2) {
        Node t1=h1;
        Node t2=h2;
        
        while(t1!=t2){
            if(t1==null)t1=h2;
            else t1=t1.next;
            
            if(t2==null)t2=h1;
            else t2=t2.next;
            
        }
        return t1;
        
    }
}