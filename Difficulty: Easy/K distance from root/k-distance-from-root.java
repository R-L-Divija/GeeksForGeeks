/*
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree {
    // Recursive function to print right view of a binary tree.
    ArrayList<Integer> Kdistance(Node root, int k) {
        // Your code here
        ArrayList<Integer>ans=new ArrayList<>();
       if(root==null)return ans;
        Queue<Node>q=new LinkedList<>();
        q.offer(root);
        int c=0;
        if(k==0){
            ans.add(root.data);
            return ans;
            
        }
        while(!q.isEmpty() && c<k){
           int  s=q.size();
            while(s-- >0){
                Node t=q.poll();
                if(t.left!=null)q.offer(t.left);
                if(t.right!=null)q.offer(t.right);
            }
            c++;
        }
        while(!q.isEmpty()){
            Node t=q.poll();
            ans.add(t.data);
        }
        return ans;
    }
}