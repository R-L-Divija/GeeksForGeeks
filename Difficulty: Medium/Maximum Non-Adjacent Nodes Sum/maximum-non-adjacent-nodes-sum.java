/*
class Node {
    int data;
    Node left, right;

    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
*/
 class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    
    Pair func(Node root){
        if(root==null)return new Pair(0,0);
        Pair left=func(root.left);
        Pair right=func(root.right);
        
        int take=root.data+left.second+right.second;
        int not=Math.max(left.first,left.second)+Math.max(right.first,right.second);
        
        return new Pair(take,not);
    }
    
    public int getMaxSum(Node root) {
     Pair val=func(root);
     return Math.max(val.first,val.second);
    }
}