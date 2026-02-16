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
    public ArrayList<Integer> leftView(Node root) {
        Queue<Node>q=new LinkedList<>();
        ArrayList<Integer>ans=new ArrayList<>();
        q.offer(root);
       
        while(!q.isEmpty()){
            int s=q.size();
            int c=0;
              while(s-->0){
                  Node t=q.poll();
                  if(c==0){
                  ans.add(t.data);
                  }
                  if(t.left!=null)q.offer(t.left);
                 
                      if(t.right!=null)q.offer(t.right);
                 c++;
              }
           
        } return ans;}
}