/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    static int index;
    public static Node func(int in[],int pre[],int l,int r){
        if(l>r)return null;
        int part=-1;
        int val=pre[index];
        Node root=new Node(val);
        index++;
        for(int i=0;i<in.length;i++){
            if(in[i]==val)part=i;
        }
       
        root.left=func(in,pre,l,part-1);
        root.right=func(in,pre,part+1,r);
        return root;
          
    }
    public static Node buildTree(int inorder[], int preorder[]) {
        index=0;
       return func(inorder,preorder,0,inorder.length-1);
    }
}