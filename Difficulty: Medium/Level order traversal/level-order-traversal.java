/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    ArrayList<ArrayList<Integer>>ans;
    ArrayList<Integer>temp;
    
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        ans=new ArrayList<>();
        
        Queue<Node>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int s=q.size();
            temp=new ArrayList<>();
            while(s-->0){
                Node t=q.peek();
                q.poll();
                temp.add(t.data);
                if(t.left!=null)q.offer(t.left);
                if(t.right!=null)q.offer(t.right);
            }
            ans.add(temp);
        }
       return ans; 
    }
}