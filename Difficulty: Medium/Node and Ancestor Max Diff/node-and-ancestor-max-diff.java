/* Structure of binary tree node
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
    int ans;
    public int func(Node root){
        if(root==null)return Integer.MAX_VALUE;
        
        int l=func(root.left);
        int r=func(root.right);
        int min=Math.min(l,r);
        
        if(min!=Integer.MAX_VALUE){
            ans=Math.max(ans,root.data-min);
        }
        return Math.min(root.data,min);
    }
    int maxDiff(Node root) {
        if(root==null)return 0;
        ans=Integer.MIN_VALUE;
        func(root);
        return ans;
        
    }
}