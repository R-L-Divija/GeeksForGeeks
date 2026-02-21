/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
} */
class Solution {
int ch=-1;
int cs=0;
    void func(Node root,int h,int s){
        if(root==null){
        
           if(h>ch){
               ch=h;
               cs=s;
           } 
           else if(h==ch){
               cs=Math.max(cs,s);
           }
           return;
        
        }
       func(root.left,h+1,s+root.data);
       func(root.right,h+1,s+root.data);
    }
    public int sumOfLongRootToLeafPath(Node root) {
       func(root,0,0);
        return cs;
        
    }
}