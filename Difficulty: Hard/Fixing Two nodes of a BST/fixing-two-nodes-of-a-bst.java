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
    ArrayList<Integer>ans=new ArrayList<>();
    int i=0;
    public void func1(Node root){
        if(root==null)return;
        func1(root.left);
        ans.add(root.data);
        func1(root.right);
    }
//   public Node func2(ArrayList<Integer>ans){
//         if(ans==null||ans.size()==0||ans.get(0)==null)return null;
//         Queue<Node>q=new LinkedList<>();
//         Node root=new Node(ans.get(0));
//         q.offer(root);
//         int i=1;
//         while(!q.isEmpty()&&i<ans.size()){
//             Node t=q.poll();;
//             if(i<ans.size()&&ans.get(i)!=null){
//                 t.left=new Node(ans.get(i));
//                 q.offer(t.left);
//             }i++;
//               if(i<ans.size()&&ans.get(i)!=null){
//                 t.right=new Node(ans.get(i));
//                 q.offer(t.right);
//             }i++;
//         }
//         return root;
//   }
    public void func2(Node root){
        if(root == null) return;

        func2(root.left);
        root.data = ans.get(i++);
        func2(root.right);
    }
    void correctBST(Node root) {
         func1(root);
         Collections.sort(ans);
        func2(root);
    }
}