/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isL(Node root){
        return root.left==null&&root.right==null;
    }
    public void aLeft(Node root,ArrayList<Integer>res){
        Node temp=root.left;
        while(temp!=null){
        if(!isL(temp)){res.add(temp.data);}
        if(temp.left!=null)temp=temp.left;
        else temp=temp.right;}
    }
     public void aright(Node root,ArrayList<Integer>res){
        Node temp=root.right;
        Stack<Integer>st=new Stack<>();
        while(temp!=null){
     if(!isL(temp))st.push(temp.data);
        if(temp.right!=null)temp=temp.right;
        else temp=temp.left;
        }
        
        while(!st.isEmpty()){
            res.add(st.pop());
        }
     }
     public void aleaf(Node root,ArrayList<Integer>res){
         
        if(isL(root)){
            res.add(root.data);
            return;}
         if(root.left!=null)aleaf(root.left,res);
          if(root.right!=null)aleaf(root.right,res);
         
     }
    ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer>res=new ArrayList<>();
        if(!isL(root))res.add(root.data);
        
        aLeft(root,res);
        aleaf(root,res);
        aright(root,res);
        
        return res;
        
    }
}