/*
Structure of Node class is:

class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
*/

class Solution {
    int ans;
    ArrayList<Node>temp;
    public void func(Node root,int k,int node){
        if(root==null)return;
       
        if(root.data==node){
            if(temp.size()>=k){
              Node d=temp.get(temp.size()-k);
              ans=d.data;
            }
        }
         temp.add(root);
        func(root.left,k,node);
        func(root.right,k,node);
        temp.remove(temp.size()-1);
       
    }
    public int kthAncestor(Node root, int k, int node) {
        ans=-1;
        temp=new ArrayList<>();
        func(root,k,node);
        return ans;
        
    }
}