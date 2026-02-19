/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    boolean ans=true;
    int prev=-1;
    public void func(Node root){
        if(root==null) return;
        func(root.left);
        if(root.data<prev)ans=false;
        prev=root.data;
        //if(root.data>prev)ans =false;
        func(root.right);
        
    }
    public boolean isBST(Node root) {
         func(root);
        return ans;
        
    }
}