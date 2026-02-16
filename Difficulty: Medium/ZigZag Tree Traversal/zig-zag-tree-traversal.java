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
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        
       Queue<Node>q=new LinkedList<>();
       q.offer(root);
       int c=1;
       while(!q.isEmpty()){
           int s=q.size();
               ArrayList<Integer>temp=new ArrayList<>();
           while(s-- >0){
               
               Node t=q.poll();
               temp.add(t.data);
               if(t.left!=null)q.offer(t.left);
               if(t.right!=null)q.offer(t.right);
           }
           if(c%2!=0)ans.add(temp);
           else{
               Collections.reverse(temp);
               ans.add(temp);
           }
           c++;
       }
       ArrayList<Integer>ans1=new ArrayList<>();
       for(ArrayList<Integer> list:ans){
       for(int x:list){
           ans1.add(x);
       }
       }
        return ans1;
    }
}