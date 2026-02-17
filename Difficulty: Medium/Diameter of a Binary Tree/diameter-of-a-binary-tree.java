/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} */

class Solution {
    int m=0;
    public int func(Node root){
        if(root==null)return 0;
        int l=1+func(root.left);
        int r=1+func(root.right);
        m=Math.max(m,l+r-2);
      return Math.max(l,r); 
    }
    public int diameter(Node root) {
        func(root);
        return m;
        
    }
}