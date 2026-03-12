/*
class Node {
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
      ArrayList<Integer>ans=new ArrayList<>();
     ArrayList<Integer>temp;
     Queue<Node>q=new LinkedList<>();
     q.offer(root);
     int c=0;
     while(!q.isEmpty()){
         int s=q.size();
         temp=new ArrayList<>();
         c++;
         while(s-->0){
             Node t=q.poll();
             temp.add(t.data);
             if(t.left!=null)q.offer(t.left);
             if(t.right!=null)q.offer(t.right);
         }
         if(c%2==0){
             Collections.reverse(temp);
         }
         for(int x:temp){
             ans.add(x);
         }
     }
        return ans;
    }
}