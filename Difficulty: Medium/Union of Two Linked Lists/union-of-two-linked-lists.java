/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    public static Node makeUnion(Node head1, Node head2) {
   
     TreeSet<Integer>set=new TreeSet<>();
        while(head1!=null){
            set.add(head1.data);
            head1=head1.next;
        }
        while(head2!=null){
            set.add(head2.data);
            head2=head2.next;
        }
       
        Node root=new Node(-1);
        Node tail=root;
        for(int x:set){
            Node temp=new Node(x);
            tail.next=temp;
            tail=temp;
        }
        return root.next;
    }
}