// your task is to complete this function

/*class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public int countPairs(Node head1, Node head2, int x) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        Node temp1 = head1;
        while (temp1 != null) {
            set.add(temp1.data);
            temp1 = temp1.next;
        }
        Node temp2 = head2;
        while (temp2 != null) {
            if (set.contains(x - temp2.data))
                count++;
            temp2 = temp2.next;
        }
        return count;
    }
}
