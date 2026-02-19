/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    // Function to find the least absolute difference between any node
    // value of the BST and the given integer.
    static int ans;
   static void func(Node root,int x){
        if(root==null)return;
       
            func(root.left,x);
       int diff=Math.abs(root.data-x);
       ans=Math.min(ans,diff);
       func(root.right,x);
        }
    
    
    static int minDiff(Node root, int k) {
        // Write your code here
        ans=Integer.MAX_VALUE;
        func(root,k);
        if(ans==Integer.MAX_VALUE)return 0;
        return ans;
    }
}