/*
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    int s=Integer.MIN_VALUE;
    int sum1=0;
    int func(Node root){
        if(root==null)return 0;
        
        int left=Math.max(0,func(root.left));
        int right=Math.max(0,func(root.right));
         
        sum1=root.data+left+right;
        s=Math.max(s,sum1);
        return root.data+Math.max(left,right);
        
    }
    int findMaxSum(Node root) {
        func(root);
        return s;
        
    }
}