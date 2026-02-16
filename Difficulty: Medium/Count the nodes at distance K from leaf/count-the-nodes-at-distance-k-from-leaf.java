// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }

class Solution {
    Set<Node>ans;
    ArrayList<Node>temp;
    public void func(Node root,int k){
        if(root==null)return;
        
        temp.add(root);
        if(root.left==null&&root.right==null){
        if(temp.size()>k){
        Node d=temp.get(temp.size()-k-1);
        ans.add(d);
            }
        }
        func(root.left,k);
        func(root.right,k);
        temp.remove(temp.size()-1);
        
        
    }
    int kthFromLeaf(Node root, int k) {
        ans=new HashSet<>();
        temp=new ArrayList<>();
        func(root,k);
        return ans.size();
        
    }
}