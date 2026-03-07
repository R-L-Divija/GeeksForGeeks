/* A Binary Tree node
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
    int func(Node root){
        if(root==null)return  0;
        
        if(root.left==null && root.right==null)return root.data;
        
        int left=func(root.left);
        int right=func(root.right);
         
         if(left==-1||right==-1)return -1;
         if(root.data!=left+right)return -1;
        
        return root.data+left+right;
    }
    boolean isSumTree(Node root) {
       
       int x= func(root);
        if(x!=-1)return true;
        return false;
    }
}