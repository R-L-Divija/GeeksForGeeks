/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    int s=Integer.MIN_VALUE;
    
    int func(Node root){
        if(root==null)return Integer.MAX_VALUE;
        if(root.left==null &&root.right==null)return root.data;
        int l=func(root.left);
        int r=func(root.right);
        int diff=Math.min(l,r);
        s=Math.max(s,root.data-diff);
        return Math.min(root.data,diff);
        
    }
    int maxDiff(Node root) {
        
        func(root);
        return s;
        
    }
}