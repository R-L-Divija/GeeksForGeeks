/*
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
   boolean ans;
    public int func(Node root){
        if(root==null){
            // if(root.left.data>root.right.data){
            //     c=root.left.data-root.right.data;
            // }else{
            //      c=root.right.data-root.left.data;
            // }
            return 0;
        }
        int left=1+func(root.left);
        int right=1+func(root.right);
        if(Math.abs(left-right)>1)ans=false;
        return Math.max(left,right);
        
    }
    public boolean isBalanced(Node root) {
        ans=true;
    func(root);
    return ans;
        
    }
}