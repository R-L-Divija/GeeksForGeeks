/*
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
  
    public int func(Node root){
        if(root==null)
        return 0;
        //take left
        
       int l=1+func(root.left);
        //take right
        int r=1+func(root.right);
        return Math.max(l,r);
         
    }
    public int height(Node root) {
    return func(root)-1;
    }
}