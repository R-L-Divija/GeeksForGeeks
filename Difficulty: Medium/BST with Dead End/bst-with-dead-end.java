/*
class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
}*/

class Solution {
    public boolean func(Node root,int l,int r){
        if(root==null)return false;
        if(root.left==null&&root.right==null){
            if(l==root.data-1&&r==root.data+1)return true;
        }
        boolean t=func(root.left,l,root.data);
        boolean nt=func(root.right,root.data,r);
        return t||nt;
    }
    public boolean isDeadEnd(Node root) {
        // Code here.if(root)
        return func(root,0,Integer.MAX_VALUE);
    }
}