/* class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
} */

class Solution {
    int ans=Integer.MAX_VALUE;
    void func(Node root,int x){
        if(root==null)return;
        //if(root.data==x)ans=root.data;
        if(root.data>=x){
             ans=Math.min(ans,root.data);
             func(root.left,x);
           
        }else{
            func(root.right,x);
        }
    }
    int findCeil(Node root, int x) {
       func(root,x);
       if(ans==Integer.MAX_VALUE)return -1;
       return ans;
    }
}