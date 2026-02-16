/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> rightView(Node root) {
    ArrayList<Integer>ans=new ArrayList<>();
    Queue<Node>q=new LinkedList<>();
    q.offer(root);
    while(!q.isEmpty()){
        int s=q.size();
        while(s-->0){
            Node t=q.poll();
            if(s==0){
                ans.add(t.data);
            }
            if(t.left!=null) q.offer(t.left);
             if(t.right!=null) q.offer(t.right);
        }
    }
       return ans; 
    }
}