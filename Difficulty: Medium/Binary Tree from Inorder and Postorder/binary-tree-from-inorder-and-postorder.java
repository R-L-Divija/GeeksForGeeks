/*
class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/

class Solution {
    int index;
    public Node func(int[] in,int[]post,int l,int r){
        if(l>r)return null;
        int part=-1;
        int val=post[index--];
        Node root=new Node(val);
       // index--;
        for(int i=0;i<in.length;i++){
            if(in[i]==val)part=i;
        }
         root.right=func(in,post,part+1,r);
        root.left=func(in,post,l,part-1);
        
         return root;
    }
    Node buildTree(int[] inorder, int[] postorder) {
        index=postorder.length-1;
        return func(inorder,postorder,0,inorder.length-1);
        
    }
}