/*
class Node {
    int data;
    Node left, right;

    public Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer>ans;
    public void func1(Node root1){
        if(root1==null)return;
        func1(root1.left);
        ans.add(root1.data);
        func1(root1.right);
    }
    public void func2(Node root2){
        if(root2==null)return;
        func2(root2.left);
        ans.add(root2.data);
        func2(root2.right);
    }
    public ArrayList<Integer> merge(Node root1, Node root2) {
        ans=new ArrayList<>();
        func1(root1);
        func2(root2);
        Collections.sort(ans);
        return ans;
    }
}