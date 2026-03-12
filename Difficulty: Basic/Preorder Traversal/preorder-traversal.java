/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    ArrayList<Integer>ans;
    public void func(Node root){
        if(root==null)return;
        ans.add(root.data);
        func(root.left);
        func(root.right);
    }
    public ArrayList<Integer> preOrder(Node root) {
        ans=new ArrayList<>();
        func(root);
        return ans;
    }
}